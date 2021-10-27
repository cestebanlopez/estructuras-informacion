package co.edu.ucundinamarca.taller6;

import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

/**
 *
 * @author CAMILO
 */
public class listas {
     static Logger log = Logger.getLogger(Main.class.getName());
 Scanner teclado = new Scanner(System.in);
    nodos primero;
    nodos ultimo;
    
    public listas(){
        primero=null;
        ultimo=null;
    }
   public void ingresar(int x){
       nodos nuevo=new nodos();
       nuevo.datos=x;
       if(primero==null){
           primero=nuevo;
           primero.siguiente=primero;
           primero.anterior=ultimo;
           ultimo=nuevo;
       }else{
           ultimo.siguiente=nuevo;
           nuevo.siguiente=primero;
           ultimo=nuevo;
           primero.anterior=ultimo;
       }
   }
       
       public void mostrar(){
           nodos actual=new nodos();
           actual=primero;
           do{
               log.debug(actual.datos);
               actual=actual.siguiente;
           }while(actual!=primero);
       }
      
       public void buscar (int x){
    nodos actual = new nodos();
    actual=ultimo;
    boolean encontrado=false;
    int dato = 0;
    do{
        if (actual.datos==x){
            encontrado = true;
            dato=actual.datos;
        }

    }while(actual!=ultimo);
    if(encontrado ==true){
        log.debug("Nodo encontrado");
        log.debug(dato);
    }else{
        log.debug("Nodo no encontrado");
    }
    
}
public void modificar (int x){
    nodos actual = new nodos ();
    actual.datos=x;
    do{
        if(actual.datos==x){
           log.debug("Ingrese un nuevo valor");  
            actual.datos=teclado.nextInt();
        }
        actual=actual.siguiente;
    }while (actual!=primero);
}
       
           
       }
   
    
