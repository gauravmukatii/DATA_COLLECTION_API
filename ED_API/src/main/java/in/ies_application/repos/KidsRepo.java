package in.ies_application.repos;

import in.ies_application.entities.KidsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KidsRepo extends JpaRepository<KidsEntity, Integer> {
}
