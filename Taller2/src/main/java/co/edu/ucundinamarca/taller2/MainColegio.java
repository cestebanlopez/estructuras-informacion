package co.edu.ucundinamarca.taller2;

import static co.edu.ucundinamarca.taller2.Main.log;
import java.util.*;
import java.util.Map.*;


public class MainColegio {
    public static void main(String[] args) {
        
        Colegio colegioUno = new Colegio(19, "Lopez", "Colombiano");
        Colegio colegioDos = new Colegio(19, "Martinez", "Venezolano");
        
        Map<String, Colegio> lista = new HashMap<String, Colegio>();
        /*List<Colegio> listaColegio = new ArrayList<Colegio>();*/
        lista.put("Primero", colegioUno);
        lista.put("Segundo", colegioDos);
        
        for(Entry<String, Colegio> c : lista.entrySet()){
          log.info(c);      
        }
       
        
    }
    
    
}
