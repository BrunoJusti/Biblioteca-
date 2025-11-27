package com.example.Biblioteca.Book;

import org.springframework.web.bind.annotation.*;

//LOCALHOST:8080/adicionar

@RestController
@RequestMapping("/livros")
public class BookController {

    // GET -- Mandar uma requisição para mostrar os livros
    @GetMapping("/listar")
    public String listarLivros() {
        return "Livros encontrados: ";
    }

    // POST -- Mandar uma requisição para adicionar livro
    @PostMapping("/adicionar")
    public String adicionarLivro() {
        return ("Livro adicionado com sucesso!");
    }

    // PUT -- Mandar uma requisição para alterar os livros
    @PutMapping("/alterar")
    public String alterarLivro() {
        return ("Livro alterado com sucesso!");
    }

    // DELETE -- Mandar uma requisição para deletar os livros
    @DeleteMapping("/devolucao")
    public String deletarLivro() {
        return ("Livro deletado com sucesso!");
    }
}
