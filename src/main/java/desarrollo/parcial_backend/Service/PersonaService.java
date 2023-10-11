package desarrollo.parcial_backend.Service;

import desarrollo.parcial_backend.Entity.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long>{

    List<Persona> search (String filtro) throws Exception;
}
