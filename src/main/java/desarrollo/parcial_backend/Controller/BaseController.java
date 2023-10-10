package desarrollo.parcial_backend.Controller;

import desarrollo.parcial_backend.Entity.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<E extends BaseEntity, ID extends Serializable> {

    public ResponseEntity<?> getAll();

    public ResponseEntity<?> getOne(@PathVariable ID id);
    //@PathVariable antes de un parámetro del método en un controlador de Spring,
    //le indicas a Spring que debe extraer ese valor de la URL.

    public ResponseEntity<?> save(@RequestBody E entity);

    /* @RequestBody Esta anotación se utiliza para indicar que un parámetro del método debe extraerse
    del cuerpo de la solicitud HTTP. Cuando enviamos datos en el cuerpo de una solicitud
    (por ejemplo, en formato JSON o XML), @RequestBody se utiliza para convertir esos datos en un objeto Java.*/

    public ResponseEntity<?> update(@PathVariable ID id,@RequestBody E entity);

    public ResponseEntity<?> delete(@PathVariable ID id);

    //@PathVariable extrae valores de la URL.
    //@RequestBody convierte datos del cuerpo de la solicitud en un objeto Java.

}
