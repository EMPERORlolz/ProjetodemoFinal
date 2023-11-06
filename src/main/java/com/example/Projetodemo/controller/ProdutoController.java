package com.example.Projetodemo.controller;
import com.example.Projetodemo.model.Produto;
import com.example.Projetodemo.repository.ClienteRepository;
import com.example.Projetodemo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/apiProduto")
public class ProdutoController {

    @Autowired
    ProdutoRepository proRepo;
    @GetMapping("/todos")
    public List<Produto> buscarTodos()
    {
        return proRepo.findAll();
    }

    @GetMapping("/cod/{cod}")
    public Optional <Produto> buscarPorCod (@PathVariable ("cod") int cod)
    {
        return proRepo.findById(cod);
    }

    @GetMapping("/todos/parteDescr/{parteDescr}")
public List<Produto> buscarPorParteDescr (@PathVariable("partedescr") String parteDescr)
{
    return proRepo.findByParteDescr(parteDescr);
}



}
