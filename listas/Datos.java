
package listas;


public class Datos extends Cursoo{
    private String codigo;
    private String nombre;
    private String alias;
    private String correo;
    private Integer telefono;
    
    public String getCodigo(){
        
       return codigo;
    }
    
     public void setCodigo(String codigo){
        
       this.codigo = codigo;
     }
    
    public String getNombre(){
       return nombre;
    }
    
     public void setNombre(String nombre){
        
       this.nombre = nombre;
     }
     
      public String getAlias(){
       return alias;
    }
    
     public void setAlias(String alias){
        
       this.alias = alias;
     }

    public String getCorreo(){
       return correo;
    }
    
     public void setCorreo(String correo){
        
       this.correo = correo;
     }
     
     public Integer getTelefono(){
        
       return telefono;
    }
    
     public void setTelefono(Integer telefono){
        
       this.telefono = telefono;
     }


}
