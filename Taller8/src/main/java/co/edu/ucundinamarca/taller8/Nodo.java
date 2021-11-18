package co.edu.ucundinamarca.taller8;

public class Nodo <T extends Comparable<T>>{

    private T element;
    private Nodo<T> padre;
    private Nodo<T> izquierdo;
    private Nodo<T> derecho;

    public Nodo(T element) {
        this.element = element;
    }
    public Nodo(T element, Nodo<T> padre, Nodo<T> izquierdo, Nodo<T> derecho) {
        this.element = element;
        this.padre = padre;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    public Nodo(T element, Nodo<T> padre) {
        this.element = element;
        this.padre = padre;
    }
    public Nodo(T element, Nodo<T> izquierdo, Nodo<T> derecho) {
        this.element = element;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
    public Nodo<T> getPadre() {
        return padre;
    }

    public void setPadre(Nodo<T> padre) {
        this.padre = padre;
    }
    public Nodo<T> hijoIzquierdo() {
        return izquierdo;
    }

    public void setHijoIzquierdo(Nodo<T> izquierdo) {
        this.izquierdo = izquierdo;
    }
    public Nodo<T> hijoDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo<T> derecho) {
        this.derecho = derecho;
    }

}
