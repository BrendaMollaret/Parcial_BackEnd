package desarrollo.parcial_backend.Controller;

import desarrollo.parcial_backend.Entity.Persona;
import desarrollo.parcial_backend.Service.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "parcial/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro) {
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

}

