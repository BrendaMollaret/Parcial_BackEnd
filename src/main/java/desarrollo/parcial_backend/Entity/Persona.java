package desarrollo.parcial_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Personas")
public class Persona extends BaseEntity{

    private String nombre;
    private String apellido;
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_DOMICILIO")
    private Domicilio domicilio;
}
