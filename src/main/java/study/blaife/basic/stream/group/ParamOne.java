package study.blaife.basic.stream.group;

/**
 * @Description:
 * @Author: magd39318
 * @Date: 2021/9/23 14:56
 */
public class ParamOne {
    private String capclearCode;
    private String agencyNo;
    private String productCode;
    private String day;

    public ParamOne(String capclearCode, String agencyNo, String productCode, String day) {
        this.capclearCode = capclearCode;
        this.agencyNo = agencyNo;
        this.productCode = productCode;
        this.day = day;
    }

    public String getCapclearCode() {
        return capclearCode;
    }

    public void setCapclearCode(String capclearCode) {
        this.capclearCode = capclearCode;
    }

    public String getAgencyNo() {
        return agencyNo;
    }

    public void setAgencyNo(String agencyNo) {
        this.agencyNo = agencyNo;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "TaCapitalDate{" +
                "capclearCode='" + capclearCode + '\'' +
                ", agencyNo='" + agencyNo + '\'' +
                ", productCode='" + productCode + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
}
