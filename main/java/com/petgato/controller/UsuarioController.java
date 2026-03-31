package com.projeto.controller;

import com.projeto.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> lista = new ArrayList<>();

    @GetMapping
    public List<Usuario> getAll() {
        return lista;
    }

    @PostMapping
    public Usuario add(@RequestBody Usuario u) {
        lista.add(u);
        return u;
    }
}
