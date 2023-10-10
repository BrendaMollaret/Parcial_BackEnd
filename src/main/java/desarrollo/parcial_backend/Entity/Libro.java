package desarrollo.parcial_backend.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "libros")
public class Libro extends BaseEntity{

    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;
    private String autor;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_PERSONA")
    private Persona persona;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;

}
