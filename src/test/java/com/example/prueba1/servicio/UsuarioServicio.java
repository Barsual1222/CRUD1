package com.example.prueba1.servicio;

import com.example.prueba1.modelo.Usuario;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UsuarioServicio {

    ResponseEntity<List<Usuario>> listarUsuario();

    ResponseEntity<Usuario> guardarUsuario (Usuario Usuario);

    ResponseEntity<Usuario> eliminarUsuario (Long id);

    ResponseEntity<Usuario> usuarioId (Long id );

    ResponseEntity<Usuario> actualizarUsuario (Usuario usuario, Long id);

}
