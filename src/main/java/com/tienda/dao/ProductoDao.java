package com.tienda.dao;
import com.tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

// Verifica que esta anotación esté bien escrita
public interface ProductoDao extends JpaRepository<Producto, Long> {
}

