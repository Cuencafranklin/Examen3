package FCUENCA.FCUENCA.Service;

import FCUENCA.FCUENCA.Entity.Persona;

import java.util.List;

public interface IPersonaService {

    // listar personasa

    List<Persona> listaPersonas();


    //Buscar persona por su dni
    Persona obtenerPersonaByDni(String idpersona);

}
