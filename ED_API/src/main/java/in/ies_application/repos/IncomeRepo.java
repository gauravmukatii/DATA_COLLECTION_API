package in.ies_application.repos;

import in.ies_application.entities.IncomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepo extends JpaRepository<IncomeEntity, Integer> {
}
