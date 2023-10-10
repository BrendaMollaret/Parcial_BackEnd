package desarrollo.parcial_backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Domicilios")
public class Domicilio extends BaseEntity{

    private String calle;
    private int numero;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_PRODUCTO")
    private Localidad localidad;

}
