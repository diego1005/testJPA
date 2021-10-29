package Persistencia;

import Logica.Alumno;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJPA = new AlumnoJpaController();
    
    public void crearAlumno (Alumno alu) {

        try {
            aluJPA.create(alu);
        } catch (Exception ex) {
            System.out.println("Error al crear: " + ex.getMessage());
        }
        
    }

    public void eliminarAlumno(String idAlumno) {
        try {
            aluJPA.destroy(idAlumno);
        } catch (NonexistentEntityException ex) {
           System.out.println("Error al eliminar: " + ex.getMessage());
        }
    }

    public void modificarAlumno(Alumno alumno) {
        try {
            aluJPA.edit(alumno);
        } catch (Exception ex) {
           System.out.println("Error al modificar: " + ex.getMessage()); 
        }
    }

    public List<Alumno> traerAlumnos() {
        List<Alumno> listaAlumnos = aluJPA.findAlumnoEntities();
        return listaAlumnos;
    }

    public Alumno traerAlumno(String id) {
        Alumno alumno = aluJPA.findAlumno(id);
        return alumno;
    }
    
}
