package in_ies_application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class CoNoticeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noticeId;
    private Long caseNum;
    private Integer edTraceId;
    private String coPdfUrl;
    private LocalDate printDate;
    private String noticeStatus;
    private LocalDate createdDate;

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Long getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(Long caseNum) {
        this.caseNum = caseNum;
    }
}
