package dev.patika.week4assignment.converter;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TicketConverter {
    private final ModelMapper modelMapper;
}
