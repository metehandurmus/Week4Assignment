package dev.patika.week4assignment.repository;

import dev.patika.week4assignment.entity.Expedition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpeditionRepository extends CrudRepository<Expedition, Long> {
}
