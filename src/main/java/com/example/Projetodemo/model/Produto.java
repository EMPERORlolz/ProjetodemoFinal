package com.example.Projetodemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Produto {

    @Id
    private int cod;
    @Column
    private String descr;
    @Column
    private String marca;
    @Column
    private double preco;


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(int cod, String descr, String marca, double preco) {
        this.cod = cod;
        this.descr = descr;
        this.marca = marca;
        this.preco = preco;
    }
}
