package com.wine.to.up.deployment.service.service

import com.github.dockerjava.api.model.Service
import com.wine.to.up.deployment.service.entity.ApplicationInstance
import com.wine.to.up.deployment.service.enums.ApplicationInstanceStatus
import com.wine.to.up.deployment.service.vo.ApplicationDeployRequestWrapper
import com.wine.to.up.deployment.service.vo.ApplicationInstanceVO

interface ApplicationInstanceService {
    fun getInstancesByTemplateName(templateName: String): List<ApplicationInstanceVO>

    fun getInstancesByTemplateId(templateId: Long): List<ApplicationInstanceVO>

    fun getInstanceById(instanceId: Long): ApplicationInstanceVO

    fun deployInstance(applicationDeployRequestWrapper: ApplicationDeployRequestWrapper): ApplicationInstanceVO

    fun entitiesToVies(entities: List<ApplicationInstance>, forceStatus: ApplicationInstanceStatus? = null): List<ApplicationInstanceVO>

    fun removeEntitiesByIds(ids: List<Long>)

    fun removeEntities(entities: List<ApplicationInstance>)

    fun removeEntityById(id: Long): ApplicationInstanceVO

    fun viewsToEntities(views: List<ApplicationInstanceVO>): List<ApplicationInstance>

    fun getInstances(): List<Service>

    fun saveInstance(applicationInstance: ApplicationInstance): ApplicationInstanceVO
}