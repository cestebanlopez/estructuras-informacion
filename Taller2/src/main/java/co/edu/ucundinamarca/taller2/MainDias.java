package co.edu.ucundinamarca.taller2;

import static co.edu.ucundinamarca.taller2.Main.log;
import java.util.HashMap;
import java.util.Map;

public class MainDias {
    
    public static void main(String[] args) {
        
      Semana semanaUno = new Semana("Lunes", 1);
      Semana semanaDos = new Semana("Martes", 2);    

        Map<String, Semana> lista = new HashMap<String, Semana>();
        /*List<Colegio> listaColegio = new ArrayList<Colegio>();*/
        lista.put("Primero", semanaUno);
        lista.put("Segundo", semanaDos);
        
        for(Map.Entry<String, Semana> c : lista.entrySet()){
          log.info(c);      
        }
        
        
        
    }
}
