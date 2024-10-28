package com.danielhernandez.libreria.controller;


import com.danielhernandez.libreria.entities.Libro;
import com.danielhernandez.libreria.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/libreria")
public class LibroController {
    @Autowired
    LibroRepository libroRepository;

    @GetMapping
    public List<Libro> getLibro(){
       List<Libro>libros = libroRepository.findAll();
        return libros;
    }

    @GetMapping("/{id}")
    public Libro getLibroById (@PathVariable("id")Integer id){
        return libroRepository.findLibroById(id);
    }

    @PostMapping("/")
    public void createLibro(@RequestBody Libro libro) {
        libroRepository.save(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable("id") Integer id) {
        Libro i = new Libro();
        i.setId(id);
        libroRepository.delete(i);
    }

    @PutMapping("/{id}")
    public void updateLibro(@RequestBody Libro libro, @PathVariable("id")Integer id) {
        libroRepository.save(libro);
    }

}
