package ru.debuffi.rsservice.service.impl;

import org.springframework.stereotype.Service;

import ru.debuffi.rsservice.client.LentaClient;
import ru.debuffi.rsservice.domain.model.RSSModel;
import ru.debuffi.rsservice.service.RssService;

import generated.Rss;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class LentaService implements RssService {

    private final LentaClient lentaClient;

    @Override
    public RSSModel getAll() {
        return null;
    }

    @Override
    public void process() {
        log.debug("Performing #getLentaNews via Lenta Feign Client");
        final Rss lentaNews = lentaClient.getLentaNews();
    }
}
