package in.ies_application.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DC_PLAN_SEL")
public class PlanSelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer planSelId;
    private Integer caseNum;
    private Integer planId;
    private Integer userId;

    public Integer getPlanSelId() {
        return planSelId;
    }

    public void setPlanSelId(Integer planSelId) {
        this.planSelId = planSelId;
    }

    public Integer getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(Integer caseNum) {
        this.caseNum = caseNum;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
