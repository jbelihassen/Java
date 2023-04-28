package com.hassen.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hassen.bookclub.models.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();
}
