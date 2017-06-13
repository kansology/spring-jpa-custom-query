package com.kansal.repo;

import com.kansal.entity.DeviceEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Created by tarunkansal on 6/12/17.
 */

@Repository
@Transactional
public class DeviceRepoImpl implements DeviceRepoCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public DeviceEntity findAndSave(String userId, String guid) {
        Query query = entityManager.createNativeQuery("SELECT * DEVICE_MASTER " +
                "where user_id IS NULL " +
                "and guid IS NULL " +
                "LIMIT 1 FOR UPDATE", DeviceEntity.class);


        DeviceEntity entity = (DeviceEntity) query.getSingleResult();

        if(null != entity) {
            entity.setUserId(userId);
            entity.setGuid(guid);

            entityManager.persist(entity);
        }
        return entity;
    }
}
