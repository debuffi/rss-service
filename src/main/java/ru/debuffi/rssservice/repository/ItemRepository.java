package ru.debuffi.rssservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.debuffi.rssservice.domain.entity.Item;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
