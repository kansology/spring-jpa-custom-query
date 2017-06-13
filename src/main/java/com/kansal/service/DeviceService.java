package com.kansal.service;

import com.kansal.entity.DeviceEntity;
import com.kansal.repo.DeviceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tarunkansal on 6/12/17.
 */
@Service
public class DeviceService {

    @Autowired
    private DeviceRepo deviceRepo;

    public DeviceEntity findAndSave() {
        return deviceRepo.findAndSave("userId", "guid");
    }

    public DeviceEntity findFirst() {
        return deviceRepo.findFirstByUserIdAndGuid(null, null);
    }
}
