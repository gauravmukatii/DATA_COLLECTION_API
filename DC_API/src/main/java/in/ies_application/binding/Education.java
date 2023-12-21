package in.ies_application.binding;

public class Education {

    private Integer caseNum;
    private Integer userId;
    private String higherDegree;
    private Integer graduationYear;
    private String uniName;

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

    public String getHigherDegree() {
        return higherDegree;
    }

    public void setHigherDegree(String higherDegree) {
        this.higherDegree = higherDegree;
    }

    public Integer getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(Integer graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }
}
