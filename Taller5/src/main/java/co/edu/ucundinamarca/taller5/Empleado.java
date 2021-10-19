package co.edu.ucundinamarca.taller5;

/**
 *
 * @author CAMILO
 */
public class Empleado {
    
    private String id;  
    private String nombres;    
    private String apellidos;    
    private Integer fechaIngreso;    
    private Double salario;
    
    public Empleado() {    
    }   
    public Empleado(String id, String nombres, String apellidos, 
            Integer fechaIngreso, Double salario) {        
        this.id = id;        
        this.nombres = nombres;        
        this.apellidos = apellidos;        
        this.fechaIngreso = fechaIngreso;        
        this.salario = salario;    
    }
    public Empleado(String id) {       
        this.id = id;    
    }    
    public String getId() {        
        return id;    
    }    
    public void setId(String id) {        
        this.id = id;    
    }    
    public String getNombres() {        
        return nombres;    
    }    
    public void setNombres(String nombres) {        
        this.nombres = nombres;    
    }    
    public String getApellidos() {        
        return apellidos;    
    }    
    public void setApellidos(String apellidos) {        
        this.apellidos = apellidos;    
    }    
    public Integer getFechaIngreso() {        
        return fechaIngreso;    
    }
     public void setFechaIngreso(Integer fechaIngreso) {       
         this.fechaIngreso = fechaIngreso;
     }
    public Double getSalario() {        
        return salario;    
    }    
    public void setSalario(Double salario) {        
        this.salario = salario;    
    }    
    
    @Override    
    public String toString() {        
        return String.format("EMPLEADO Código: %s  %s %s Año de ingreso: "
                + "%d Salario: %.2f", id, nombres, apellidos, fechaIngreso, 
                salario);    
    }    
    public boolean equals(Empleado obj) {        
        if (obj.getId().equals(id)) 
        {            
            return true;        
        } else {            
            return false;        
        }    
    }
}

