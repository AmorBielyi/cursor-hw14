package com.romanbielyi.hw14;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

@Component
public class CurrentTimeScheduler {
    private static final Logger log = Logger.getLogger(CurrentTimeScheduler.class.getName());
    private static final SimpleDateFormat dateFormat =
            new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "*/1 * * * * *")
    public void printCurrentTime() {
        log.info(String.format("The current time is: %s", dateFormat.format(new Date())));
    }
}
