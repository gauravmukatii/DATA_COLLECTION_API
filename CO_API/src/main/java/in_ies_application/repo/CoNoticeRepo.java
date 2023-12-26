package in_ies_application.repo;

import in_ies_application.entity.CoNoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoNoticeRepo extends JpaRepository<CoNoticeEntity, Integer> {

    public List<CoNoticeEntity> findByNoticeStatus(String status);
}
