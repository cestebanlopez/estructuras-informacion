package co.edu.ucundinamarca.tallern;

import co.edu.ucundinamarca.taller3.Funciones;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

import org.junit.Test;


public class FuncionesTest {
    
    @Test
    public void testFunciones(){
       
        int funciones = Funciones.FactorialRec(5);

    assertEquals(120, funciones);

    }
    
    @Test
   
    public void FuncionesRecTest(){
        int funcionesRec = Funciones.FactorialRec(5);
        
        assertEquals(120, funcionesRec);
        
    }
            
    @Test
    
    public void Potencia(){
        
        int potencia = Funciones.Potencia(8, 2);
        
        assertEquals(64, potencia);
    }
       
       
               
               
            }

