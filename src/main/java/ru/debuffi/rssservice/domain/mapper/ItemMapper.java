package ru.debuffi.rssservice.domain.mapper;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import ru.debuffi.rssservice.domain.dto.LentaItemDto;
import ru.debuffi.rssservice.domain.entity.Item;

import generated.Rss;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@Mapper
public interface ItemMapper {

    @Mapping(target = "pubDate", ignore = true)
    Item toEntity(final Rss.Channel.Item item);

    List<Item> toEntities(final List<Rss.Channel.Item> items);

    @AfterMapping
    default Item setPubDate(@MappingTarget final Item item, final Rss.Channel.Item itemDto) {
        final DateTimeFormatter formatter = DateTimeFormatter.RFC_1123_DATE_TIME;
        final LocalDateTime localDateTime = LocalDateTime.parse(itemDto.getPubDate(), formatter);
        item.setPubDate(localDateTime);
        return item;
    }



    List<LentaItemDto> toDto(final List<Item> item);

    LentaItemDto toDto(final Item item);
}