package com.quartzJobTest;

import org.junit.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JobTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void run() throws SchedulerException {
        //创建job方法
        JobDetail jobDetail = JobBuilder.newJob(QuartzJob.class)
                .withIdentity("quartzJob", "group1").build();
        //创建trigger
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("myTrigger", "group1").startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).withRepeatCount(9)).build();
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        //添加job
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();

    }

    @Test
    public void main() {
        JobTest jobTest = new JobTest();
        try {
            jobTest.run();
        } catch (SchedulerException e) {
            logger.error(e.getMessage());

        }
    }
}
