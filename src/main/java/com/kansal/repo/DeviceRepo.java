package com.kansal.repo;

import com.kansal.entity.DeviceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tarunkansal on 6/12/17.
 */
@Repository
public interface DeviceRepo extends JpaRepository<DeviceEntity,Long>, DeviceRepoCustom {

    DeviceEntity findFirstByUserIdAndGuid(String userId, String guid);
}
