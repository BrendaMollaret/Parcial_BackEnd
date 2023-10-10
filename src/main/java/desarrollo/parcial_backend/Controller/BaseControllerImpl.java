package desarrollo.parcial_backend.Controller;

import desarrollo.parcial_backend.Entity.BaseEntity;
import desarrollo.parcial_backend.Service.ServiceImpl.BaseServiceImpl;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseControllerImpl<E extends BaseEntity, S extends BaseServiceImpl<E,Long>> implements BaseController<E,Long>{

    private S servicio;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\":\"Se produjo un error al intentar recuperar los recursos. Por favor, intente más tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"El recurso con ID " + id + " no se encontró.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Los datos proporcionados son inválidos o incompletos. Por favor, revise los datos e intente de nuevo.\"}");

        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
            //HttpStatus.OK: es una enumeración de Spring Framework que representa el código de estado HTTP 200, que indica que la solicitud fue exitosa.
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Los datos de la solicitud son inválidos. Por favor, revise los datos e intente de nuevo.\"}");
            //estás indicando que la solicitud tiene un formato incorrecto o es inválida.
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(Long id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.delete(id));
            //NO_CONTENT: La operación de eliminación se ha completado correctamente y no hay contenido adicional para enviar en la respuesta.
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"El recurso con ID " + id + " no existe. No se pudo eliminar.\"}");

        }
    }
}
