package FCUENCA.FCUENCA.Service.impl;

import FCUENCA.FCUENCA.Dao.IEstudianteDao;
import FCUENCA.FCUENCA.Entity.Estudiante;
import FCUENCA.FCUENCA.Service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;


    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {return this.estudianteDao.buscarEstudiante(codigo);}
}
