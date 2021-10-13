package co.edu.ucundinamarca.tallern;

import co.edu.ucundinamarca.taller3.Dulces;
import co.edu.ucundinamarca.taller3.Dulces;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.Test;

public class TestImprimirIterando {

    @Test
    public void testDulces() {

      assertEquals(Dulces.imprimirSinIterador("ChocoRamo", 10), "ChocoRamo");

    }
}
