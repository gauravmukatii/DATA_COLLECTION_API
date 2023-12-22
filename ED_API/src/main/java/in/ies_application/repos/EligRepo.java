package in.ies_application.repos;

import in.ies_application.entities.EligEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EligRepo extends JpaRepository<EligEntity, Integer> {
}
