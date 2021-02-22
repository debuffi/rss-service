package ru.debuffi.rssservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.debuffi.rssservice.client.LentaClient;
import ru.debuffi.rssservice.domain.dto.BaseRssDto;
import ru.debuffi.rssservice.domain.dto.LentaDto;
import ru.debuffi.rssservice.domain.dto.LentaItemDto;
import ru.debuffi.rssservice.domain.entity.Item;
import ru.debuffi.rssservice.domain.mapper.ItemMapper;
import ru.debuffi.rssservice.repository.ItemRepository;
import ru.debuffi.rssservice.service.RssService;

import generated.Rss;
import lombok.RequiredArgsConstructor;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@Service
@RequiredArgsConstructor
public class LentaService implements RssService {

    private final ItemMapper itemMapper;
    private final LentaClient lentaClient;
    private final ItemRepository itemRepository;

    @Override
    @Transactional(readOnly = true)
    public BaseRssDto getAll() {
        final List<Item> items = itemRepository.findAll();
        final List<LentaItemDto> itemsDto = itemMapper.toDto(items);
        return new LentaDto(itemsDto);
    }

    @Override
    @Transactional
    public void update() {
        final Rss rss = lentaClient.getRss();
        final Rss.Channel channel = rss.getChannel();
        final List<Rss.Channel.Item> itemsDto = channel.getItem();
        final List<Item> items = itemMapper.toEntities(itemsDto);
        itemRepository.saveAll(items);
    }
}
