package ru.debuffi.rssservice.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class RssSchedulerService {

    private final RssService lentaService;

    @Scheduled(fixedDelayString = "${scheduler.lenta.delay.seconds:60}000")
    public void updateLentaNews() {
        log.debug("Start updating lenta news on schedule");
        lentaService.update();
    }
}
