package in.ies_application.binding;

import java.util.List;

public class Kids {
    private Integer caseNum;
    private Integer userId;
    private List<Kid> KidsList;

    public Integer getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(Integer caseNum) {
        this.caseNum = caseNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Kid> getKidsList() {
        return KidsList;
    }

    public void setKidsList(List<Kid> kidsList) {
        KidsList = kidsList;
    }
}
