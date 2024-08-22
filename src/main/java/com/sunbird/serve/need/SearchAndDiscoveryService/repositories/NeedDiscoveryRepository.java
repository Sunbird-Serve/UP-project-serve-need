package com.sunbird.serve.need;

import com.sunbird.serve.need.models.Need.Need;
import com.sunbird.serve.need.models.Need.Entity;
import com.sunbird.serve.need.models.enums.NeedStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.List;
import org.springframework.data.domain.Page; 
import org.springframework.data.domain.Pageable;
import java.util.Optional;

@Repository
public interface NeedDiscoveryRepository extends JpaRepository<Need, UUID> {

    //Fetch all the needs
    Page<Need> findAll(Pageable pageable);

    //Fetch Need by status
    Page<Need> findAllByStatus(NeedStatus status, Pageable pageable);
    //Page<Need> findAllByUserIdAndStatus(String userId, NeedStatus status, Pageable pageable);
    Page<Need> findAllByNeedTypeId(String needTypeId, Pageable pageable );

    Page<Need> findAllByUserId(String userId, Pageable pageable);

    Page<Need> findAllByUserIdAndStatus(String userId, NeedStatus status, Pageable pageable);

    Page<Need> findAllByUserIdAndNeedTypeId(String userId, String needTypeId, Pageable pageable);
}
