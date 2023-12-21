package in.ies_application.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "IES_EDUCATION")
public class EducationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Eduid;
    private String higherDegree;
    private Integer graduationYear;
    private String uniName;
    @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity user;

    @OneToOne
    @JoinColumn(name="case_num")
    private AppEntity app;


    public Integer getEduid() {
        return Eduid;
    }

    public void setEduid(Integer eduid) {
        Eduid = eduid;
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
