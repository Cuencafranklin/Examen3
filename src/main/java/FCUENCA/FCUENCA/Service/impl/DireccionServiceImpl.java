package FCUENCA.FCUENCA.Service.impl;

import FCUENCA.FCUENCA.Dao.IDireccionDao;
import FCUENCA.FCUENCA.Entity.Direccion;
import FCUENCA.FCUENCA.Service.IDireccionService;
import org.springframework.beans.factory.annotation.Autowired;

public class DireccionServiceImpl implements IDireccionService {

    @Autowired
    private IDireccionDao DireccionDao;

    @Override
    public Direccion obtenerDireccionByNombre(String idpersona) {return this.DireccionDao.buscarDireccion(idpersona);}

}


