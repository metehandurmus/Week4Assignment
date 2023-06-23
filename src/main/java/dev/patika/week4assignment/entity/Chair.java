package dev.patika.week4assignment.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CHAIRS")
@Getter
@Setter
@JsonInclude(JsonInclude.Include.ALWAYS)
public class Chair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "chairtype_id", referencedColumnName = "id")
    private ChairType chairType;

    @ManyToOne
    @JoinColumn(name = "expedition_id", referencedColumnName = "id")
    private Expedition expedition;

    @OneToOne(mappedBy = "chair")
    private Ticket ticket;

    @Column
    private double price;
}
