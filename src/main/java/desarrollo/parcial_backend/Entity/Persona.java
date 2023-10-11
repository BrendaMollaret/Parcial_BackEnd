package desarrollo.parcial_backend.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona extends BaseEntity{

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni")
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_DOMICILIO")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "fk_persona")
    private List<Libro> libros = new ArrayList<Libro>();


}
