package com.tienda.service;
import java.util.List;
import com.tienda.domain.Categoria;
/**
 *
 * @author Eduardo
 */
public interface CategoriaService {

    public List<Categoria> getCategorias(boolean activos);
}
