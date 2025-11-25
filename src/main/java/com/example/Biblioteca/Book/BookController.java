package com.example.Biblioteca.Book;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BookController {

        @GetMapping("/boasVindas")
        public String boasVindas(){
            return "Essa é minha primeira mensagem nessa rota!";
        }
}
