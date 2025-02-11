package com.gentech.relationship.repository;

import com.gentech.relationship.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {
}
