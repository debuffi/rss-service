package ru.debuffi.rsservice.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@Service
public class LentaSchedulerService {

    @Scheduled(fixedDelayString = "${scheduler.lenta.delay.seconds:60}000")
    public void updateLentaNews() {

    }
}
