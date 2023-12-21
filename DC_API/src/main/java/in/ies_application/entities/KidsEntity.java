package in.ies_application.entities;

import in.ies_application.binding.Kid;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "DC_KIDS")
public class KidsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer kidsId;
    private Integer caseNum;
    private Integer userId;
    private List<Kid> KidsList;

    public Integer getKidsId() {
        return kidsId;
    }

    public void setKidsId(Integer kidsId) {
        this.kidsId = kidsId;
    }

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
