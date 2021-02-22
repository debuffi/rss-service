package ru.debuffi.rssservice.service;

import ru.debuffi.rssservice.domain.dto.BaseRssDto;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
public interface RssService {

    /**
     * Обновление новостей.
     */
    void update();

    /**
     * Получить все сохранённые записи.
     *
     * @return {@link BaseRssDto} - базовый транспортный объект RSS Модели
     */
    BaseRssDto getAll();
}
