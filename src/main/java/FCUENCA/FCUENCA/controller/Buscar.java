package FCUENCA.FCUENCA.controller;
import FCUENCA.FCUENCA.Entity.Direccion;
import FCUENCA.FCUENCA.Entity.Estudiante;
import FCUENCA.FCUENCA.Entity.Persona;
import FCUENCA.FCUENCA.Service.IDireccionService;
import FCUENCA.FCUENCA.Service.IEstudianteService;
import FCUENCA.FCUENCA.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("index")
public class Buscar {

    @Autowired
    private IPersonaService personaService;
    private IEstudianteService estudianteService;
    private IDireccionService direccionService;

    @GetMapping("/listaPersonas")

    public List<Persona> listaPersona(){
        return this.personaService.listaPersonas();

    }
    @GetMapping("/buscarEstudiantes")

    public Estudiante buscarEstudiante(@RequestParam("codigo") String codigo){
        return (Estudiante) this.estudianteService.obtenerEstudianteByCodigo(codigo);

    }
    @GetMapping ("/buscarProfesor")
    public Persona buscarPersona(@RequestParam("idpersona") String idpersona){
        return this.personaService.obtenerPersonaByDni(idpersona);
    }

    @GetMapping("/buscarDireccion")

    public Direccion buscarDireccion(@RequestParam("idpersona") String idpersona){
        return (Direccion) this.direccionService.obtenerDireccionByNombre(idpersona);

    }
}
