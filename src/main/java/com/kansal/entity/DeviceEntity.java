package com.kansal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


/**
 * Created by tarunkansal on 6/12/17.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table(name = "device_master")
public class DeviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String userId;
    private String guid;
    private String updatedBy;
}
