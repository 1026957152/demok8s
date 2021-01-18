package com.example.dm.enumT;

//import com.coalvalue.domain.pojo.ListItem;

/**
 * Created by silence on 2016/1/18.
 */
public enum E_待LN003_合同信息_贷款账户状态_工行 {



    E_00_结清 ("00", "结清",1,""),
    E_01_未发放 ("01", "未发放",1,""),
    E_02_正常 ("02", "正常",1,""),
    E_03_逾期 ("03", "逾期",1,""),

    ;
//    输出	00-结清；01-未发放；02-正常；03-逾期

/*    		"1-正常,
            2-逾期,
            3-部分逾期,
            4-停息挂账,
            5-清户,
            6-销户,
            7-核销"	0:	*/



    public static E_待LN003_合同信息_贷款账户状态_工行 from(E_待LN003_合同信息_贷款账户状态 typeEnum) {

/*        LoanContractStatusEnum loanContractStatusEnum = LoanContractStatusEnum.fromString(ln3101贷款账户辅助信息.getLnstatus贷款状态()); // ln003_contract_info_合同信息.getLoancontrstate_合同状态());

        if(loanContractStatusEnum.getText().equals(LoanContractStatusEnum.放款.getText())){
            //String dkzt;//	贷款状态	char	输出	00-结清；01-未发放；02-正常；03-逾期
            data.setDkzt("02");
        }

        if(loanContractStatusEnum.getText().equals(LoanContractStatusEnum.合同终止.getText())){
            //String dkzt;//	贷款状态	char
            data.setDkzt("00");
        }*/

        switch (typeEnum){
            case E_2_逾期:
            case E_1_正常:

                return E_待LN003_合同信息_贷款账户状态_工行.E_00_结清;

            case E_4_停息挂账:
                return E_待LN003_合同信息_贷款账户状态_工行.E_00_结清;


            default:
                return E_待LN003_合同信息_贷款账户状态_工行.E_00_结清;

        }


    }
    private final String statusText;
    private final String displayText;
    private final Integer id;

    private String helpMessage;

    public String getHelpMessage() {
        return helpMessage;
    }

    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    public String getDisplayText() {
        return displayText;
    }

    E_待LN003_合同信息_贷款账户状态_工行(String statusText, String displayText, Integer id, String helpMessage) {
        this.statusText = statusText;
        this.displayText = displayText;

        this.id = id;
        this.helpMessage = helpMessage;
    }
    public String getText() {
        return this.statusText;
    }

    public Integer getId() {
        return this.id;
    }

/*
    public static List<ListItem> retriveTypese() {

        List<ListItem> list = new ArrayList<ListItem>();
        for (AccountingVoucherStatusEnum status : AccountingVoucherStatusEnum.values()) {
            ListItem element = new ListItem(status.getId(), status.getDisplayText(), status.getHelpMessage());
            list.add(element);
        }

        return list;

    }


    public static List<ListItem> retriveTypese(String statusText) {

        List<ListItem> list = new ArrayList<ListItem>();
        for(PersonalAccountStatusEnum status : PersonalAccountStatusEnum.values()) {
            ListItem element = new ListItem(status.getText(), status.getDisplayText());
            if (status.getText().equals(statusText)){
                element.setSelected(true);
            }
            list.add(element);
        }
        return list;

    }*/



    public static E_待LN003_合同信息_贷款账户状态_工行 fromString(String text) {
        for (E_待LN003_合同信息_贷款账户状态_工行 status : E_待LN003_合同信息_贷款账户状态_工行.values()) {
            if (status.getText().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

    public static E_待LN003_合同信息_贷款账户状态_工行 fromInt(Integer text) {
        for (E_待LN003_合同信息_贷款账户状态_工行 status : E_待LN003_合同信息_贷款账户状态_工行.values()) {
            if (status.getId().equals(text) ) {
                return status;
            }
        }
        throw new RuntimeException("no customer status " + text);
    }

}
