/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller6;

import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

/**
 *
 * @author CAMILO
 */
public class Principal {
static Logger log = Logger.getLogger(Main.class.getName());
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        listas lista1=new listas();
         Scanner teclado = new Scanner(System.in);
        
         int opcion=0;
      do{
          log.debug("Elija una opcion");
          log.debug("1.Ingreasar un nodo");
          log.debug("2.Mostrar la lista");
          log.debug("3.Buscar en la lista");
          log.debug("4.Modificar");
          log.debug("5.Salir");
          opcion=teclado.nextInt();
          switch(opcion){
              case 1:
                  log.debug("ingrese un nodo");
                  int dato=teclado.nextInt();
                  lista1.ingresar(dato);
                  break;
               
              case 2:   
                  log.debug("Mostrar Lista");
                  lista1.mostrar();
                  break;
              
              case 3:
                    log.info("Buscar");
                    log.info("Ingrese un dato a buscar");
                    int dato3 = teclado.nextInt();
                    lista1.buscar(dato3);
                break;

                case 4:
                    log.info("Ingrese un dato a modificar");
                    int dato4 = teclado.nextInt();
                    lista1.modificar(dato4);
                break;
                  
                  
          }
         }
      while(opcion!=5);
    }
    
}
