package com.example.books.repository;

import com.example.books.model.entity.PackageSalesRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageSalesRuleRepository extends JpaRepository<PackageSalesRule, Integer> {
    //
}