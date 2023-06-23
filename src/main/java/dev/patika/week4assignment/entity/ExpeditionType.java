package dev.patika.week4assignment.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "EXPEDITION_TYPES")
@Getter
@Setter
public class ExpeditionType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;
}
