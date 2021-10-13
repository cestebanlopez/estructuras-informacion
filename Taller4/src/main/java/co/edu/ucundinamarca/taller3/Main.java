
package co.edu.ucundinamarca.taller3;


import org.apache.log4j.Logger;
import java.util.Scanner;
import static junit.framework.TestCase.assertTrue;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Dulces.class.getName());

    public static void main(String[] args) {

        Scanner intr = new Scanner(System.in);

        Dulces objetoDulce = new Dulces();

        objetoDulce.imprimirIterando("BombonBum");
        objetoDulce.imprimirIterando("chocobreak");
        objetoDulce.imprimirIterando("Tostacos");
        objetoDulce.imprimirIterando("Merengones");
        objetoDulce.imprimirIterando("Xtime");
        objetoDulce.imprimirIterando("Bocadillo");
        objetoDulce.imprimirIterando("Pipiolo");
        objetoDulce.imprimirIterando("Chocolatina");
        objetoDulce.imprimirIterando("PAn de Yuca");
        objetoDulce.imprimirIterando("ChcoRamo");

        objetoDulce.mostrarLista();


        Dulces.imprimirSinIterador("ChocoRamo", 10);


    }

}