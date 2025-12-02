package com.example.Biblioteca.Usuarios;

import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    // Mapeamento de uma entity para um DTO

    public UsuarioModel mapEntity(UsuarioDTO usuarioDTO) {
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setId(usuarioDTO.getId());
        usuarioModel.setNome(usuarioDTO.getNome());
        usuarioModel.setEmail(usuarioDTO.getEmail());
        usuarioModel.setCpf(usuarioDTO.getCpf());
        usuarioModel.setIdade(usuarioDTO.getIdade());
        usuarioModel.setImgUrl(usuarioDTO.getImgUrl());
        usuarioModel.setBooks(usuarioDTO.getBooks());

        return usuarioModel;
    }

    // Mapeamento de um DTO para uma entity

    public UsuarioDTO mapDTO(UsuarioModel usuarioModel) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setId(usuarioModel.getId());
        usuarioDTO.setNome(usuarioModel.getNome());
        usuarioDTO.setEmail(usuarioModel.getEmail());
        usuarioDTO.setCpf(usuarioModel.getCpf());
        usuarioDTO.setIdade(usuarioModel.getIdade());
        usuarioDTO.setImgUrl(usuarioModel.getImgUrl());
        usuarioDTO.setBooks(usuarioModel.getBooks());

        return usuarioDTO;
    }
}
