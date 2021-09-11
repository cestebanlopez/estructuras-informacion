package co.edu.ucundinamarca.taller2;

import java.util.Objects;

public class Animal {

  private String nombre, especie;    
  private int patas, edad, id;

    public Animal(String nombre, String especie, int patas, int edad, int id) {
        this.nombre = nombre;
        this.especie = especie;
        this.patas = patas;
        this.edad = edad;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal [ nombre: " + nombre + " Especie: " + especie + " Patas: " + patas + " Edad: " + edad + "ID: " + id + "]";
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

        Animal that = (Animal) obj;
        return Objects.equals(this.getNombre(), that.getNombre())
                && Objects.equals(this.getEdad(), that.getEdad())
                && Objects.equals(this.getPatas(), that.getPatas())
                && Objects.equals(this.getId(), that.getId());
    }

    @Override
    public int hashCode() {
      int result = 17;
      result = 31 * result + getEdad();
      result = 31 * result + getPatas();
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
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the patas
     */
    public int getPatas() {
        return patas;
    }

    /**
     * @param patas the patas to set
     */
    public void setPatas(int patas) {
        this.patas = patas;
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
