package com.example.Biblioteca.Usuarios;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService  usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

        //Adicionar usuário (CREATE)
        @PostMapping("/criar")
        public UsuarioModel criarUsuario(@RequestBody UsuarioModel usuario) {
            return usuarioService.criarUsuario(usuario);
        }

        //Mostrar todos os usuarios (READ)
        @GetMapping("/listar")
        public List<UsuarioModel> listarUsuarios() {
            return usuarioService.listarUsuarios();
        }

        //Mostrar usuario por ID (READ)
        @GetMapping("/listar/{id}")
        public UsuarioModel listarUsuarioPorId(@PathVariable Long id) {
            return usuarioService.listarUsuarioPorId(id);
        }

        //Alterar dados dos usuarios (UPDATE)
        @PutMapping("/alterarId")
        public String alterarUsuario() {
            return "Alterar Ninja por ID";
        }

        //Deletar usuário (DELETE)
        @DeleteMapping("/deletar/{id}")
        public void deletarUsuarioPorId(@PathVariable Long id) {
            usuarioService.deletarUsuarioPorId(id);
        }
}
