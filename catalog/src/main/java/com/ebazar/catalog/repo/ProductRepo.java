package com.ebazar.catalog.repo;

import com.ebazar.catalog.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Query(value = "select * from product where price > ?1", nativeQuery = true)
    List<Product> sortByPriceGreaterThan(Double minPrice);

    @Query(value = "select * from product where price < ?1", nativeQuery = true)
    List<Product> sortByPriceLessThan(Double minPrice);
}
