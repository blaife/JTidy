package study.blaife.example.fixedlengthfileparsing.entity;

import study.blaife.example.fixedlengthfileparsing.Format;

import java.io.Serializable;

/**
 * 文件实体内容表
 *
 * @author: magd39318
 * @date: 2022/3/31 10:18
 */
public class ProductF1 implements Serializable {

    private static final long serialVersionUID = 7197837706135650950L;

    @Format(value = "销售人代码", length = 9, order = 1)
    private String distributorCode;

    @Format(value = "产品代码", length = 20, order = 2)
    private String fundCode;

    @Format(value = "交易数据下传日期", length = 8, order = 3)
    private String downLoaddate;

    @Format(value = "产品风险等级", length = 1, order = 4)
    private String prdRiskRate;

    @Format(value = "中债产品划分", length = 1, order = 5)
    private String debtFundType;

    @Format(value = "允许销售的中债客户组别", length = 20, order = 6)
    private String allowClientGroup;

    @Format(value = "理财登记编码", length = 20, order = 7)
    private String financialRegistrationCode;

    @Format(value = "销售对象（发售对象）", length = 2, order = 8)
    private String saleObject;

    @Format(value = "是否周期产品", length = 1, order = 9)
    private String isCycleFund;

    @Format(value = "周期天数", length = 4, order = 10)
    private String cycleDays;

    @Format(value = "最长周期数", length = 4, order = 11)
    private String cycleNums;

    @Format(value = "默认期数", length = 4, order = 12)
    private String defCycleNums;

    @Format(value = "违约赎回费率", length = 9, order = 13)
    private String breachOfContractFee;

    @Format(value = "理财产品类型", length = 1, order = 14)
    private String lcFundType;

    @Format(value = "产品募集方式", length = 1, order = 15)
    private String ipoType;

    @Format(value = "投资标的(投资性质)", length = 1, order = 16)
    private String investmentTargets;

    @Format(value = "结算天数", length = 4, order = 17)
    private String clearDays;

    @Format(value = "赎回资金到账天数（结算天数）", length = 5, order = 18)
    private String redeemAmtDays;

    @Format(value = "分红资金到账天数", length = 5, order = 19)
    private String divAmtDays;

    @Format(value = "产品到期资金到账天数", length = 5, order = 20)
    private String fundEndDays;

    @Format(value = "发行失败/比例退款天数", length = 5, order = 21)
    private String fundIssuanceFailDays;

    @Format(value = "钞汇标志", length = 1, order = 22)
    private String cashFlag;

    @Format(value = "产品收益到期日", length = 8, order = 23)
    private String incomeEndDate;

    @Format(value = "产品收益币种", length = 3, order = 24)
    private String incomeCurrType;

    @Format(value = "本金返还币种", length = 3, order = 25)
    private String costCurrType;

    @Format(value = "ChoiceBonusType", length = 2, order = 26)
    private String choiceBonusType;

    @Format(value = "购买（认购）撤单", length = 1, order = 27)
    private String cancelOrderType;

    @Format(value = "单日申购上限", length = 16, order = 28)
    private String buyUpperLimitday;

    @Format(value = "允许部分赎回", length = 1, order = 29)
    private String isPartRedeem;

    @Format(value = "巨额赎回比例", length = 9, order = 30)
    private String largeRedeemRatio;

    @Format(value = "赎回本金返还方式", length = 1, order = 31)
    private String redeemAmtReturn;

    @Format(value = "产品最低募集额", length = 16, order = 32)
    private String fundMinBala;

    @Format(value = "产品最高募集额", length = 16, order = 33)
    private String fundMaXBala;

    @Format(value = "认购帐务模式", length = 1, order = 34)
    private String subscribemode;

    @Format(value = "申购帐务模式", length = 1, order = 35)
    private String purchasemode;

    @Format(value = "实时赎回资金比例", length = 5, order = 36)
    private String realRedeemRatio;

    @Format(value = "当日实时赎回份额上限", length = 16, order = 37)
    private String realRedeemUpperLimitOfDay;

    @Format(value = "单人单日快速赎回上限", length = 16, order = 38)
    private String realRedeemUpperLimitOfSolo;

    @Format(value = "份额计算方式", length = 1, order = 39)
    private String shareDoMethod;

    @Format(value = "对公赎回基数", length = 16, order = 40)
    private String orgRedeemBase;

    @Format(value = "对私赎回基数", length = 16, order = 41)
    private String perRedeemBase;

    @Format(value = "业绩基准", length = 9, order = 42)
    private String comparisonRatio;

    @Format(value = "产品发行人", length = 3, order = 43)
    private String fundIssuer;

    @Format(value = "浮动管理费年化基数", length = 1, order = 44)
    private String managementBasic;

    @Format(value = "超额分层比例", length = 9, order = 45)
    private String excessiveRtio;

    @Format(value = "认购利息年化基础", length = 1, order = 46)
    private String subBasic;

    @Format(value = "认购计息天数", length = 5, order = 47)
    private String subDelayedDays;

    @Format(value = "产品募集账户", length = 32, order = 48)
    private String fundCollectAccount;

    @Format(value = "超额认购比例确认", length = 1, order = 49)
    private String excessiveSubRtio;

    @Format(value = "认购利息利率", length = 9, order = 50)
    private String interestRate;

    @Format(value = "开市时间", length = 6, order = 51)
    private String openTime;

    @Format(value = "闭市时间", length = 6, order = 52)
    private String closeTime;

    @Format(value = "收费方式", length = 1, order = 53)
    private String shareClass;

    @Format(value = "理财产品名称", length = 60, order = 54)
    private String fundName;

    @Format(value = "理财产品简称", length = 20, order = 55)
    private String fundNameAbbr;

    @Format(value = "理财产品类型", length = 2, order = 56)
    private String financeType;

    @Format(value = "理财产品类型名称", length = 30, order = 57)
    private String fundTypeName;

    @Format(value = "是否保本理财", length = 1, order = 58)
    private String isGuaranteedFund;

    @Format(value = "IsLOFFund", length = 1, order = 59)
    private String isLOFFund;

    @Format(value = "IsQDIIFund", length = 1, order = 60)
    private String isQDIIFund;

    @Format(value = "IsETFFund", length = 1, order = 61)
    private String isETFFund;

    @Format(value = "赎回费归理财资产比例", length = 5, order = 62)
    private String lxRedeemFeeBackRatio;

    @Format(value = "默认分红方式", length = 1, order = 63)
    private String defDividendMethod;

    @Format(value = "指定赎回方式", length = 1, order = 64)
    private String redemptionSequence;

    @Format(value = "申购金额上限", length = 16, order = 65)
    private String buyUpperAmount;

    @Format(value = "理财产品转换转入金额", length = 16, order = 66)
    private String covertInUpperAmount;

    @Format(value = "定时定额申购金额上限", length = 16, order = 67)
    private String periodSubUpperAmount;

    @Format(value = "法人追加认购金额", length = 16, order = 68)
    private String instAppSubsAmnt;

    @Format(value = "法人追加认购份数", length = 16, order = 69)
    private String instAppSubsVol;

    @Format(value = "法人首次认购最低金额", length = 16, order = 70)
    private String minAmountByInst;

    @Format(value = "法人首次认购最低份数", length = 16, order = 71)
    private String minVolByInst;

    @Format(value = "结算币种", length = 3, order = 72)
    private String currencyType;

    @Format(value = "托管人代码", length = 3, order = 73)
    private String custodianCode;

    @Format(value = "定时定额申购的金额", length = 16, order = 74)
    private String amountOfPeriodicSubs;

    @Format(value = "定时定额申购日期", length = 8, order = 75)
    private String dateOfPeriodicSubs;

    @Format(value = "理财最高赎回份数", length = 16, order = 76)
    private String maxRedemptionVol;

    @Format(value = "个人理财最低持有份数", length = 16, order = 77)
    private String minAccountBalance;

    @Format(value = "理财产品募集开始日期", length = 8, order = 78)
    private String ipoStartDate;

    @Format(value = "理财产品募集结束日期", length = 8, order = 79)
    private String ipoEndDate;

    @Format(value = "理财产品成立日期", length = 8, order = 80)
    private String fundEstablishDate;

    @Format(value = "理财管理人", length = 3, order = 81)
    private String fundManagerCode;

    @Format(value = "个人追加认购份数", length = 16, order = 82)
    private String indiAppSubsVol;

    @Format(value = "个人追加认购金额", length = 16, order = 83)
    private String indiAppSubsAmount;

    @Format(value = "个人首次认购最低份数", length = 16, order = 84)
    private String minSubsVolByIndi;

    @Format(value = "个人首次认购最低金额", length = 16, order = 85)
    private String minSubsAmountByIndi;

    @Format(value = "注册登记人代码", length = 2, order = 86)
    private String registrarCode;

    @Format(value = "理财产品规模", length = 16, order = 87)
    private String fundSize;

    @Format(value = "交易所标志", length = 1, order = 88)
    private String exchangeFlag;

    @Format(value = "理财发起人", length = 3, order = 89)
    private String fundSponsor;

    @Format(value = "理财产品面值", length = 7, order = 90)
    private String faceValue;

    @Format(value = "个人最高认购份数", length = 16, order = 91)
    private String maxSubsVolByIndi;

    @Format(value = "个人最高认购金额", length = 16, order = 92)
    private String maxSubsAmountByIndi;

    @Format(value = "法人最高认购份数", length = 16, order = 93)
    private String maxSubsVolByInst;

    @Format(value = "法人最高认购金额", length = 16, order = 94)
    private String maxSubsAmountByInst;

    @Format(value = "个人认购份数单位", length = 16, order = 95)
    private String unitSubsVolByIndi;

    @Format(value = "个人认购金额单位", length = 16, order = 96)
    private String unitSubsAmountByIndi;

    @Format(value = "法人认购份数单位", length = 16, order = 97)
    private String unitSubsVolByInst;

    @Format(value = "法人认购金额单位", length = 16, order = 98)
    private String unitSubsAmountByInst;

    @Format(value = "个人首次申购最低金额", length = 16, order = 99)
    private String minBidsAmountByIndi;

    @Format(value = "法人首次申购最低金额", length = 16, order = 100)
    private String minBidsAmountByInst;

    @Format(value = "个人追加申购最低金额", length = 16, order = 101)
    private String minAppBidsAmountByIndi;

    @Format(value = "法人追加申购最低金额", length = 16, order = 102)
    private String minAppBidsAmountByInst;

    @Format(value = "理财最少赎回份数", length = 16, order = 103)
    private String minRedemptionVol;

    @Format(value = "最低理财产品转换份数", length = 16, order = 104)
    private String minInterconvertVol;

    @Format(value = "个人发行方式", length = 1, order = 105)
    private String issueTypeByIndi;

    @Format(value = "机构发行方式", length = 1, order = 106)
    private String issueTypeByInst;

    @Format(value = "认购方式", length = 1, order = 107)
    private String subsType;

    @Format(value = "交易费收取方式", length = 1, order = 108)
    private String collectFeeType;

    @Format(value = "个人最大申购金额", length = 16, order = 109)
    private String indiMaxPurchase;

    @Format(value = "法人最大申购金额", length = 16, order = 110)
    private String instMaxPurchase;

    @Format(value = "个人当日累计购买最大金额", length = 16, order = 111)
    private String indiDayMaxSumBuy;

    @Format(value = "法人当日累计购买最大金额", length = 16, order = 112)
    private String instDayMaxSumBuy;

    @Format(value = "个人当日累计赎回最大份额", length = 16, order = 113)
    private String indiDayMaxSumRedeem;

    @Format(value = "法人当日累计赎回最大份额", length = 16, order = 114)
    private String instDayMaxSumRedeem;

    @Format(value = "个人最大赎回份额", length = 16, order = 115)
    private String indiMaxRedeem;

    @Format(value = "法人最大赎回份额", length = 16, order = 116)
    private String instMaxRedeem;

    @Format(value = "注册登记人名称", length = 40, order = 117)
    private String registrarName;

    @Format(value = "理财管理人名称", length = 40, order = 118)
    private String fundManagerName;

    @Format(value = "基金公司客服电话", length = 30, order = 119)
    private String fundServerTel;

    @Format(value = "基金公司网站网址", length = 40, order = 120)
    private String fundInternetAddress;

    @Format(value = "摘要/说明", length = 60, order = 121)
    private String specification;

    @Format(value = "全量标志", length = 1, order = 122)
    private String wholeFlag;

    @Format(value = "修改方式", length = 1, order = 123)
    private String modifyWay;

    @Format(value = "生效日期", length = 8, order = 124)
    private String operateDate;

    @Format(value = "TA 代码", length = 9, order = 125)
    private String taCode;

    @Format(value = "发行价格", length = 18, order = 126)
    private String issPrice;

    @Format(value = "产品起息日期", length = 8, order = 127)
    private String incomeDate;

    @Format(value = "机构最低持有份额", length = 17, order = 128)
    private String ominAccountBalance;

    @Format(value = "个人单笔最少赎回份额", length = 17, order = 129)
    private String pminRedemptionVol;

    @Format(value = "个人最低产品转换份额", length = 17, order = 130)
    private String pminInterconvertVol;

    @Format(value = "机构单笔最少赎回份额", length = 17, order = 131)
    private String ominRedemptionVol;

    @Format(value = "机构最低产品转换份额", length = 17, order = 132)
    private String ominInterconvertVol;

    @Format(value = "认购隔日撤单标志", length = 1, order = 133)
    private String subcancelFlag;

    @Format(value = "产品收益方式", length = 1, order = 134)
    private String interestWay;

    @Format(value = "收益特征", length = 1, order = 135)
    private String prdProfitKind;

    @Format(value = "是否允许实时赎回", length = 1, order = 136)
    private String isAllowPrdRealTimeRansom;

    @Format(value = "产品计息基数", length = 3, order = 137)
    private String baseDays;

    @Format(value = "交易方式", length = 1, order = 138)
    private String transWay;

    @Format(value = "对应资产池代码", length = 20, order = 139)
    private String parentsPrdCode;

    @Format(value = "产品模板号", length = 9, order = 140)
    private String prdTemplateCode;

    @Format(value = "封闭到期日", length = 8, order = 141)
    private String alimitEndDate;

    @Format(value = "机构赎回单位", length = 10, order = 142)
    private String oredUnit;

    @Format(value = "机构单户累计最大购买金额", length = 17, order = 143)
    private String omaxAccuAmt;

    @Format(value = "个人赎回单位", length = 10, order = 144)
    private String predUnit;

    @Format(value = "个人单户累计最大购买金额", length = 17, order = 145)
    private String pmaxAccuAmt;

    @Format(value = "预期收益率说明/业绩比较基准", length = 60, order = 146)
    private String modelComment;

    @Format(value = "周期清算前N天允许交易", length = 8, order = 147)
    private String dayBeforeCfm;

    @Format(value = "购买确认起息天数", length = 4, order = 148)
    private String buyIsControlConfirmFlag;

    @Format(value = "赎回确认延迟天数", length = 4, order = 149)
    private String redeemIsControlConfirmFlag;

    @Format(value = "是否零认购成立", length = 1, order = 150)
    private String zeroSetUpFlag;

    @Format(value = "额度控制标志", length = 1, order = 151)
    private String limitFlag;

    @Format(value = "折扣率方式", length = 1, order = 152)
    private String agioType;

    @Format(value = "销售商最大限额", length = 17, order = 153)
    private String sellerLimit;

    @Format(value = "锁定期天数", length = 4, order = 154)
    private String lockDays;

    @Format(value = "是否校验合格投资者", length = 1, order = 155)
    private String isCheckInvester;

    @Format(value = "客户周期模式", length = 1, order = 156)
    private String clientCycleMode;

    @Format(value = "最小周期天数", length = 4, order = 157)
    private String minCycleDays;

    @Format(value = "最大周期天数", length = 4, order = 158)
    private String maxCycleDays;

    @Format(value = "周期期限集合", length = 60, order = 159)
    private String cycleAllottedDays;

    @Format(value = "产品申购款过渡户", length = 32, order = 160)
    private String fundBuyAccount;

    @Format(value = "最大持有天数", length = 4, order = 161)
    private String maxLockDays;

    @Format(value = "是否同业客户专属", length = 1, order = 162)
    private String isPeerExclusive;

    @Format(value = "是否允许预约赎回", length = 1, order = 163)
    private String isAllowReRedeem;

    @Format(value = "允许购买人数", length = 10, order = 164)
    private String maxHoldPers;

    @Format(value = "是否允许转让", length = 1, order = 165)
    private String isAllowTransFer;

    @Format(value = "最大预约赎回天数", length = 10, order = 166)
    private String reRedeemDays;

    @Format(value = "是否允许展期", length = 1, order = 167)
    private String isAllowExtend;

    @Format(value = "是否允许违约赎回", length = 1, order = 168)
    private String allowBreachRedempt;

    @Format(value = "定期定额状态", length = 1, order = 169)
    private String periodicStatus;

    @Format(value = "个人累计赎回最大份额", length = 16, order = 170)
    private String indiMaxSumRedeem;

    @Format(value = "机构累计赎回最大份额", length = 16, order = 171)
    private String instMaxSumRedeem;


    public String getDistributorCode() {
        return distributorCode;
    }

    public void setDistributorCode(String distributorCode) {
        this.distributorCode = distributorCode;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getDownLoaddate() {
        return downLoaddate;
    }

    public void setDownLoaddate(String downLoaddate) {
        this.downLoaddate = downLoaddate;
    }

    public String getPrdRiskRate() {
        return prdRiskRate;
    }

    public void setPrdRiskRate(String prdRiskRate) {
        this.prdRiskRate = prdRiskRate;
    }

    public String getDebtFundType() {
        return debtFundType;
    }

    public void setDebtFundType(String debtFundType) {
        this.debtFundType = debtFundType;
    }

    public String getAllowClientGroup() {
        return allowClientGroup;
    }

    public void setAllowClientGroup(String allowClientGroup) {
        this.allowClientGroup = allowClientGroup;
    }

    public String getFinancialRegistrationCode() {
        return financialRegistrationCode;
    }

    public void setFinancialRegistrationCode(String financialRegistrationCode) {
        this.financialRegistrationCode = financialRegistrationCode;
    }

    public String getSaleObject() {
        return saleObject;
    }

    public void setSaleObject(String saleObject) {
        this.saleObject = saleObject;
    }

    public String getIsCycleFund() {
        return isCycleFund;
    }

    public void setIsCycleFund(String isCycleFund) {
        this.isCycleFund = isCycleFund;
    }

    public String getCycleDays() {
        return cycleDays;
    }

    public void setCycleDays(String cycleDays) {
        this.cycleDays = cycleDays;
    }

    public String getCycleNums() {
        return cycleNums;
    }

    public void setCycleNums(String cycleNums) {
        this.cycleNums = cycleNums;
    }

    public String getDefCycleNums() {
        return defCycleNums;
    }

    public void setDefCycleNums(String defCycleNums) {
        this.defCycleNums = defCycleNums;
    }

    public String getBreachOfContractFee() {
        return breachOfContractFee;
    }

    public void setBreachOfContractFee(String breachOfContractFee) {
        this.breachOfContractFee = breachOfContractFee;
    }

    public String getLcFundType() {
        return lcFundType;
    }

    public void setLcFundType(String lcFundType) {
        this.lcFundType = lcFundType;
    }

    public String getIpoType() {
        return ipoType;
    }

    public void setIpoType(String ipoType) {
        this.ipoType = ipoType;
    }

    public String getInvestmentTargets() {
        return investmentTargets;
    }

    public void setInvestmentTargets(String investmentTargets) {
        this.investmentTargets = investmentTargets;
    }

    public String getClearDays() {
        return clearDays;
    }

    public void setClearDays(String clearDays) {
        this.clearDays = clearDays;
    }

    public String getRedeemAmtDays() {
        return redeemAmtDays;
    }

    public void setRedeemAmtDays(String redeemAmtDays) {
        this.redeemAmtDays = redeemAmtDays;
    }

    public String getDivAmtDays() {
        return divAmtDays;
    }

    public void setDivAmtDays(String divAmtDays) {
        this.divAmtDays = divAmtDays;
    }

    public String getFundEndDays() {
        return fundEndDays;
    }

    public void setFundEndDays(String fundEndDays) {
        this.fundEndDays = fundEndDays;
    }

    public String getFundIssuanceFailDays() {
        return fundIssuanceFailDays;
    }

    public void setFundIssuanceFailDays(String fundIssuanceFailDays) {
        this.fundIssuanceFailDays = fundIssuanceFailDays;
    }

    public String getCashFlag() {
        return cashFlag;
    }

    public void setCashFlag(String cashFlag) {
        this.cashFlag = cashFlag;
    }

    public String getIncomeEndDate() {
        return incomeEndDate;
    }

    public void setIncomeEndDate(String incomeEndDate) {
        this.incomeEndDate = incomeEndDate;
    }

    public String getIncomeCurrType() {
        return incomeCurrType;
    }

    public void setIncomeCurrType(String incomeCurrType) {
        this.incomeCurrType = incomeCurrType;
    }

    public String getCostCurrType() {
        return costCurrType;
    }

    public void setCostCurrType(String costCurrType) {
        this.costCurrType = costCurrType;
    }

    public String getChoiceBonusType() {
        return choiceBonusType;
    }

    public void setChoiceBonusType(String choiceBonusType) {
        this.choiceBonusType = choiceBonusType;
    }

    public String getCancelOrderType() {
        return cancelOrderType;
    }

    public void setCancelOrderType(String cancelOrderType) {
        this.cancelOrderType = cancelOrderType;
    }

    public String getBuyUpperLimitday() {
        return buyUpperLimitday;
    }

    public void setBuyUpperLimitday(String buyUpperLimitday) {
        this.buyUpperLimitday = buyUpperLimitday;
    }

    public String getIsPartRedeem() {
        return isPartRedeem;
    }

    public void setIsPartRedeem(String isPartRedeem) {
        this.isPartRedeem = isPartRedeem;
    }

    public String getLargeRedeemRatio() {
        return largeRedeemRatio;
    }

    public void setLargeRedeemRatio(String largeRedeemRatio) {
        this.largeRedeemRatio = largeRedeemRatio;
    }

    public String getRedeemAmtReturn() {
        return redeemAmtReturn;
    }

    public void setRedeemAmtReturn(String redeemAmtReturn) {
        this.redeemAmtReturn = redeemAmtReturn;
    }

    public String getFundMinBala() {
        return fundMinBala;
    }

    public void setFundMinBala(String fundMinBala) {
        this.fundMinBala = fundMinBala;
    }

    public String getFundMaXBala() {
        return fundMaXBala;
    }

    public void setFundMaXBala(String fundMaXBala) {
        this.fundMaXBala = fundMaXBala;
    }

    public String getSubscribemode() {
        return subscribemode;
    }

    public void setSubscribemode(String subscribemode) {
        this.subscribemode = subscribemode;
    }

    public String getPurchasemode() {
        return purchasemode;
    }

    public void setPurchasemode(String purchasemode) {
        this.purchasemode = purchasemode;
    }

    public String getRealRedeemRatio() {
        return realRedeemRatio;
    }

    public void setRealRedeemRatio(String realRedeemRatio) {
        this.realRedeemRatio = realRedeemRatio;
    }

    public String getRealRedeemUpperLimitOfDay() {
        return realRedeemUpperLimitOfDay;
    }

    public void setRealRedeemUpperLimitOfDay(String realRedeemUpperLimitOfDay) {
        this.realRedeemUpperLimitOfDay = realRedeemUpperLimitOfDay;
    }

    public String getRealRedeemUpperLimitOfSolo() {
        return realRedeemUpperLimitOfSolo;
    }

    public void setRealRedeemUpperLimitOfSolo(String realRedeemUpperLimitOfSolo) {
        this.realRedeemUpperLimitOfSolo = realRedeemUpperLimitOfSolo;
    }

    public String getShareDoMethod() {
        return shareDoMethod;
    }

    public void setShareDoMethod(String shareDoMethod) {
        this.shareDoMethod = shareDoMethod;
    }

    public String getOrgRedeemBase() {
        return orgRedeemBase;
    }

    public void setOrgRedeemBase(String orgRedeemBase) {
        this.orgRedeemBase = orgRedeemBase;
    }

    public String getPerRedeemBase() {
        return perRedeemBase;
    }

    public void setPerRedeemBase(String perRedeemBase) {
        this.perRedeemBase = perRedeemBase;
    }

    public String getComparisonRatio() {
        return comparisonRatio;
    }

    public void setComparisonRatio(String comparisonRatio) {
        this.comparisonRatio = comparisonRatio;
    }

    public String getFundIssuer() {
        return fundIssuer;
    }

    public void setFundIssuer(String fundIssuer) {
        this.fundIssuer = fundIssuer;
    }

    public String getManagementBasic() {
        return managementBasic;
    }

    public void setManagementBasic(String managementBasic) {
        this.managementBasic = managementBasic;
    }

    public String getExcessiveRtio() {
        return excessiveRtio;
    }

    public void setExcessiveRtio(String excessiveRtio) {
        this.excessiveRtio = excessiveRtio;
    }

    public String getSubBasic() {
        return subBasic;
    }

    public void setSubBasic(String subBasic) {
        this.subBasic = subBasic;
    }

    public String getSubDelayedDays() {
        return subDelayedDays;
    }

    public void setSubDelayedDays(String subDelayedDays) {
        this.subDelayedDays = subDelayedDays;
    }

    public String getFundCollectAccount() {
        return fundCollectAccount;
    }

    public void setFundCollectAccount(String fundCollectAccount) {
        this.fundCollectAccount = fundCollectAccount;
    }

    public String getExcessiveSubRtio() {
        return excessiveSubRtio;
    }

    public void setExcessiveSubRtio(String excessiveSubRtio) {
        this.excessiveSubRtio = excessiveSubRtio;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getShareClass() {
        return shareClass;
    }

    public void setShareClass(String shareClass) {
        this.shareClass = shareClass;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundNameAbbr() {
        return fundNameAbbr;
    }

    public void setFundNameAbbr(String fundNameAbbr) {
        this.fundNameAbbr = fundNameAbbr;
    }

    public String getFinanceType() {
        return financeType;
    }

    public void setFinanceType(String financeType) {
        this.financeType = financeType;
    }

    public String getFundTypeName() {
        return fundTypeName;
    }

    public void setFundTypeName(String fundTypeName) {
        this.fundTypeName = fundTypeName;
    }

    public String getIsGuaranteedFund() {
        return isGuaranteedFund;
    }

    public void setIsGuaranteedFund(String isGuaranteedFund) {
        this.isGuaranteedFund = isGuaranteedFund;
    }

    public String getIsLOFFund() {
        return isLOFFund;
    }

    public void setIsLOFFund(String isLOFFund) {
        this.isLOFFund = isLOFFund;
    }

    public String getIsQDIIFund() {
        return isQDIIFund;
    }

    public void setIsQDIIFund(String isQDIIFund) {
        this.isQDIIFund = isQDIIFund;
    }

    public String getIsETFFund() {
        return isETFFund;
    }

    public void setIsETFFund(String isETFFund) {
        this.isETFFund = isETFFund;
    }

    public String getLxRedeemFeeBackRatio() {
        return lxRedeemFeeBackRatio;
    }

    public void setLxRedeemFeeBackRatio(String lxRedeemFeeBackRatio) {
        this.lxRedeemFeeBackRatio = lxRedeemFeeBackRatio;
    }

    public String getDefDividendMethod() {
        return defDividendMethod;
    }

    public void setDefDividendMethod(String defDividendMethod) {
        this.defDividendMethod = defDividendMethod;
    }

    public String getRedemptionSequence() {
        return redemptionSequence;
    }

    public void setRedemptionSequence(String redemptionSequence) {
        this.redemptionSequence = redemptionSequence;
    }

    public String getBuyUpperAmount() {
        return buyUpperAmount;
    }

    public void setBuyUpperAmount(String buyUpperAmount) {
        this.buyUpperAmount = buyUpperAmount;
    }

    public String getCovertInUpperAmount() {
        return covertInUpperAmount;
    }

    public void setCovertInUpperAmount(String covertInUpperAmount) {
        this.covertInUpperAmount = covertInUpperAmount;
    }

    public String getPeriodSubUpperAmount() {
        return periodSubUpperAmount;
    }

    public void setPeriodSubUpperAmount(String periodSubUpperAmount) {
        this.periodSubUpperAmount = periodSubUpperAmount;
    }

    public String getInstAppSubsAmnt() {
        return instAppSubsAmnt;
    }

    public void setInstAppSubsAmnt(String instAppSubsAmnt) {
        this.instAppSubsAmnt = instAppSubsAmnt;
    }

    public String getInstAppSubsVol() {
        return instAppSubsVol;
    }

    public void setInstAppSubsVol(String instAppSubsVol) {
        this.instAppSubsVol = instAppSubsVol;
    }

    public String getMinAmountByInst() {
        return minAmountByInst;
    }

    public void setMinAmountByInst(String minAmountByInst) {
        this.minAmountByInst = minAmountByInst;
    }

    public String getMinVolByInst() {
        return minVolByInst;
    }

    public void setMinVolByInst(String minVolByInst) {
        this.minVolByInst = minVolByInst;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public String getCustodianCode() {
        return custodianCode;
    }

    public void setCustodianCode(String custodianCode) {
        this.custodianCode = custodianCode;
    }

    public String getAmountOfPeriodicSubs() {
        return amountOfPeriodicSubs;
    }

    public void setAmountOfPeriodicSubs(String amountOfPeriodicSubs) {
        this.amountOfPeriodicSubs = amountOfPeriodicSubs;
    }

    public String getDateOfPeriodicSubs() {
        return dateOfPeriodicSubs;
    }

    public void setDateOfPeriodicSubs(String dateOfPeriodicSubs) {
        this.dateOfPeriodicSubs = dateOfPeriodicSubs;
    }

    public String getMaxRedemptionVol() {
        return maxRedemptionVol;
    }

    public void setMaxRedemptionVol(String maxRedemptionVol) {
        this.maxRedemptionVol = maxRedemptionVol;
    }

    public String getMinAccountBalance() {
        return minAccountBalance;
    }

    public void setMinAccountBalance(String minAccountBalance) {
        this.minAccountBalance = minAccountBalance;
    }

    public String getIpoStartDate() {
        return ipoStartDate;
    }

    public void setIpoStartDate(String ipoStartDate) {
        this.ipoStartDate = ipoStartDate;
    }

    public String getIpoEndDate() {
        return ipoEndDate;
    }

    public void setIpoEndDate(String ipoEndDate) {
        this.ipoEndDate = ipoEndDate;
    }

    public String getFundEstablishDate() {
        return fundEstablishDate;
    }

    public void setFundEstablishDate(String fundEstablishDate) {
        this.fundEstablishDate = fundEstablishDate;
    }

    public String getFundManagerCode() {
        return fundManagerCode;
    }

    public void setFundManagerCode(String fundManagerCode) {
        this.fundManagerCode = fundManagerCode;
    }

    public String getIndiAppSubsVol() {
        return indiAppSubsVol;
    }

    public void setIndiAppSubsVol(String indiAppSubsVol) {
        this.indiAppSubsVol = indiAppSubsVol;
    }

    public String getIndiAppSubsAmount() {
        return indiAppSubsAmount;
    }

    public void setIndiAppSubsAmount(String indiAppSubsAmount) {
        this.indiAppSubsAmount = indiAppSubsAmount;
    }

    public String getMinSubsVolByIndi() {
        return minSubsVolByIndi;
    }

    public void setMinSubsVolByIndi(String minSubsVolByIndi) {
        this.minSubsVolByIndi = minSubsVolByIndi;
    }

    public String getMinSubsAmountByIndi() {
        return minSubsAmountByIndi;
    }

    public void setMinSubsAmountByIndi(String minSubsAmountByIndi) {
        this.minSubsAmountByIndi = minSubsAmountByIndi;
    }

    public String getRegistrarCode() {
        return registrarCode;
    }

    public void setRegistrarCode(String registrarCode) {
        this.registrarCode = registrarCode;
    }

    public String getFundSize() {
        return fundSize;
    }

    public void setFundSize(String fundSize) {
        this.fundSize = fundSize;
    }

    public String getExchangeFlag() {
        return exchangeFlag;
    }

    public void setExchangeFlag(String exchangeFlag) {
        this.exchangeFlag = exchangeFlag;
    }

    public String getFundSponsor() {
        return fundSponsor;
    }

    public void setFundSponsor(String fundSponsor) {
        this.fundSponsor = fundSponsor;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    public String getMaxSubsVolByIndi() {
        return maxSubsVolByIndi;
    }

    public void setMaxSubsVolByIndi(String maxSubsVolByIndi) {
        this.maxSubsVolByIndi = maxSubsVolByIndi;
    }

    public String getMaxSubsAmountByIndi() {
        return maxSubsAmountByIndi;
    }

    public void setMaxSubsAmountByIndi(String maxSubsAmountByIndi) {
        this.maxSubsAmountByIndi = maxSubsAmountByIndi;
    }

    public String getMaxSubsVolByInst() {
        return maxSubsVolByInst;
    }

    public void setMaxSubsVolByInst(String maxSubsVolByInst) {
        this.maxSubsVolByInst = maxSubsVolByInst;
    }

    public String getMaxSubsAmountByInst() {
        return maxSubsAmountByInst;
    }

    public void setMaxSubsAmountByInst(String maxSubsAmountByInst) {
        this.maxSubsAmountByInst = maxSubsAmountByInst;
    }

    public String getUnitSubsVolByIndi() {
        return unitSubsVolByIndi;
    }

    public void setUnitSubsVolByIndi(String unitSubsVolByIndi) {
        this.unitSubsVolByIndi = unitSubsVolByIndi;
    }

    public String getUnitSubsAmountByIndi() {
        return unitSubsAmountByIndi;
    }

    public void setUnitSubsAmountByIndi(String unitSubsAmountByIndi) {
        this.unitSubsAmountByIndi = unitSubsAmountByIndi;
    }

    public String getUnitSubsVolByInst() {
        return unitSubsVolByInst;
    }

    public void setUnitSubsVolByInst(String unitSubsVolByInst) {
        this.unitSubsVolByInst = unitSubsVolByInst;
    }

    public String getUnitSubsAmountByInst() {
        return unitSubsAmountByInst;
    }

    public void setUnitSubsAmountByInst(String unitSubsAmountByInst) {
        this.unitSubsAmountByInst = unitSubsAmountByInst;
    }

    public String getMinBidsAmountByIndi() {
        return minBidsAmountByIndi;
    }

    public void setMinBidsAmountByIndi(String minBidsAmountByIndi) {
        this.minBidsAmountByIndi = minBidsAmountByIndi;
    }

    public String getMinBidsAmountByInst() {
        return minBidsAmountByInst;
    }

    public void setMinBidsAmountByInst(String minBidsAmountByInst) {
        this.minBidsAmountByInst = minBidsAmountByInst;
    }

    public String getMinAppBidsAmountByIndi() {
        return minAppBidsAmountByIndi;
    }

    public void setMinAppBidsAmountByIndi(String minAppBidsAmountByIndi) {
        this.minAppBidsAmountByIndi = minAppBidsAmountByIndi;
    }

    public String getMinAppBidsAmountByInst() {
        return minAppBidsAmountByInst;
    }

    public void setMinAppBidsAmountByInst(String minAppBidsAmountByInst) {
        this.minAppBidsAmountByInst = minAppBidsAmountByInst;
    }

    public String getMinRedemptionVol() {
        return minRedemptionVol;
    }

    public void setMinRedemptionVol(String minRedemptionVol) {
        this.minRedemptionVol = minRedemptionVol;
    }

    public String getMinInterconvertVol() {
        return minInterconvertVol;
    }

    public void setMinInterconvertVol(String minInterconvertVol) {
        this.minInterconvertVol = minInterconvertVol;
    }

    public String getIssueTypeByIndi() {
        return issueTypeByIndi;
    }

    public void setIssueTypeByIndi(String issueTypeByIndi) {
        this.issueTypeByIndi = issueTypeByIndi;
    }

    public String getIssueTypeByInst() {
        return issueTypeByInst;
    }

    public void setIssueTypeByInst(String issueTypeByInst) {
        this.issueTypeByInst = issueTypeByInst;
    }

    public String getSubsType() {
        return subsType;
    }

    public void setSubsType(String subsType) {
        this.subsType = subsType;
    }

    public String getCollectFeeType() {
        return collectFeeType;
    }

    public void setCollectFeeType(String collectFeeType) {
        this.collectFeeType = collectFeeType;
    }

    public String getIndiMaxPurchase() {
        return indiMaxPurchase;
    }

    public void setIndiMaxPurchase(String indiMaxPurchase) {
        this.indiMaxPurchase = indiMaxPurchase;
    }

    public String getInstMaxPurchase() {
        return instMaxPurchase;
    }

    public void setInstMaxPurchase(String instMaxPurchase) {
        this.instMaxPurchase = instMaxPurchase;
    }

    public String getIndiDayMaxSumBuy() {
        return indiDayMaxSumBuy;
    }

    public void setIndiDayMaxSumBuy(String indiDayMaxSumBuy) {
        this.indiDayMaxSumBuy = indiDayMaxSumBuy;
    }

    public String getInstDayMaxSumBuy() {
        return instDayMaxSumBuy;
    }

    public void setInstDayMaxSumBuy(String instDayMaxSumBuy) {
        this.instDayMaxSumBuy = instDayMaxSumBuy;
    }

    public String getIndiDayMaxSumRedeem() {
        return indiDayMaxSumRedeem;
    }

    public void setIndiDayMaxSumRedeem(String indiDayMaxSumRedeem) {
        this.indiDayMaxSumRedeem = indiDayMaxSumRedeem;
    }

    public String getInstDayMaxSumRedeem() {
        return instDayMaxSumRedeem;
    }

    public void setInstDayMaxSumRedeem(String instDayMaxSumRedeem) {
        this.instDayMaxSumRedeem = instDayMaxSumRedeem;
    }

    public String getIndiMaxRedeem() {
        return indiMaxRedeem;
    }

    public void setIndiMaxRedeem(String indiMaxRedeem) {
        this.indiMaxRedeem = indiMaxRedeem;
    }

    public String getInstMaxRedeem() {
        return instMaxRedeem;
    }

    public void setInstMaxRedeem(String instMaxRedeem) {
        this.instMaxRedeem = instMaxRedeem;
    }

    public String getRegistrarName() {
        return registrarName;
    }

    public void setRegistrarName(String registrarName) {
        this.registrarName = registrarName;
    }

    public String getFundManagerName() {
        return fundManagerName;
    }

    public void setFundManagerName(String fundManagerName) {
        this.fundManagerName = fundManagerName;
    }

    public String getFundServerTel() {
        return fundServerTel;
    }

    public void setFundServerTel(String fundServerTel) {
        this.fundServerTel = fundServerTel;
    }

    public String getFundInternetAddress() {
        return fundInternetAddress;
    }

    public void setFundInternetAddress(String fundInternetAddress) {
        this.fundInternetAddress = fundInternetAddress;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getWholeFlag() {
        return wholeFlag;
    }

    public void setWholeFlag(String wholeFlag) {
        this.wholeFlag = wholeFlag;
    }

    public String getModifyWay() {
        return modifyWay;
    }

    public void setModifyWay(String modifyWay) {
        this.modifyWay = modifyWay;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public String getTaCode() {
        return taCode;
    }

    public void setTaCode(String taCode) {
        this.taCode = taCode;
    }

    public String getIssPrice() {
        return issPrice;
    }

    public void setIssPrice(String issPrice) {
        this.issPrice = issPrice;
    }

    public String getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(String incomeDate) {
        this.incomeDate = incomeDate;
    }


    public String getSubcancelFlag() {
        return subcancelFlag;
    }

    public void setSubcancelFlag(String subcancelFlag) {
        this.subcancelFlag = subcancelFlag;
    }

    public String getInterestWay() {
        return interestWay;
    }

    public void setInterestWay(String interestWay) {
        this.interestWay = interestWay;
    }

    public String getPrdProfitKind() {
        return prdProfitKind;
    }

    public void setPrdProfitKind(String prdProfitKind) {
        this.prdProfitKind = prdProfitKind;
    }

    public String getIsAllowPrdRealTimeRansom() {
        return isAllowPrdRealTimeRansom;
    }

    public void setIsAllowPrdRealTimeRansom(String isAllowPrdRealTimeRansom) {
        this.isAllowPrdRealTimeRansom = isAllowPrdRealTimeRansom;
    }

    public String getBaseDays() {
        return baseDays;
    }

    public void setBaseDays(String baseDays) {
        this.baseDays = baseDays;
    }

    public String getTransWay() {
        return transWay;
    }

    public void setTransWay(String transWay) {
        this.transWay = transWay;
    }

    public String getParentsPrdCode() {
        return parentsPrdCode;
    }

    public void setParentsPrdCode(String parentsPrdCode) {
        this.parentsPrdCode = parentsPrdCode;
    }

    public String getPrdTemplateCode() {
        return prdTemplateCode;
    }

    public void setPrdTemplateCode(String prdTemplateCode) {
        this.prdTemplateCode = prdTemplateCode;
    }

    public String getAlimitEndDate() {
        return alimitEndDate;
    }

    public void setAlimitEndDate(String alimitEndDate) {
        this.alimitEndDate = alimitEndDate;
    }

    public String getOminAccountBalance() {
        return ominAccountBalance;
    }

    public void setOminAccountBalance(String ominAccountBalance) {
        this.ominAccountBalance = ominAccountBalance;
    }

    public String getPminRedemptionVol() {
        return pminRedemptionVol;
    }

    public void setPminRedemptionVol(String pminRedemptionVol) {
        this.pminRedemptionVol = pminRedemptionVol;
    }

    public String getPminInterconvertVol() {
        return pminInterconvertVol;
    }

    public void setPminInterconvertVol(String pminInterconvertVol) {
        this.pminInterconvertVol = pminInterconvertVol;
    }

    public String getOminRedemptionVol() {
        return ominRedemptionVol;
    }

    public void setOminRedemptionVol(String ominRedemptionVol) {
        this.ominRedemptionVol = ominRedemptionVol;
    }

    public String getOminInterconvertVol() {
        return ominInterconvertVol;
    }

    public void setOminInterconvertVol(String ominInterconvertVol) {
        this.ominInterconvertVol = ominInterconvertVol;
    }

    public String getOredUnit() {
        return oredUnit;
    }

    public void setOredUnit(String oredUnit) {
        this.oredUnit = oredUnit;
    }

    public String getOmaxAccuAmt() {
        return omaxAccuAmt;
    }

    public void setOmaxAccuAmt(String omaxAccuAmt) {
        this.omaxAccuAmt = omaxAccuAmt;
    }

    public String getPredUnit() {
        return predUnit;
    }

    public void setPredUnit(String predUnit) {
        this.predUnit = predUnit;
    }

    public String getPmaxAccuAmt() {
        return pmaxAccuAmt;
    }

    public void setPmaxAccuAmt(String pmaxAccuAmt) {
        this.pmaxAccuAmt = pmaxAccuAmt;
    }

    public String getModelComment() {
        return modelComment;
    }

    public void setModelComment(String modelComment) {
        this.modelComment = modelComment;
    }

    public String getDayBeforeCfm() {
        return dayBeforeCfm;
    }

    public void setDayBeforeCfm(String dayBeforeCfm) {
        this.dayBeforeCfm = dayBeforeCfm;
    }

    public String getBuyIsControlConfirmFlag() {
        return buyIsControlConfirmFlag;
    }

    public void setBuyIsControlConfirmFlag(String buyIsControlConfirmFlag) {
        this.buyIsControlConfirmFlag = buyIsControlConfirmFlag;
    }

    public String getRedeemIsControlConfirmFlag() {
        return redeemIsControlConfirmFlag;
    }

    public void setRedeemIsControlConfirmFlag(String redeemIsControlConfirmFlag) {
        this.redeemIsControlConfirmFlag = redeemIsControlConfirmFlag;
    }

    public String getZeroSetUpFlag() {
        return zeroSetUpFlag;
    }

    public void setZeroSetUpFlag(String zeroSetUpFlag) {
        this.zeroSetUpFlag = zeroSetUpFlag;
    }

    public String getLimitFlag() {
        return limitFlag;
    }

    public void setLimitFlag(String limitFlag) {
        this.limitFlag = limitFlag;
    }

    public String getAgioType() {
        return agioType;
    }

    public void setAgioType(String agioType) {
        this.agioType = agioType;
    }

    public String getSellerLimit() {
        return sellerLimit;
    }

    public void setSellerLimit(String sellerLimit) {
        this.sellerLimit = sellerLimit;
    }

    public String getLockDays() {
        return lockDays;
    }

    public void setLockDays(String lockDays) {
        this.lockDays = lockDays;
    }

    public String getIsCheckInvester() {
        return isCheckInvester;
    }

    public void setIsCheckInvester(String isCheckInvester) {
        this.isCheckInvester = isCheckInvester;
    }

    public String getClientCycleMode() {
        return clientCycleMode;
    }

    public void setClientCycleMode(String clientCycleMode) {
        this.clientCycleMode = clientCycleMode;
    }

    public String getMinCycleDays() {
        return minCycleDays;
    }

    public void setMinCycleDays(String minCycleDays) {
        this.minCycleDays = minCycleDays;
    }

    public String getMaxCycleDays() {
        return maxCycleDays;
    }

    public void setMaxCycleDays(String maxCycleDays) {
        this.maxCycleDays = maxCycleDays;
    }

    public String getCycleAllottedDays() {
        return cycleAllottedDays;
    }

    public void setCycleAllottedDays(String cycleAllottedDays) {
        this.cycleAllottedDays = cycleAllottedDays;
    }

    public String getFundBuyAccount() {
        return fundBuyAccount;
    }

    public void setFundBuyAccount(String fundBuyAccount) {
        this.fundBuyAccount = fundBuyAccount;
    }

    public String getMaxLockDays() {
        return maxLockDays;
    }

    public void setMaxLockDays(String maxLockDays) {
        this.maxLockDays = maxLockDays;
    }

    public String getIsPeerExclusive() {
        return isPeerExclusive;
    }

    public void setIsPeerExclusive(String isPeerExclusive) {
        this.isPeerExclusive = isPeerExclusive;
    }

    public String getIsAllowReRedeem() {
        return isAllowReRedeem;
    }

    public void setIsAllowReRedeem(String isAllowReRedeem) {
        this.isAllowReRedeem = isAllowReRedeem;
    }

    public String getMaxHoldPers() {
        return maxHoldPers;
    }

    public void setMaxHoldPers(String maxHoldPers) {
        this.maxHoldPers = maxHoldPers;
    }

    public String getIsAllowTransFer() {
        return isAllowTransFer;
    }

    public void setIsAllowTransFer(String isAllowTransFer) {
        this.isAllowTransFer = isAllowTransFer;
    }

    public String getReRedeemDays() {
        return reRedeemDays;
    }

    public void setReRedeemDays(String reRedeemDays) {
        this.reRedeemDays = reRedeemDays;
    }

    public String getIsAllowExtend() {
        return isAllowExtend;
    }

    public void setIsAllowExtend(String isAllowExtend) {
        this.isAllowExtend = isAllowExtend;
    }

    public String getAllowBreachRedempt() {
        return allowBreachRedempt;
    }

    public void setAllowBreachRedempt(String allowBreachRedempt) {
        this.allowBreachRedempt = allowBreachRedempt;
    }

    public String getPeriodicStatus() {
        return periodicStatus;
    }

    public void setPeriodicStatus(String periodicStatus) {
        this.periodicStatus = periodicStatus;
    }

    public String getIndiMaxSumRedeem() {
        return indiMaxSumRedeem;
    }

    public void setIndiMaxSumRedeem(String indiMaxSumRedeem) {
        this.indiMaxSumRedeem = indiMaxSumRedeem;
    }

    public String getInstMaxSumRedeem() {
        return instMaxSumRedeem;
    }

    public void setInstMaxSumRedeem(String instMaxSumRedeem) {
        this.instMaxSumRedeem = instMaxSumRedeem;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductF1{");
        sb.append("distributorCode='").append(distributorCode).append("\'\n");
        sb.append(", fundCode='").append(fundCode).append("\'\n");
        sb.append(", downLoaddate='").append(downLoaddate).append("\'\n");
        sb.append(", prdRiskRate='").append(prdRiskRate).append("\'\n");
        sb.append(", debtFundType='").append(debtFundType).append("\'\n");
        sb.append(", allowClientGroup='").append(allowClientGroup).append("\'\n");
        sb.append(", financialRegistrationCode='").append(financialRegistrationCode).append("\'\n");
        sb.append(", saleObject='").append(saleObject).append("\'\n");
        sb.append(", isCycleFund='").append(isCycleFund).append("\'\n");
        sb.append(", cycleDays='").append(cycleDays).append("\'\n");
        sb.append(", cycleNums='").append(cycleNums).append("\'\n");
        sb.append(", defCycleNums='").append(defCycleNums).append("\'\n");
        sb.append(", breachOfContractFee='").append(breachOfContractFee).append("\'\n");
        sb.append(", lcFundType='").append(lcFundType).append("\'\n");
        sb.append(", ipoType='").append(ipoType).append("\'\n");
        sb.append(", investmentTargets='").append(investmentTargets).append("\'\n");
        sb.append(", clearDays='").append(clearDays).append("\'\n");
        sb.append(", redeemAmtDays='").append(redeemAmtDays).append("\'\n");
        sb.append(", divAmtDays='").append(divAmtDays).append("\'\n");
        sb.append(", fundEndDays='").append(fundEndDays).append("\'\n");
        sb.append(", fundIssuanceFailDays='").append(fundIssuanceFailDays).append("\'\n");
        sb.append(", cashFlag='").append(cashFlag).append("\'\n");
        sb.append(", incomeEndDate='").append(incomeEndDate).append("\'\n");
        sb.append(", incomeCurrType='").append(incomeCurrType).append("\'\n");
        sb.append(", costCurrType='").append(costCurrType).append("\'\n");
        sb.append(", choiceBonusType='").append(choiceBonusType).append("\'\n");
        sb.append(", cancelOrderType='").append(cancelOrderType).append("\'\n");
        sb.append(", buyUpperLimitday='").append(buyUpperLimitday).append("\'\n");
        sb.append(", isPartRedeem='").append(isPartRedeem).append("\'\n");
        sb.append(", largeRedeemRatio='").append(largeRedeemRatio).append("\'\n");
        sb.append(", redeemAmtReturn='").append(redeemAmtReturn).append("\'\n");
        sb.append(", fundMinBala='").append(fundMinBala).append("\'\n");
        sb.append(", fundMaXBala='").append(fundMaXBala).append("\'\n");
        sb.append(", subscribemode='").append(subscribemode).append("\'\n");
        sb.append(", purchasemode='").append(purchasemode).append("\'\n");
        sb.append(", realRedeemRatio='").append(realRedeemRatio).append("\'\n");
        sb.append(", realRedeemUpperLimitOfDay='").append(realRedeemUpperLimitOfDay).append("\'\n");
        sb.append(", realRedeemUpperLimitOfSolo='").append(realRedeemUpperLimitOfSolo).append("\'\n");
        sb.append(", shareDoMethod='").append(shareDoMethod).append("\'\n");
        sb.append(", orgRedeemBase='").append(orgRedeemBase).append("\'\n");
        sb.append(", perRedeemBase='").append(perRedeemBase).append("\'\n");
        sb.append(", comparisonRatio='").append(comparisonRatio).append("\'\n");
        sb.append(", fundIssuer='").append(fundIssuer).append("\'\n");
        sb.append(", managementBasic='").append(managementBasic).append("\'\n");
        sb.append(", excessiveRtio='").append(excessiveRtio).append("\'\n");
        sb.append(", subBasic='").append(subBasic).append("\'\n");
        sb.append(", subDelayedDays='").append(subDelayedDays).append("\'\n");
        sb.append(", fundCollectAccount='").append(fundCollectAccount).append("\'\n");
        sb.append(", excessiveSubRtio='").append(excessiveSubRtio).append("\'\n");
        sb.append(", interestRate='").append(interestRate).append("\'\n");
        sb.append(", openTime='").append(openTime).append("\'\n");
        sb.append(", closeTime='").append(closeTime).append("\'\n");
        sb.append(", shareClass='").append(shareClass).append("\'\n");
        sb.append(", fundName='").append(fundName).append("\'\n");
        sb.append(", fundNameAbbr='").append(fundNameAbbr).append("\'\n");
        sb.append(", financeType='").append(financeType).append("\'\n");
        sb.append(", fundTypeName='").append(fundTypeName).append("\'\n");
        sb.append(", isGuaranteedFund='").append(isGuaranteedFund).append("\'\n");
        sb.append(", isLOFFund='").append(isLOFFund).append("\'\n");
        sb.append(", isQDIIFund='").append(isQDIIFund).append("\'\n");
        sb.append(", isETFFund='").append(isETFFund).append("\'\n");
        sb.append(", lxRedeemFeeBackRatio='").append(lxRedeemFeeBackRatio).append("\'\n");
        sb.append(", defDividendMethod='").append(defDividendMethod).append("\'\n");
        sb.append(", redemptionSequence='").append(redemptionSequence).append("\'\n");
        sb.append(", buyUpperAmount='").append(buyUpperAmount).append("\'\n");
        sb.append(", covertInUpperAmount='").append(covertInUpperAmount).append("\'\n");
        sb.append(", periodSubUpperAmount='").append(periodSubUpperAmount).append("\'\n");
        sb.append(", instAppSubsAmnt='").append(instAppSubsAmnt).append("\'\n");
        sb.append(", instAppSubsVol='").append(instAppSubsVol).append("\'\n");
        sb.append(", minAmountByInst='").append(minAmountByInst).append("\'\n");
        sb.append(", minVolByInst='").append(minVolByInst).append("\'\n");
        sb.append(", currencyType='").append(currencyType).append("\'\n");
        sb.append(", custodianCode='").append(custodianCode).append("\'\n");
        sb.append(", amountOfPeriodicSubs='").append(amountOfPeriodicSubs).append("\'\n");
        sb.append(", dateOfPeriodicSubs='").append(dateOfPeriodicSubs).append("\'\n");
        sb.append(", maxRedemptionVol='").append(maxRedemptionVol).append("\'\n");
        sb.append(", minAccountBalance='").append(minAccountBalance).append("\'\n");
        sb.append(", ipoStartDate='").append(ipoStartDate).append("\'\n");
        sb.append(", ipoEndDate='").append(ipoEndDate).append("\'\n");
        sb.append(", fundEstablishDate='").append(fundEstablishDate).append("\'\n");
        sb.append(", fundManagerCode='").append(fundManagerCode).append("\'\n");
        sb.append(", indiAppSubsVol='").append(indiAppSubsVol).append("\'\n");
        sb.append(", indiAppSubsAmount='").append(indiAppSubsAmount).append("\'\n");
        sb.append(", minSubsVolByIndi='").append(minSubsVolByIndi).append("\'\n");
        sb.append(", minSubsAmountByIndi='").append(minSubsAmountByIndi).append("\'\n");
        sb.append(", registrarCode='").append(registrarCode).append("\'\n");
        sb.append(", fundSize='").append(fundSize).append("\'\n");
        sb.append(", exchangeFlag='").append(exchangeFlag).append("\'\n");
        sb.append(", fundSponsor='").append(fundSponsor).append("\'\n");
        sb.append(", faceValue='").append(faceValue).append("\'\n");
        sb.append(", maxSubsVolByIndi='").append(maxSubsVolByIndi).append("\'\n");
        sb.append(", maxSubsAmountByIndi='").append(maxSubsAmountByIndi).append("\'\n");
        sb.append(", maxSubsVolByInst='").append(maxSubsVolByInst).append("\'\n");
        sb.append(", maxSubsAmountByInst='").append(maxSubsAmountByInst).append("\'\n");
        sb.append(", unitSubsVolByIndi='").append(unitSubsVolByIndi).append("\'\n");
        sb.append(", unitSubsAmountByIndi='").append(unitSubsAmountByIndi).append("\'\n");
        sb.append(", unitSubsVolByInst='").append(unitSubsVolByInst).append("\'\n");
        sb.append(", unitSubsAmountByInst='").append(unitSubsAmountByInst).append("\'\n");
        sb.append(", minBidsAmountByIndi='").append(minBidsAmountByIndi).append("\'\n");
        sb.append(", minBidsAmountByInst='").append(minBidsAmountByInst).append("\'\n");
        sb.append(", minAppBidsAmountByIndi='").append(minAppBidsAmountByIndi).append("\'\n");
        sb.append(", minAppBidsAmountByInst='").append(minAppBidsAmountByInst).append("\'\n");
        sb.append(", minRedemptionVol='").append(minRedemptionVol).append("\'\n");
        sb.append(", minInterconvertVol='").append(minInterconvertVol).append("\'\n");
        sb.append(", issueTypeByIndi='").append(issueTypeByIndi).append("\'\n");
        sb.append(", issueTypeByInst='").append(issueTypeByInst).append("\'\n");
        sb.append(", subsType='").append(subsType).append("\'\n");
        sb.append(", collectFeeType='").append(collectFeeType).append("\'\n");
        sb.append(", indiMaxPurchase='").append(indiMaxPurchase).append("\'\n");
        sb.append(", instMaxPurchase='").append(instMaxPurchase).append("\'\n");
        sb.append(", indiDayMaxSumBuy='").append(indiDayMaxSumBuy).append("\'\n");
        sb.append(", instDayMaxSumBuy='").append(instDayMaxSumBuy).append("\'\n");
        sb.append(", indiDayMaxSumRedeem='").append(indiDayMaxSumRedeem).append("\'\n");
        sb.append(", instDayMaxSumRedeem='").append(instDayMaxSumRedeem).append("\'\n");
        sb.append(", indiMaxRedeem='").append(indiMaxRedeem).append("\'\n");
        sb.append(", instMaxRedeem='").append(instMaxRedeem).append("\'\n");
        sb.append(", registrarName='").append(registrarName).append("\'\n");
        sb.append(", fundManagerName='").append(fundManagerName).append("\'\n");
        sb.append(", fundServerTel='").append(fundServerTel).append("\'\n");
        sb.append(", fundInternetAddress='").append(fundInternetAddress).append("\'\n");
        sb.append(", specification='").append(specification).append("\'\n");
        sb.append(", wholeFlag='").append(wholeFlag).append("\'\n");
        sb.append(", modifyWay='").append(modifyWay).append("\'\n");
        sb.append(", operateDate='").append(operateDate).append("\'\n");
        sb.append(", taCode='").append(taCode).append("\'\n");
        sb.append(", issPrice='").append(issPrice).append("\'\n");
        sb.append(", incomeDate='").append(incomeDate).append("\'\n");
        sb.append(", oMinAccountBalance='").append(ominAccountBalance).append("\'\n");
        sb.append(", pMinRedemptionVol='").append(pminRedemptionVol).append("\'\n");
        sb.append(", pMinInterconvertVol='").append(pminInterconvertVol).append("\'\n");
        sb.append(", oMinRedemptionVol='").append(ominRedemptionVol).append("\'\n");
        sb.append(", oMinInterconvertVol='").append(ominInterconvertVol).append("\'\n");
        sb.append(", subcancelFlag='").append(subcancelFlag).append("\'\n");
        sb.append(", interestWay='").append(interestWay).append("\'\n");
        sb.append(", prdProfitKind='").append(prdProfitKind).append("\'\n");
        sb.append(", isAllowPrdRealTimeRansom='").append(isAllowPrdRealTimeRansom).append("\'\n");
        sb.append(", baseDays='").append(baseDays).append("\'\n");
        sb.append(", transWay='").append(transWay).append("\'\n");
        sb.append(", parentsPrdCode='").append(parentsPrdCode).append("\'\n");
        sb.append(", prdTemplateCode='").append(prdTemplateCode).append("\'\n");
        sb.append(", alimitEndDate='").append(alimitEndDate).append("\'\n");
        sb.append(", oRedUnit='").append(oredUnit).append("\'\n");
        sb.append(", oMaxAccuAmt='").append(omaxAccuAmt).append("\'\n");
        sb.append(", pRedUnit='").append(predUnit).append("\'\n");
        sb.append(", pMaxAccuAmt='").append(pmaxAccuAmt).append("\'\n");
        sb.append(", modelComment='").append(modelComment).append("\'\n");
        sb.append(", dayBeforeCfm='").append(dayBeforeCfm).append("\'\n");
        sb.append(", buyIsControlConfirmFlag='").append(buyIsControlConfirmFlag).append("\'\n");
        sb.append(", redeemIsControlConfirmFlag='").append(redeemIsControlConfirmFlag).append("\'\n");
        sb.append(", zeroSetUpFlag='").append(zeroSetUpFlag).append("\'\n");
        sb.append(", limitFlag='").append(limitFlag).append("\'\n");
        sb.append(", agioType='").append(agioType).append("\'\n");
        sb.append(", sellerLimit='").append(sellerLimit).append("\'\n");
        sb.append(", lockDays='").append(lockDays).append("\'\n");
        sb.append(", isCheckInvester='").append(isCheckInvester).append("\'\n");
        sb.append(", clientCycleMode='").append(clientCycleMode).append("\'\n");
        sb.append(", minCycleDays='").append(minCycleDays).append("\'\n");
        sb.append(", maxCycleDays='").append(maxCycleDays).append("\'\n");
        sb.append(", cycleAllottedDays='").append(cycleAllottedDays).append("\'\n");
        sb.append(", fundBuyAccount='").append(fundBuyAccount).append("\'\n");
        sb.append(", maxLockDays='").append(maxLockDays).append("\'\n");
        sb.append(", isPeerExclusive='").append(isPeerExclusive).append("\'\n");
        sb.append(", isAllowReRedeem='").append(isAllowReRedeem).append("\'\n");
        sb.append(", maxHoldPers='").append(maxHoldPers).append("\'\n");
        sb.append(", isAllowTransFer='").append(isAllowTransFer).append("\'\n");
        sb.append(", reRedeemDays='").append(reRedeemDays).append("\'\n");
        sb.append(", isAllowExtend='").append(isAllowExtend).append("\'\n");
        sb.append(", allowBreachRedempt='").append(allowBreachRedempt).append("\'\n");
        sb.append(", periodicStatus='").append(periodicStatus).append("\'\n");
        sb.append(", indiMaxSumRedeem='").append(indiMaxSumRedeem).append("\'\n");
        sb.append(", instMaxSumRedeem='").append(instMaxSumRedeem).append("\'\n");
        sb.append('}');
        return sb.toString();
    }
}
