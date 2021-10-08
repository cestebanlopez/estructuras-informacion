package co.edu.ucundinamarca.taller3;

public class Dulces {
    
    public static void main(String[] args) {
        
        Dulces arrayList[]=new Dulces[10]; 
        arrayList[0]=new Dulces("Pipiolo");
        arrayList[1]=new Dulces("Detodito");
        arrayList[2]=new Dulces("Chocobreak");
        arrayList[3]=new Dulces("Bombombum");
        arrayList[4]=new Dulces("Frunas");
        arrayList[5]=new Dulces("Galletas");
        arrayList[6]=new Dulces("Chocolatina");
        arrayList[7]=new Dulces("Tostacos");
        arrayList[8]=new Dulces("Gomitas");
        arrayList[9]=new Dulces("Choco Ramo");
        
     
    }

   public Dulces (String nombre){
       this.nombre=nombre;
    }
    
   public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
  private String nombre;
}

