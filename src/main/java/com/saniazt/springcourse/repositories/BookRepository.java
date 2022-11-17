package com.saniazt.springcourse.repositories;

import com.saniazt.springcourse.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> searchByTitle(String title);



}