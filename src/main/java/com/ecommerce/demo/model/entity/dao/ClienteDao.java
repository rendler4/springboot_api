package com.ecommerce.demo.model.entity.dao;

import com.ecommerce.demo.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}
