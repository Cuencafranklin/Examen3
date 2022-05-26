package FCUENCA.FCUENCA.Dao;


import FCUENCA.FCUENCA.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProfesorDao  extends JpaRepository<Profesor,Long> {



}
