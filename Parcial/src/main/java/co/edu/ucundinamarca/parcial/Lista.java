package co.edu.ucundinamarca.parcial;


import org.apache.log4j.Logger;

public class Lista {

    static Logger log = Logger.getLogger(Listas.class.getName());

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
    public void mayorMenor(){

        Nodo dato = inicio;

      int mayor = 0, menor = 9999999;

      while(dato != null){
        if((dato.dato) > mayor){
          mayor = dato.dato;
        }
        if((dato.dato) < menor){
          menor = dato.dato;
        }
          dato = dato.siguiente;
      }
      log.info("El mayor elemento es: " + mayor);
        log.info("El menor elemento es: " + menor);

    }



}
