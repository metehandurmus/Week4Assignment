package dev.patika.week4assignment.repository;

import dev.patika.week4assignment.entity.ExpeditionType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpeditionTypeRepository extends CrudRepository<ExpeditionType, Long> {
}
