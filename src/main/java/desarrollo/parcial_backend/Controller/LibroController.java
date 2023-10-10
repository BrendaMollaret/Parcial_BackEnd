package desarrollo.parcial_backend.Controller;

import desarrollo.parcial_backend.Entity.Libro;
import desarrollo.parcial_backend.Service.ServiceImpl.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "parcial/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{
}
