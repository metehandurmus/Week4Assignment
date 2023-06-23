package dev.patika.week4assignment.repository;

import dev.patika.week4assignment.entity.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
    List<Ticket> findByChairId(long id);
}
