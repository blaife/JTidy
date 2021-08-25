package study.blaife.example.analyticaldictionary.util;

import com.sun.deploy.util.StringUtils;
import study.blaife.example.analyticaldictionary.constant.Constant;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @Author: magd39318
 * @Date: 2021/8/2 16:09
 **/
public class TransferDictionaryCaption<T> {

    /**
     * 记录从数据库中查询出的此转换实体所需要的字典项内容
     */
    private Map<String, HashMap<String, String>> dictionaryMap = new HashMap<>();

    /**
     * 转换实体类中的字典字段到解释（CN）字段
     * @param transferDictionaryInfo
     */
    public void transferKeyToValue(TransferDictionaryInfo<T> transferDictionaryInfo) {
        // 1. 根据transferDictionaryInfo中的orderKeyNos获取对应的字典内容,将结果组装到Map中
        buildDictionaryInfo(transferDictionaryInfo.getOrderKeyNos());

        // 2. 将字典值更改到业务数据实体中
        for (T companyInfo : transferDictionaryInfo.getInfoList()) {
            Class<?> companyInfoClass = companyInfo.getClass();
            for (int i = 0; i < transferDictionaryInfo.getOrderKeyNos().length; i++) {
                setKeyCaption(companyInfoClass, companyInfo, transferDictionaryInfo.getOrderKeyNos()[i],
                        transferDictionaryInfo.getOrderKeyValues()[i]);
            }
        }
    }

    /**
     * 通过字典No值从数据库中获取对应的字典项内容
     * @param orderKeyNos 字典No 数组内容
     */
    private void buildDictionaryInfo(String[] orderKeyNos) {

        // 对于字段orderKeyNos，使用它从数据库字典表中查询出对应的数据信息，并组装成dictionaryMap
        // 此次是一个案例的整理，尽量轻量级，使用switch进行模拟

        HashMap<String, String> currentDictionary;

        for (String currentNo : orderKeyNos) {
            currentDictionary = new HashMap<>(16);
            switch (currentNo) {
                case "1035":
                    currentDictionary.put("JO", "约旦");
                    currentDictionary.put("JP", "日本");
                    currentDictionary.put("KE", "肯尼亚");
                    currentDictionary.put("KG", "吉尔吉斯斯坦");
                    currentDictionary.put("KH", "柬埔寨");
                    currentDictionary.put("KI", "基里巴斯");
                    dictionaryMap.put("1035", (HashMap<String, String>) currentDictionary.clone());
                    break;
                case "1002":
                    currentDictionary.put("1", "内资企业");
                    currentDictionary.put("2", "中外合资企业");
                    currentDictionary.put("3", "外资企业");
                    currentDictionary.put("4", "其他");
                    dictionaryMap.put("1002", (HashMap<String, String>) currentDictionary.clone());
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * 汉化字典项，并填入指定字段中
     * @param companyInfoClass 注入值的class对象
     * @param companyInfo 实体对象
     * @param keyNo 字典项No
     * @param fieldName 对应字段名称（字典字段而非字典CN字段）
     */
    private void setKeyCaption(Class<?> companyInfoClass, T companyInfo, String keyNo, String fieldName) {
        try {
            // 通过反射获取其字段
            Field field = companyInfoClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            // 获取对应值
            Object fieldValue = field.get(companyInfo);

            if (fieldValue == null) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();

            // 存在部分字段是用逗号分隔的，所以需要分开汉化
            String[] separatorFieldValues = fieldValue.toString().split(Constant.FIELD_SEPARATOR);

            List<String> caption = new ArrayList<>();
            for (String separatorFieldValue : separatorFieldValues) {
                caption.add(dictionaryMap.get(keyNo).get(separatorFieldValue));
            }
            if (caption.size() == 0) {
                return;
            }
            String endCaption = StringUtils.join(caption, "，");

            Field fieldCN = companyInfoClass.getDeclaredField(fieldName + Constant.FIELD_CN);
            fieldCN.setAccessible(true);
            fieldCN.set(companyInfo, endCaption);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
