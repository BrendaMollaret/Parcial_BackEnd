package desarrollo.parcial_backend.Service.ServiceImpl;

import desarrollo.parcial_backend.Entity.Autor;
import desarrollo.parcial_backend.Repository.AutorRepository;
import desarrollo.parcial_backend.Repository.BaseRepository;
import desarrollo.parcial_backend.Service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
