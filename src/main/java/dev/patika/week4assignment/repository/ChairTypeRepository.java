package dev.patika.week4assignment.repository;

import dev.patika.week4assignment.entity.ChairType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChairTypeRepository extends CrudRepository<ChairType, Long> {
}
