package in.ies_application.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "CO_NOTICES")
public class CoNoticeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer noticeId;
    private Long caseNum;
    private String noticeUrl;
    private String noticeStatus;
    private Integer edgTraceId;
    private LocalDate noticePrintDate;

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

    public String getNoticeUrl() {
        return noticeUrl;
    }

    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl;
    }

    public String getNoticeStatus() {
        return noticeStatus;
    }

    public void setNoticeStatus(String noticeStatus) {
        this.noticeStatus = noticeStatus;
    }

    public Integer getEdgTraceId() {
        return edgTraceId;
    }

    public void setEdgTraceId(Integer edgTraceId) {
        this.edgTraceId = edgTraceId;
    }

    public LocalDate getNoticePrintDate() {
        return noticePrintDate;
    }

    public void setNoticePrintDate(LocalDate noticePrintDate) {
        this.noticePrintDate = noticePrintDate;
    }
}
