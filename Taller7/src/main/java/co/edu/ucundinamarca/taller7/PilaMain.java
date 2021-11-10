
package co.edu.ucundinamarca.taller7;


import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class PilaMain {

    static Logger log = Logger.getLogger(PilaMain.class.getName());

    public static void main(String[] args) {

        PilaP pila= new PilaP();
        pila.insertar("c");
        pila.insertar("a");
        pila.insertar("m");
        pila.insertar("i");
        pila.MostrarValores();
    }

}
