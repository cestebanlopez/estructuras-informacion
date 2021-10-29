package co.edu.ucundinamarca.parcial;

public class Nodo {

    public int dato;
    public Nodo siguiente;
    public int contadorRepetido = 0;

    public Nodo(){
        this.dato = dato;
    }
    public Nodo(int d, Nodo n){
        dato = d;
        siguiente = n;
    }
}
