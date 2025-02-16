package com.tienda.dao;
import com.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

// Verifica que esta anotación esté bien escrita
public interface CategoriaDao extends JpaRepository<Categoria, Long> {
}

