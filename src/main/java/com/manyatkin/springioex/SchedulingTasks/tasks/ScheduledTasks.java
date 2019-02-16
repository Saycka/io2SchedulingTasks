package com.manyatkin.springioex.SchedulingTasks.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    @Scheduled(fixedRate = 5000)
    public void showTime() {
        logger.info("Current time is {}", dateFormat.format(new Date()));
    }

}
