package desarrollo.parcial_backend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Personas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona extends BaseEntity{

    private String nombre;
    private String apellido;
    private int dni;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_DOMICILIO")
    private Domicilio domicilio;
}
