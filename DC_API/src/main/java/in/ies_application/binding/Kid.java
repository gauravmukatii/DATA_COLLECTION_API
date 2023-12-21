package in.ies_application.binding;

import java.time.LocalDate;

public class Kid {

    private String kidName;
    private LocalDate kidDob;
    private Long kidSSn;

    public String getKidName() {
        return kidName;
    }

    public void setKidName(String kidName) {
        this.kidName = kidName;
    }

    public LocalDate getKidDob() {
        return kidDob;
    }

    public void setKidDob(LocalDate kidDob) {
        this.kidDob = kidDob;
    }

    public Long getKidSSn() {
        return kidSSn;
    }

    public void setKidSSn(Long kidSSn) {
        this.kidSSn = kidSSn;
    }
}
