package com.example.books.repository;

import com.example.books.model.entity.ReviewOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewOptionRepository extends JpaRepository<ReviewOption, Integer> {
    //
}
