package dev.patika.week4assignment.controller;

import dev.patika.week4assignment.requestDto.BuyTicketRequestDto;
import dev.patika.week4assignment.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/ticket")
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;

    @PostMapping("/buy")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody BuyTicketRequestDto buyTicketRequestDto) throws Exception {
        ticketService.buy(buyTicketRequestDto);
    }
}
