package co.edu.ucundinamarca.taller2;

import java.util.*;

public class Colegio {

    private Map alumno = new HashMap();
    
    private String nombre, nacionalidad;
    private int edad;

    public Colegio(int edad, String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }
    
public int cuantosAlumnos() {
        return getAlumno().size();
        
        
        
    }

    public void borrarAlumnos(String nac) {
        getAlumno().remove(nac);
    }

    /**
     * @return the alumno
     */
    public Map getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Map alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante: [ edad: " + edad + " Nombre: " + nombre + " Nacionalidad: " + nacionalidad + "]";
    }


}
