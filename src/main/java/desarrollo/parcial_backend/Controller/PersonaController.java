package desarrollo.parcial_backend.Controller;

import desarrollo.parcial_backend.Entity.Persona;
import desarrollo.parcial_backend.Service.ServiceImpl.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "parcial/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{
}
