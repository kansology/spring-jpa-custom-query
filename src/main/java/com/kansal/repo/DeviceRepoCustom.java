package com.kansal.repo;

import com.kansal.entity.DeviceEntity;
import org.springframework.data.jpa.repository.Lock;

import javax.persistence.LockModeType;

/**
 * Created by tarunkansal on 6/12/17.
 */
public interface DeviceRepoCustom {

    @Lock(value = LockModeType.PESSIMISTIC_WRITE)
    DeviceEntity findAndSave(String userId, String guid);
}
