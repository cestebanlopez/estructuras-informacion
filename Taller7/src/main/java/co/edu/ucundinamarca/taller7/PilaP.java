package co.edu.ucundinamarca.taller7;


import org.apache.log4j.Logger;

public class PilaP {

    static Logger log = Logger.getLogger(PilaMain.class.getName());

    int tamaño=0;
    private NodoP ultimoingreso;
    String lista="";
    public PilaP() {
        ultimoingreso=null;
        tamaño=0;
    }


    public boolean PilaVacia(){
        return ultimoingreso==null;
    }


    public void insertar (Object elemento){
        NodoP nuevo=new NodoP(elemento);
        nuevo.siguiente=ultimoingreso;
        ultimoingreso=nuevo;
        tamaño++;

    }

    public Object eliminarNodo_Pop(){
        Object auxiliar=ultimoingreso.elemento;
        ultimoingreso=ultimoingreso.siguiente;
        tamaño--;
        return auxiliar;
    }


    public Object mostrarFinElemento_Top(){
        return ultimoingreso.elemento;
    }


    public int tamañoPila(){
        return tamaño;
    }


    public void vaciarPila(){
        while(!PilaVacia()){
            eliminarNodo_Pop();
        }

    }

    public void MostrarValores(){
        NodoP recorrido= ultimoingreso;
        while(recorrido!=null){
            lista +=recorrido.elemento +"\n";
            recorrido=recorrido.siguiente;
        }

        log.info(lista);
        lista="";
    }
}
