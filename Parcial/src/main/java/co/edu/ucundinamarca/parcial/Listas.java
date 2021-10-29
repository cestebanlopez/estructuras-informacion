
package co.edu.ucundinamarca.parcial;


import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Listas {

    static Logger log = Logger.getLogger(Listas.class.getName());

    public static void main(String[] args) {


        Scanner intr = new Scanner(System.in);



        Lista lista1 = new Lista();
        NumRepetidos listita = new NumRepetidos();

        int opcion = 0;

        do{

            try{
                log.info("1. Ingrese un numero a la lista ");
                log.info("2. Mostrar lista");
                log.info("3. Salir");

                log.info("Su opcion es: ");
                opcion = intr.nextInt();

                switch(opcion){
                    case 1:
                        try{
                            log.info("Ingrese el numero que desea agregar a la lista ");
                            int numero = intr.nextInt();
                            lista1.agregaNodo(numero);
                        }catch(NumberFormatException n){
                            log.info("Error");
                        }
                        break;
                    case 2:
                        lista1.mostrarLista();
                        lista1.mayorMenor();
                        break;
                }

            }catch (Exception e){

            }

        }while(opcion != 3);


        listita.Agregar(0);
        listita.Agregar(9);
        listita.Agregar(0);
        listita.Agregar(8);
        listita.Agregar(0);
        listita.Agregar(20);



        listita.mostrar();

    }

}

