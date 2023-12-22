package in.ies_application.repos;

import in.ies_application.entities.PlanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRepo extends JpaRepository<PlanEntity, Integer> {
}
