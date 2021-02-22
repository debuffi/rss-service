package ru.debuffi.rsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.debuffi.rsservice.domain.model.RSSModel;
import ru.debuffi.rsservice.service.RssService;

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
    public RSSModel getAll() {
        log.debug(">> accept request to get all lenta news");
        final RSSModel lentaNews = lentaService.getAll();
        log.debug(">> Lenta news successfully received");
        return lentaNews;
    }
}
