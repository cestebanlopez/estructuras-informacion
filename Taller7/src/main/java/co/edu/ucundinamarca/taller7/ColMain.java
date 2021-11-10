
package co.edu.ucundinamarca.taller7;


import org.apache.log4j.Logger;


public class ColMain {

    static Logger log = Logger.getLogger(ColMain.class.getName());

    public static void main(String[] args) {

        Col colad= new Col();
        colad.insertarInicial(30);
        colad.insertarInicial(25);
        colad.insertarFinal(10);
        colad.insertarFinal(9);
        colad.insertarFinal(8);
        colad.insertarInicial(7);


        log.info(colad.toString());

        colad.removerInicial();
        colad.removerInicial();
        colad.removerFinal();

        log.info(colad.toString());

    }

}
