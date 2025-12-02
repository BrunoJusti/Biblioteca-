package com.example.Biblioteca.Usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    private UsuarioMapper usuarioMapper;

    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper) {
        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    // Listar todos os usuários
    public List<UsuarioModel> listarUsuarios() {
            return  usuarioRepository.findAll();
    }

    // Listar todos os usuários por ID
   public UsuarioModel listarUsuarioPorId(Long id) {
        Optional<UsuarioModel> usuarioPorId = usuarioRepository.findById(id);
        return usuarioPorId.orElse(null);
   }

   // Criar um novo usuário
    public UsuarioDTO criarUsuario(UsuarioDTO usuarioDTO) {
        UsuarioModel usuario = usuarioMapper.map(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return usuarioMapper.map(usuario);
    }

    // Deletar usuário - TEM QUE SER UM método VOID
    public void deletarUsuarioPorId(Long id) {
         usuarioRepository.deleteById(id);
    }

    // Atualizar usuário
    public UsuarioModel atualizarUsuario(Long id,  UsuarioModel usuarioAtualizado) {
        if (usuarioRepository.existsById(id)) {
            usuarioAtualizado.setId(id);
            return usuarioRepository.save(usuarioAtualizado);
        }
            return null;
    }
}
