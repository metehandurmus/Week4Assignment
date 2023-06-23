package dev.patika.week4assignment.repository;

import dev.patika.week4assignment.entity.Chair;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChairRepository extends CrudRepository<Chair, Long> {
    List<Chair> findByExpeditionId(long id);
}
