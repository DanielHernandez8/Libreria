package com.danielhernandez.libreria.repository;

import com.danielhernandez.libreria.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {
    Libro findLibroById(Integer id);
}
