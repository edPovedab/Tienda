package com.tienda.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data // generar get and set
@Entity
@Table (name="categoria")
public class Categoria implements Serializable {

   
   private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) 
    private long idCategoria; //id_categoria
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn (name="idCategoria" , insertable = false, updatable = false)
    private List<Producto> productos;
 
    public Categoria() {
        
    }
    
    public Categoria(String descripcion,String rutaImagen, boolean activo) {
        this.descripcion=descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
}
    
