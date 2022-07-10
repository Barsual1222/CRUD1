package com.example.prueba1.controlador;

import com.example.prueba1.modelo.Usuario;
import com.example.prueba1.servicio.Impl.UsuarioServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/CRUD/usuario")
public class UsuarioControlador {
    @Autowired
    private UsuarioServicioImpl usuarioServicio;

    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuario() {
        return usuarioServicio.listarUsuario();
    }

    @PostMapping
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario Usuario) {
        return usuarioServicio.guardarUsuario(Usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> eliminarUsuario(@PathVariable("id") Long id) {
        return usuarioServicio.eliminarUsuario(id);
    }

    @GetMapping("/Listar/{id}")
    public ResponseEntity<Usuario> usuarioId(Long id) {

        return usuarioServicio.usuarioId(id);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@RequestBody Usuario usuario,@PathVariable("id") Long id) {
            return usuarioServicio.actualizarUsuario(usuario,id);


    }

}
