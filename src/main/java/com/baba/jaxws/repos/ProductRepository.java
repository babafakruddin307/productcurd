package com.baba.jaxws.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baba.jaxws.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
