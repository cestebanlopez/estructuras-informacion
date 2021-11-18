
package co.edu.ucundinamarca.taller8;


import org.apache.log4j.Logger;


public class ArbolPrin {

    static Logger log = Logger.getLogger(ArbolPrin.class.getName());

    public static void main(String[] args) {

        Arbol<Integer> arbol = new Arbol<>();

        arbol.agregaNodo(8);
        arbol.agregaNodo(2);
        arbol.agregaNodo(4);
        arbol.agregaNodo(arbol.arbolRaiz(), 10);
        arbol.agregaNodo(arbol.arbolRaiz(), 12);
        arbol.agregaNodo(1);



        log.info("PreOrden");
        arbol.preOrden(arbol.arbolRaiz()); 
        // Resultado en pre orden 8, 4, 1, 10, 12
        System.out.println("");
        log.info("InOrden");
        arbol.inOrden(arbol.arbolRaiz());
        //Resultado en inOrden 1, 4, 8, 10, 12
        System.out.println("");
        log.info("PosOrden");
        arbol.posOrden(arbol.arbolRaiz());
        //Resultado en posOrden 1, 4, 12, 10, 8

    }

}
