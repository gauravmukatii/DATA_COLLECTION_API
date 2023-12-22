package in.ies_application.repos;

import in.ies_application.entities.EducationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepo extends JpaRepository<EducationEntity, Integer> {

    @Query("from EducationEntity where caseNum = :caseNum")
    public EducationEntity findByCaseNum(Long caseNum);
}
