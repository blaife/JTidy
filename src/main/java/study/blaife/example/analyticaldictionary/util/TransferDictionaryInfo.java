package study.blaife.example.analyticaldictionary.util;

import java.util.List;

/**
 * @Author: magd39318
 * @Date: 2021/8/2 15:50
 **/
public class TransferDictionaryInfo<T> {

    /**
     * 转换实体集合
     */
    private List<T> infoList;

    /**
     * 字典No数组
     */
    private String[] orderKeyNos;

    /**
     * 字典项对应字段数组
     */
    private String[] orderKeyValues;

    public TransferDictionaryInfo(List<T> infoList, String[] orderKeyNos, String[] orderKeyValues) {
        this.infoList = infoList;
        this.orderKeyNos = orderKeyNos;
        this.orderKeyValues = orderKeyValues;
    }

    public List<T> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<T> infoList) {
        this.infoList = infoList;
    }

    public String[] getOrderKeyNos() {
        return orderKeyNos;
    }

    public void setOrderKeyNos(String[] orderKeyNos) {
        this.orderKeyNos = orderKeyNos;
    }

    public String[] getOrderKeyValues() {
        return orderKeyValues;
    }

    public void setOrderKeyValues(String[] orderKeyValues) {
        this.orderKeyValues = orderKeyValues;
    }
}
