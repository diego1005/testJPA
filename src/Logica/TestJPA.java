package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;


public class TestJPA {


    public static void main(String[] args) {
        
        //Alumno alumno = new Alumno("34366813", "Diego", "Aguilar", new Date("10/29/1989"));
        //Alumno alumno2 = new Alumno("344475998", "Federico", "Kachuk", new Date("3/27/1990"));
                
        ControladoraPersistencia control = new ControladoraPersistencia();
        
        //control.crearAlumno(alumno2);
        
        //control.eliminarAlumno(alumno2.getDni());
        
        //List<Alumno> listaAlumnos = control.traerAlumnos();
        //listaAlumnos.get(1).setNombre("Jose");
        //System.out.println(listaAlumnos.get(1).getDni());
        //control.modificarAlumno(listaAlumnos.get(1));


        //Alumno alumno = control.traerAlumno("34447599");
        //alumno.setNombre("Federico");
        //control.modificarAlumno(alumno);
        
        Alumno alumno = control.traerAlumno("3447599");
        System.out.println(alumno.getNombre());
    }
    
}
