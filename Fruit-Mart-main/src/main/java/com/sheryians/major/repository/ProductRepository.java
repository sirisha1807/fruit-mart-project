package com.sheryians.major.repository;

import com.sheryians.major.model.product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<product, Long> {
    List<product> findAllByCategory_Id(int id);
}
