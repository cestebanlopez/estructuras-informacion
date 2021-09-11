package co.edu.ucundinamarca.taller2;

import java.util.*;

public class Semana {
    
    private Map dias = new HashMap();
    
    private String dia;
    private int numDia;

    public Semana(String dia, int cantidadDias) {
        this.dia = dia;
        this.numDia = cantidadDias;
    }
    
    
    @Override
    public String toString() {
        return "Dias: [ dia: " + dia + "Numero de dia: " + numDia + "]";
    }

    /**
     * @return the dias
     */
    public Map getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(Map dias) {
        this.dias = dias;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the cantidadDias
     */
    public int getCantidadDias() {
        return numDia;
    }

    /**
     * @param cantidadDias the cantidadDias to set
     */
    public void setCantidadDias(int cantidadDias) {
        this.numDia = cantidadDias;
    }
    
    
    
}
