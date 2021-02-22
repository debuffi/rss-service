package ru.debuffi.rssservice.domain.dto;

import java.time.LocalDateTime;
import java.util.List;

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
public class LentaDto extends BaseRssDto {

    private List<LentaItemDto> items;
}
