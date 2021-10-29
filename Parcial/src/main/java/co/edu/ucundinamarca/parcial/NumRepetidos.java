package co.edu.ucundinamarca.parcial;


import org.apache.log4j.Logger;

public class NumRepetidos {


    static Logger log =Logger.getLogger(NumRepetidos.class.getName());

    public Nodo primero;

    public Nodo ultimo;



    public NumRepetidos() {

        primero = null;

        ultimo = null;



    }



    public void Agregar(int numero) {

        Nodo nuevo = new Nodo();



        nuevo.dato = numero;



        if (primero == null) {

            primero = nuevo;

            nuevo.siguiente = null;

            ultimo = primero;

        } else {

            ultimo.siguiente = nuevo;

            nuevo.siguiente = null;

            ultimo = nuevo;

        }



    }



    public void mostrar() {

        Nodo actual = new Nodo();

        Nodo repetido = new Nodo();

        repetido = primero;



        actual = primero;

        while (actual != null) {

            log.info(actual.dato + "->");

            if (repetido.dato == actual.dato) {

                repetido.contadorRepetido++;

            }

            actual = actual.siguiente;



        }

        log.info("El numero repetido  "+repetido.dato +":"+ repetido.contadorRepetido + " veces");



    }
}
