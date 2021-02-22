package ru.debuffi.rssservice.domain.dto;

import java.time.LocalDateTime;

import ru.debuffi.rssservice.domain.entity.Enclosure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LentaItemDto {

    private Long id;

    private String guid;

    private String author;

    private String title;

    private String link;

    private String description;

    private String category;

    private Enclosure enclosure;

    private LocalDateTime pubDate;
}
