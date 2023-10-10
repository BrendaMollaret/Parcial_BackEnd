package desarrollo.parcial_backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "LocalidadController")
public class Localidad extends BaseEntity{

    private String denominacion;
}
