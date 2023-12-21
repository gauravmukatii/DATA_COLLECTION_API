package in.ies_application.entities;

import in.ies_application.binding.Kid;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "IES_KIDS")
public class KidsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer kidsId;
    private List<Kid> KidsList;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToOne
    @JoinColumn(name = "case_num")
    private AppEntity app;

    public Integer getKidsId() {
        return kidsId;
    }

    public void setKidsId(Integer kidsId) {
        this.kidsId = kidsId;
    }


    public List<Kid> getKidsList() {
        return KidsList;
    }

    public void setKidsList(List<Kid> kidsList) {
        KidsList = kidsList;
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
