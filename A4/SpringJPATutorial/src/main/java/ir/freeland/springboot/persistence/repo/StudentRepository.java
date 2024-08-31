package ir.freeland.springboot.persistence.repo;

import org.springframework.data.repository.CrudRepository;

import ir.freeland.springboot.persistence.model.Students;

import java.util.List;

public interface StudentRepository extends CrudRepository<Students, Long> {
    List<Students> findByName(String name);
    List<Students> findByNameIgnoreCase(String name);
    List<Students> findByNameEndingWith(String name);
    List<Students> findByNameEndingWithIgnoreCase(String name);
    List<Students> findByNameEndingWithIgnoreCaseOrderByIdDesc(String name);
}
 