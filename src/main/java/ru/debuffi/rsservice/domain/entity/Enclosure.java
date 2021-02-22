package ru.debuffi.rsservice.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Vyacheslav Savinov
 * @since 22.02.2021
 */
@Data
@Entity
@Table(name = "enclosures")
@EqualsAndHashCode
public class Enclosure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    private String type;
    private Long length;
}
