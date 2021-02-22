package ru.debuffi.rssservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.debuffi.rssservice.domain.dto.BaseRssDto;
import ru.debuffi.rssservice.service.RssService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("lenta")
public class LentaController {

    private final RssService lentaService;

    @GetMapping("/news")
    public BaseRssDto getAll() {
        log.debug(">> accept request to get all lenta news");
        final BaseRssDto lentaNews = lentaService.getAll();
        log.debug(">> Lenta news successfully received");
        return lentaNews;
    }
}
