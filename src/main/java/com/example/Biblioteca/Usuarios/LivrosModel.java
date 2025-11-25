package com.example.Biblioteca.Usuarios;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuarios ")
public class LivrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int idade;


}
