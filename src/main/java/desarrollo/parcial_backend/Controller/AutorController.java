package desarrollo.parcial_backend.Controller;

import desarrollo.parcial_backend.Entity.Autor;
import desarrollo.parcial_backend.Service.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "parcial/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}
