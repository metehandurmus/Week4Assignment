package dev.patika.week4assignment.responseDto;

import dev.patika.week4assignment.entity.ChairType;
import lombok.Data;

@Data
public class ShowChairResponseDto {
    private long id;
    private ChairType chairType;
    private double price;
}
