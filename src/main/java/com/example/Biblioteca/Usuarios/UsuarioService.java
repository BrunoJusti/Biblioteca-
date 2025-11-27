package com.example.Biblioteca.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Listar todos os usuários
    public List<UsuarioModel> listarUsuarios() {
            return  usuarioRepository.findAll();
    }

    // Listar todos os usuários por ID
   public UsuarioModel listarUsuarioPorId(Long Id) {
        Optional<UsuarioModel> usuarioPorId = usuarioRepository.findById(Id);
        return usuarioPorId.orElse(null);
   }
}
