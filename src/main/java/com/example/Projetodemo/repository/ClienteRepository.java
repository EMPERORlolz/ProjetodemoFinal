package com.example.Projetodemo.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Projetodemo.model.Cliente;
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
