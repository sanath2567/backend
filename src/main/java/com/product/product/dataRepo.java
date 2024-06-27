package com.product.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dataRepo extends JpaRepository<DataItem, Integer> {

  

}
