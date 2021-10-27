package co.edu.ucundinamarca.taller6;

import co.edu.ucundinamarca.taller6.Main;
import co.edu.ucundinamarca.taller6.Nodo;
import org.apache.log4j.Logger;

public class Lista {

    static Logger log = Logger.getLogger(Main.class.getName());

    protected Nodo inicio, fin;

    public Lista(){
        inicio = null;
        fin = null;
    }
    public void agregaNodo(int elemento){
        inicio = new Nodo(elemento, inicio);
        if(fin == null){
          fin = inicio;
        }
    }
    public void mostrarLista(){
        Nodo recorrer = inicio;
        while(recorrer != null){
          log.info("[" + recorrer.dato +"]--->");
          recorrer = recorrer.siguiente;
        }
    }
}
