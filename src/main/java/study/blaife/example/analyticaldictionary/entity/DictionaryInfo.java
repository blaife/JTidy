package study.blaife.example.analyticaldictionary.entity;

/**
 *
 * 字典项基本信息
 *
 * @Author: magd
 * @Date: 2021/8/2 11:30
 **/
public class DictionaryInfo {

    private String keyNo;
    private String keyValue;
    private String caption;

    public String getKeyNo() {
        return keyNo;
    }

    public void setKeyNo(String keyNo) {
        this.keyNo = keyNo;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public DictionaryInfo(String keyNo, String keyValue, String caption) {
        this.keyNo = keyNo;
        this.keyValue = keyValue;
        this.caption = caption;
    }


}
