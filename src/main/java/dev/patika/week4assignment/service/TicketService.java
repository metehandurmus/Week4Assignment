package dev.patika.week4assignment.service;

import dev.patika.week4assignment.entity.Chair;
import dev.patika.week4assignment.entity.Ticket;
import dev.patika.week4assignment.repository.ChairRepository;
import dev.patika.week4assignment.repository.TicketRepository;
import dev.patika.week4assignment.requestDto.BuyTicketRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;
    private final ChairRepository chairRepository;

    public void buy(BuyTicketRequestDto buyTicketRequestDto) throws Exception {
        if(!chairRepository.findById(buyTicketRequestDto.getChair_id()).isEmpty()){
            if (ticketRepository.findByChairId(buyTicketRequestDto.getChair_id()).isEmpty()) {
                Ticket ticket = new Ticket();
                ticket.setChair(chairRepository.findById(buyTicketRequestDto.getChair_id()).get());
                ticketRepository.save(ticket);
            } else {
                throw new Exception("Bu koltuk zaten dolu.");
            }
        } else {
            throw new Exception("Böyle bir koltuk mevcut değil.");
        }
    }
}
