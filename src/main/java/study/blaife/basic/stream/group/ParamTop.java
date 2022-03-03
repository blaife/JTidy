package study.blaife.basic.stream.group;

import java.util.Objects;

/**
 * 顶部信息
 * @Author: magd39318
 * @Date: 2021/9/23 15:11
 */
public class ParamTop {

    private String capclearCode;
    private String agencyNo;
    private String productCode;

    public ParamTop(String capclearCode, String agencyNo, String productCode) {
        this.capclearCode = capclearCode;
        this.agencyNo = agencyNo;
        this.productCode = productCode;
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

    @Override
    public String toString() {
        return "TaCapitalDate2{" +
                "capclearCode='" + capclearCode + '\'' +
                ", agencyNo='" + agencyNo + '\'' +
                ", productCode='" + productCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParamTop that = (ParamTop) o;
        return Objects.equals(capclearCode, that.capclearCode) &&
                Objects.equals(agencyNo, that.agencyNo) &&
                Objects.equals(productCode, that.productCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capclearCode, agencyNo, productCode);
    }
}

