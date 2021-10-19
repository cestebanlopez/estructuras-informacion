package co.edu.ucundinamarca.taller5;

import java.util.Objects;

public class Lista {    
    protected  Nodo inicio, fin; 
//Punteros para saber donde esta el inicio y el fin    
public Lista() {        
    inicio = null;
    fin = null;    
} 

//Metodo para dejar vacia una lista    
public boolean estaVacia() {        
    if (inicio == null) {            
        return true;
    }else {            
     return false;
    }  
}
 //Metodo para agregar un Nodo al inicio de la lista    
public void agregarAlInicio(Object elemento) {        
    Nodo nuevo = new Nodo(elemento, inicio, fin);
        if (estaVacia()) {            
            inicio = nuevo;
            inicio.sig = inicio;            
            inicio.ant = inicio;            
            fin = inicio;        
        } else {            
            Nodo aux = inicio;
            while 
            (aux.getSig() != inicio) 
            {                
            aux = aux.getSig();
            aux.setSig(nuevo);            
            nuevo.setAnt(aux);           
            nuevo.setSig(inicio);            
            inicio.setAnt(nuevo);            
            inicio = nuevo;        }    
}
}
}
