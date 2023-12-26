package in_ies_application.repo;

import in_ies_application.entity.EligEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EligRepo extends JpaRepository<EligEntity, Integer> {

    public EligEntity findByCaseNum(Long caseNum);
}
