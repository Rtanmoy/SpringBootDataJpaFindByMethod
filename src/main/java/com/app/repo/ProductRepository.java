package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
List<Product> findByProdCost(Double prodCost);//..ProdCostIs/Equals

List<Product> findByProdCostLessThan(Double prodCost);
List<Product> findByProdCostLessThanEqual(Double prodCost);
List<Product> findByProdCodeIsNotNull();
List<Product> findByProdCodeLike(String prodCode);
List<Product> findByProdCodeContaining(String prodCode);
List<Product> findByProdCostBetween(Double prodCode,Double prodCode1);





}
