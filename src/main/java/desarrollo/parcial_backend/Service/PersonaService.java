package desarrollo.parcial_backend.Service;

import desarrollo.parcial_backend.Entity.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{

    List<Persona> search (String filtro) throws Exception;


    //PAGINACIÓN
    Page<Persona> search (String filtro, Pageable pageable) throws Exception;
}


