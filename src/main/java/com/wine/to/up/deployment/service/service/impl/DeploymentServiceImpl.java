package com.wine.to.up.deployment.service.service.impl;

import com.wine.to.up.deployment.service.enums.ApplicationInstanceStatus;
import com.wine.to.up.deployment.service.service.DeploymentService;

import com.wine.to.up.deployment.service.vo.ApplicationInstanceVO;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class DeploymentServiceImpl implements DeploymentService {

    @Override
    public void test() {
        // DO something
    }

    @Override
    public List<ApplicationInstanceVO> getMultipleInstancesByAppId(String appId) {
        List<ApplicationInstanceVO> Instances = new ArrayList<>();
        ApplicationInstanceVO ApplicationInstance = ApplicationInstanceVO.builder()
                .appId(appId)
                .templateId(15)
                .version("1.0.1")
                .containerId("12235123512")
                .dateCreated("23412351245")
                .createdBy("asukhoa")
                .status(ApplicationInstanceStatus.STARTING)
                .build();
        Instances.add(ApplicationInstance);

        return Instances;
    }

    @Override
    public ApplicationInstanceVO getSingleInstanceByAppId(String appId) {
        ApplicationInstanceVO Instance = ApplicationInstanceVO.builder()
                .appId(appId)
                .templateId(15)
                .version("1.0.1")
                .containerId("12235123512")
                .dateCreated("23412351245")
                .createdBy("asukhoa")
                .status(ApplicationInstanceStatus.STARTING)
                .build();

        return Instance;
    }
}
