package in.ies_application.repos;

import in.ies_application.entities.EducationEntity;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepo extends JpaRepository<EducationEntity, Integer> {
}
