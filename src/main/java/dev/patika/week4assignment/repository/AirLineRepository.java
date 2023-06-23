package dev.patika.week4assignment.repository;

import dev.patika.week4assignment.entity.AirLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirLineRepository extends CrudRepository<AirLine, Long> {
}
