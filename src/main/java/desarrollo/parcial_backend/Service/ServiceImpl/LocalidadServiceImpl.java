package desarrollo.parcial_backend.Service.ServiceImpl;

import desarrollo.parcial_backend.Entity.Localidad;
import desarrollo.parcial_backend.Repository.BaseRepository;
import desarrollo.parcial_backend.Repository.LocalidadRepository;
import desarrollo.parcial_backend.Service.LocalidadService;

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    private LocalidadRepository localidadRepository;
     public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}
