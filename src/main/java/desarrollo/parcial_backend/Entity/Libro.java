package desarrollo.parcial_backend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "libros")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
