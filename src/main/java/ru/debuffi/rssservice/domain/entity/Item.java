package ru.debuffi.rssservice.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@Data
@Entity
@EqualsAndHashCode
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "guid")
    private String guid;

    @Column(name = "author")
    private String author;

    @Column(name = "title")
    private String title;

    @Column(name = "link")
    private String link;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "category")
    private String category;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "enclosure_id", referencedColumnName = "id")
    private Enclosure enclosure;

    @Column(name = "pub_date")
    private LocalDateTime pubDate;
}
