package co.edu.ucundinamarca.taller8;


import org.apache.log4j.Logger;



public class Arbol <T extends Comparable<T>>{

    static Logger log = Logger.getLogger(ArbolPrin.class.getName());


    private Nodo<T> arbol;

    public boolean arbolVacio() {
        return arbol == null;
    }
    public Nodo<T> arbolRaiz() {
        return arbol;
    }
    public boolean Raiz(Nodo<T> nodo) {
        return arbol == nodo;
    }
    public boolean isLeaf(Nodo<T> nodo) {
        return nodo.hijoIzquierdo() == null && nodo.hijoDerecho() == null;
    }
    public boolean isInternal(Nodo<T> nodo) {
        return !isLeaf(nodo);
    }

    public Nodo<T> agregaNodo(Nodo<T> origen, T elemento) {

        Nodo<T> nodo = null;

        if (arbol == null) {
            nodo = new Nodo<>(elemento);
            arbol = nodo;
        } else if (origen == null) {
            log.info("El origen es nulo");
        } else {

            if (origen.getElement().compareTo(elemento) > 0) {
                if (origen.hijoIzquierdo() != null) {
                    nodo = agregaNodo(origen.hijoIzquierdo(), elemento);
                } else {
                    nodo = new Nodo<>(elemento);
                    nodo.setPadre(origen);
                    origen.setHijoIzquierdo(nodo);
                }

            } else {
                if (origen.hijoDerecho() != null) {
                    nodo = agregaNodo(origen.hijoDerecho(), elemento);
                } else {
                    nodo = new Nodo<>(elemento);
                    nodo.setPadre(origen);
                    origen.setDerecho(nodo);
                }

            }

        }
        return nodo;
    }
    public Nodo<T> agregaNodo(T elemento) {

        Nodo<T> nodo = null;

        if (arbol == null) {
            nodo = new Nodo<>(elemento);
            arbol = nodo;
        }else {

            Nodo<T> aux = arbol;
            boolean insertado = false;
            while (!insertado) {
                if (aux.getElement().compareTo(elemento) > 0) {

                    if (aux.hijoIzquierdo() != null) {
                        aux = aux.hijoIzquierdo();
                    } else {
                        nodo = new Nodo<>(elemento);
                        nodo.setPadre(aux);
                        aux.setHijoIzquierdo(nodo);
                        insertado = true;
                    }

                } else {

                    if (aux.hijoDerecho() != null) {
                        aux = aux.hijoDerecho();
                    } else {
                        nodo = new Nodo<>(elemento);
                        nodo.setPadre(aux);
                        aux.setDerecho(nodo);
                        insertado = true;
                    }
                }
            }
        }
        return nodo;
    }
    public void preOrden(Nodo<T> nodo) {
        log.info(nodo.getElement().toString());

        if (nodo.hijoIzquierdo() != null) {
            preOrden(nodo.hijoIzquierdo());
        }

        if (nodo.hijoDerecho() != null) {
            preOrden(nodo.hijoDerecho());
        }

    }
    public void inOrden(Nodo<T> nodo) {

        if (nodo.hijoIzquierdo() != null) {
            inOrden(nodo.hijoIzquierdo());
        }

        log.info(nodo.getElement().toString());

        if (nodo.hijoDerecho() != null) {
            inOrden(nodo.hijoDerecho());
        }
    }
    public void posOrden(Nodo<T> nodo) {
        if (nodo.hijoIzquierdo() != null) {
            posOrden(nodo.hijoIzquierdo());
        }

        if (nodo.hijoDerecho() != null) {
            posOrden(nodo.hijoDerecho());
        }

        log.info(nodo.getElement().toString());
    }


}
