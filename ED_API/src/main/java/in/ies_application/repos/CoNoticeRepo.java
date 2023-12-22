package in.ies_application.repos;

import in.ies_application.entities.CoNoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoNoticeRepo extends JpaRepository<CoNoticeEntity, Integer> {
}
