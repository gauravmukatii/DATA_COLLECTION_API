package in.ies_application.binding;

public class Income {

    private Integer caseNum;
    private Integer userId;
    private Double salaryIncome;
    private Double propertyIncome;
    private Double rentIncome;

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

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(Double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public Double getPropertyIncome() {
        return propertyIncome;
    }

    public void setPropertyIncome(Double propertyIncome) {
        this.propertyIncome = propertyIncome;
    }

    public Double getRentIncome() {
        return rentIncome;
    }

    public void setRentIncome(Double rentIncome) {
        this.rentIncome = rentIncome;
    }
}
