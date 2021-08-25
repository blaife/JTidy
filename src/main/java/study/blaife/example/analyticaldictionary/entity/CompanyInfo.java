package study.blaife.example.analyticaldictionary.entity;

/**
 * @Author: magd39318
 * @Date: 2021/8/2 11:30
 **/
public class CompanyInfo {

    private String companyName;
    private String companySite;
    private String companyNature;

    private String companySiteCN;
    private String companyNatureCN;


    public CompanyInfo(String companyName, String companySite, String companyNature) {
        this.companyName = companyName;
        this.companySite = companySite;
        this.companyNature = companyNature;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanySite() {
        return companySite;
    }

    public void setCompanySite(String companySite) {
        this.companySite = companySite;
    }

    public String getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(String companyNature) {
        this.companyNature = companyNature;
    }

    public String getCompanySiteCN() {
        return companySiteCN;
    }

    public void setCompanySiteCN(String companySiteCN) {
        this.companySiteCN = companySiteCN;
    }

    public String getCompanyNatureCN() {
        return companyNatureCN;
    }

    public void setCompanyNatureCN(String companyNatureCN) {
        this.companyNatureCN = companyNatureCN;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "companyName='" + companyName + '\'' +
                ", companySite='" + companySite + '\'' +
                ", companyNature='" + companyNature + '\'' +
                ", companySiteCN='" + companySiteCN + '\'' +
                ", companyNatureCN='" + companyNatureCN + '\'' +
                '}';
    }
}
