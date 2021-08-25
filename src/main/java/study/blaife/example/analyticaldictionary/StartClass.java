package study.blaife.example.analyticaldictionary;

import study.blaife.example.analyticaldictionary.entity.CompanyInfo;
import study.blaife.example.analyticaldictionary.util.TransferDictionaryCaption;
import study.blaife.example.analyticaldictionary.util.TransferDictionaryInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: magd39318
 * @Date: 2021/8/2 17:05
 **/
public class StartClass {

    public static void main(String[] args) {
        String[] orderKeyNos = new String[]{"1035","1002"};
        String[] orderKeyValues = new String[]{"companySite","companyNature"};

        // 1. 组装公司信息
        List<CompanyInfo> companyInfoList = new ArrayList<>();
        companyInfoList.add(new CompanyInfo("公司A","JO", "1"));
        companyInfoList.add(new CompanyInfo("公司B","JP", "3"));
        companyInfoList.add(new CompanyInfo("公司C","KG", "2"));
        companyInfoList.add(new CompanyInfo("公司D","KI", "4"));
        companyInfoList.add(new CompanyInfo("公司E","KG", "2"));
        companyInfoList.add(new CompanyInfo("公司F","KI", "1"));
        companyInfoList.add(new CompanyInfo("公司G","JO", "3"));
        companyInfoList.add(new CompanyInfo("公司H","KH", "2"));

        TransferDictionaryInfo<CompanyInfo> transferDictionaryInfo =
                new TransferDictionaryInfo<>(companyInfoList, orderKeyNos, orderKeyValues);
        TransferDictionaryCaption<CompanyInfo> transferDictionaryCaption = new TransferDictionaryCaption<>();
        transferDictionaryCaption.transferKeyToValue(transferDictionaryInfo);

        companyInfoList.stream().forEach(System.out::println);

    }

}
