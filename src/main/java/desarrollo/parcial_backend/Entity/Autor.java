package desarrollo.parcial_backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "Autor")

public class Autor extends BaseEntity {

    private String nombre;
    private String apellido;
    private String biografia;
}
