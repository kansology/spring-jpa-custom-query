package com.kansal.controller;

import com.kansal.entity.DeviceEntity;
import com.kansal.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tarunkansal on 6/12/17.
 */
@RestController
public class DeviceController {

    @Autowired
    private DeviceService service;

    @RequestMapping(value = "/find/save", produces = "application/json")
    public DeviceEntity findAndSave() {
        return service.findAndSave();
    }

    @RequestMapping(value = "/find/first", produces = "application/json")
    public DeviceEntity findFirst() {
        return service.findFirst();
    }
}
