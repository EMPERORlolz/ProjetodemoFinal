package com.example.Projetodemo.repository;

import com.example.Projetodemo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

@Query ("select a from Produto where a.descr like %?1%")
    List<Produto> findByParteDescr (String parteDescr);
}
