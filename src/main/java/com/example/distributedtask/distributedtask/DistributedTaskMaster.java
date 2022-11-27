package com.example.distributedtask.distributedtask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author youxuehu
 * @version v1.0
 * @className DistributedTaskMaster
 * @date 2022/11/27 8:19 下午
 * @desrription 这是类的描述信息
 */
@Component
public class DistributedTaskMaster implements InitializingBean, Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(DistributedTaskMaster.class);

    private final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    @Override
    public void afterPropertiesSet() {
        scheduledExecutorService.scheduleAtFixedRate(this, 1, 5, TimeUnit.SECONDS);
    }

    @Override
    public void run() {
        System.out.println("DistributedTaskMaster");
    }
}
