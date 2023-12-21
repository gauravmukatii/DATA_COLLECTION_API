package in.ies_application.repos;

import in.ies_application.entities.PlanSelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanSelRepo extends JpaRepository<PlanSelEntity, Integer> {
}
