package co.edu.ucundinamarca.taller7;


import org.apache.log4j.Logger;

public class Cola {

    static Logger log = Logger.getLogger(ColaMain.class.getName());

    private NodoC cabeza, ultimo;


    public Cola(){
        cabeza = null;
        ultimo = null;

    }
    public boolean ColaVacia(){
        if(cabeza == null){
           return true;
        }else{
            return false;
        }
    }
    public void Insertar(String identificacion, String nombre, String tituloLibro){
      NodoC nuevoNodo = new NodoC();

      nuevoNodo.identificacion = identificacion;
      nuevoNodo.nombre = nombre;
      nuevoNodo.tituliLibro = tituloLibro;

      nuevoNodo.siguiente = null;

      if(ColaVacia()){
        cabeza = nuevoNodo;
        ultimo = nuevoNodo;
      }else{
          ultimo.siguiente = nuevoNodo;
          ultimo = nuevoNodo;
      }
    }
    public void MostrarContenido(){
      NodoC actual = new NodoC();
      actual = cabeza;

      do{
        log.info("ID " + actual.identificacion + " Nombre: " + actual.nombre + " Libro: " + actual.tituliLibro);
        actual = actual.siguiente;

      }while(actual != cabeza);
    }
}
