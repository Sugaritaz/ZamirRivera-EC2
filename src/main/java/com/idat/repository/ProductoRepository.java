package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
