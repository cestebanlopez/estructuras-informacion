package co.edu.ucundinamarca.taller7;



import java.util.logging.Logger;

public class Col implements ColDL {

    static final Logger log = Logger.getLogger(ColMain.class.getName());


    NodoCol cola;
    NodoCol cabeza;
    public int contador;
    String organizar;

    public Col() {

        cola=null;
        cabeza=null;
        contador=0;

    }


    @Override
    public void insertarIncial(Object elemento) {

    }

    @Override
    public void insertarInicial(Object elemento) {
        if(cabeza==null){
            cabeza= new NodoCol();
            cabeza.elemento=elemento;
            cola=cabeza;

        }else{
            NodoCol nuevo= new NodoCol();
            nuevo.elemento=elemento;
            nuevo.siguiente=cabeza;
            cabeza.anterior=nuevo;
            cabeza=nuevo;
        }
        contador++;
    }

    @Override
    public void insertarFinal(Object elemento) {
        if(cola==null){
            cola= new NodoCol();
            cola.elemento=elemento;
            cabeza=cola;

        }else{
            NodoCol nuevo= new NodoCol();
            nuevo.elemento=elemento;
            nuevo.anterior=cola;
            cola.siguiente=nuevo;
            cola=nuevo;
        }
        contador++;
    }

    @Override
    public void removerIncial() {

    }


    @Override
    public void removerInicial() {
        cabeza=cabeza.siguiente;
        cabeza.anterior=null;
    }

    @Override
    public void removerFinal() {
        cola=cola.anterior;
        cola.siguiente=null;

    }

    @Override
    public int tamaño() {
        return contador;
    }

    @Override
    public String toString(){
        String t="cabeza[";
        for(NodoCol h= cabeza;h!=null;h=h.siguiente){
            t+=h.elemento+"-";
        }
        return t+"]cola";
    }

}
