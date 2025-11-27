package com.example.Biblioteca.Usuarios;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

        //Adicionar usuário (CREATE)
        @PostMapping("/criar")
        public String criarUsuario() {
            return "Usuário criado com sucesso!";
        }

        //Mostrar todos os usuarios (READ)
        @GetMapping("/todos")
        public String mostrarTodosOsUsuarios() {
            return "Mostrar Ninja";
        }

        //Mostrar usuario por ID (READ)
        @GetMapping("/listarID")
        public String mostrarTodosOsUsuariosPorId() {
            return "Mostrar Ninja por ID";
        }

        //Alterar dados dos usuarios (UPDATE)
        @PutMapping("/alterarID")
        public String alterarUsuario() {
            return "Alterar Ninja por ID";
        }

        //Deletar usuário (DELETE)
        @DeleteMapping("/deletarID")
        public String deletarUsuarioPorId() {
            return "Usuário deletado por ID";
        }
}
