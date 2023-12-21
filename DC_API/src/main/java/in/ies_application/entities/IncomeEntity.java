package in.ies_application.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "IES_INCOME")
public class IncomeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer incomeId;
    private Double salaryIncome;
    private Double propertyIncome;
    private Double rentIncome;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity user;

    @OneToOne
    @JoinColumn(name = "case_num")
    private AppEntity app;

    public Integer getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(Integer incomeId) {
        this.incomeId = incomeId;
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public AppEntity getApp() {
        return app;
    }

    public void setApp(AppEntity app) {
        this.app = app;
    }
}
