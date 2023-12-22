package in.ies_application.repos;

import in.ies_application.entities.KidsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KidsRepo extends JpaRepository<KidsEntity, Integer> {

    @Query("from KidsEntity where caseNum = :caseNum")
    public List<KidsEntity> findByCaseNum(Long caseNum);
}
