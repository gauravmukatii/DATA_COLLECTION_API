package in.ies_application.repos;

import in.ies_application.entities.IncomeEntity;
import in.ies_application.entities.KidsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepo extends JpaRepository<IncomeEntity, Integer> {

    @Query("from IncomeEntity where caseNum = :caseNum")
    public IncomeEntity findByCaseNum(Long caseNum);
}
