package com.company.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.company.model.Book;
public interface BookRepository extends JpaRepository<Book, Long>{

}
