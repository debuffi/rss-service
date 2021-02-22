package ru.debuffi.rsservice.service;

import ru.debuffi.rsservice.domain.model.RSSModel;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
public interface RssService {

    void process();

    RSSModel getAll();
}
