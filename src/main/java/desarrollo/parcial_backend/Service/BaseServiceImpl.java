package desarrollo.parcial_backend.Service;

import desarrollo.parcial_backend.Entity.BaseEntity;
import desarrollo.parcial_backend.Repository.BaseRepository;
import desarrollo.parcial_backend.Service.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<E extends BaseEntity, ID extends Serializable> implements BaseService<E,ID> {

    protected BaseRepository<E,ID> baseRepository;

    public BaseServiceImpl(BaseRepository<E,ID> baseRepository) {
        this.baseRepository = baseRepository;
    }
    //Spring va a obtener las dependencias que necesita el servicio, nosotros solo declaramos baseRepository

    @Override
    @Transactional
    public List<E> findAll() throws Exception {

        try{

            List<E> entities = baseRepository.findAll();
            return entities;

        } catch (Exception e) {
            throw new Exception("Error al intentar realizar la operación: " + e.getMessage());

        }
    }

    //PAGINACIÓN
    @Override
    @Transactional
    public Page<E> findAll(Pageable pageable) throws Exception {
        try{

            Page<E> entities = baseRepository.findAll(pageable);
            return entities;

        } catch (Exception e) {
            throw new Exception("Error al intentar realizar la operación: " + e.getMessage());

        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try{//Optional porque no sabemos si se va a encontrar una entidad con el Id

            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.orElse(null);

        } catch (Exception e) {
            throw new Exception("Error al intentar realizar la operación: " + e.getMessage());

        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = baseRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception("Error al intentar realizar la operación: " + e.getMessage());

        }
    }
    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try{

            Optional<E> entityOptional = baseRepository.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate = baseRepository.save(entity);
            return entityUpdate;

        } catch (Exception e) {
            throw new Exception("Error al intentar realizar la operación: " + e.getMessage());

        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try{
            if (baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("Entidad no encontrada con id: " + id);
            }
        } catch (Exception e) {
            throw new Exception("Error al intentar realizar la operación: " + e.getMessage());

        }
    }
}
