package ir.freeland.springboot.persistence.repo;

import org.springframework.data.repository.CrudRepository;

import ir.freeland.springboot.persistence.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
