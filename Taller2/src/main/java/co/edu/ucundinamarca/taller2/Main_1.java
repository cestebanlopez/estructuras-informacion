
package co.edu.ucundinamarca.taller2;

import org.apache.log4j.Logger;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        
        Persona personaUno = new Persona("Deiber", 50, 230, 123456);
        Persona personaDos = new Persona("Alejandro", 50, 230, 123456);

        if (personaUno.equals(personaDos)) {
            log.info("******* Instacias Iguales *********");
        } else {
            log.info("******* Instacias Diferentes *********");
        }
        
        Animal animalUno = new Animal("Tony", "Pastor Aleman", 4, 7, 123456);
        Animal animalDos = new Animal("Milu", "Pastor Aleman", 4, 9, 654321);
        
        if (personaUno.equals(personaDos)) {
          log.info("******* Instacias Iguales *********");
        } else {
          log.info("******* Instacias Diferentes *********");
        }
        
    }

}
