package com.example.MySpringBootDemo.quartzJobTest;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

public class JobTest {

    public void main(String[] args) throws SchedulerException {
        //创建job方法
        JobDetail jobDetail = JobBuilder.newJob(QuartzJob.class)
                .withIdentity("quartzJob", "group1").build();
        //创建trigger
        SimpleTrigger trigger = TriggerBuilder.newTrigger().withIdentity("", "group1").startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).withRepeatCount(2)).build();
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        //添加job
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();

    }
}
