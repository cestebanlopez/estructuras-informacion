package co.edu.ucundinamarca.taller2;

import java.util.Objects;

public class Persona {
    
    private String nombre;
    private int edad, altura, id; 

    public Persona(String nombre, int edad, int altura, int id) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.id = id;
    }
    
    
    

    @Override
    public String toString() {
        return "Persona [ nombre: " + nombre + " Edad: " + edad + " Estatura: " + altura + " ID: " + id + "]"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Persona that = (Persona) obj;
        return Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getAltura(), that.getAltura())
                && Objects.equals(this.getId(), that.getId());
    }

    @Override
    public int hashCode() {
      int result = 17;
      result = 31 * result + getEdad();
      result = 31 * result + getId();
      return result;
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

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
