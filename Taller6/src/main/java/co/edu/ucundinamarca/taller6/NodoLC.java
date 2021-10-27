package co.edu.ucundinamarca.taller6;

public class NodoLC {
    int dato;
    NodoLC siguiente;
    public NodoLC(int d){
        dato = d;
        siguiente = this;
    }
}
