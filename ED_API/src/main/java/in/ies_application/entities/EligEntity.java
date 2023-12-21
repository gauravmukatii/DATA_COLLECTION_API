package in.ies_application.entities;

import jakarta.persistence.*;
import org.hibernate.bytecode.enhance.spi.EnhancementInfo;

import java.time.LocalDate;

@Entity
@Table(name = "ELIG_DTLS")
public class EligEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer edgTraceId;
    private Long caseNum;
    private Integer planId;
    private Double benefitAmt;
    private LocalDate eligStartDate;
    private LocalDate eligEndDate;
    private String denielRsn;

    public Integer getEdgTraceId() {
        return edgTraceId;
    }

    public void setEdgTraceId(Integer edgTraceId) {
        this.edgTraceId = edgTraceId;
    }

    public Long getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(Long caseNum) {
        this.caseNum = caseNum;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Double getBenefitAmt() {
        return benefitAmt;
    }

    public void setBenefitAmt(Double benefitAmt) {
        this.benefitAmt = benefitAmt;
    }

    public LocalDate getEligStartDate() {
        return eligStartDate;
    }

    public void setEligStartDate(LocalDate eligStartDate) {
        this.eligStartDate = eligStartDate;
    }

    public LocalDate getEligEndDate() {
        return eligEndDate;
    }

    public void setEligEndDate(LocalDate eligEndDate) {
        this.eligEndDate = eligEndDate;
    }

    public String getDenielRsn() {
        return denielRsn;
    }

    public void setDenielRsn(String denielRsn) {
        this.denielRsn = denielRsn;
    }
}


