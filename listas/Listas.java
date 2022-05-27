
package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {
static  Scanner leer=new Scanner (System.in);
   
    public static void main(String[] args) {
      
        List<Datos> lis_nombres = new ArrayList<>();
        
       
        Datos da = new Datos();
        
        System.out.println("Ingrese el codigo");
        String codigo=leer.next();
        da.setCodigo(codigo);
       
        System.out.println("Ingrese un nombre");
        String nombre=leer.next();
        da.setNombre(nombre);
        
        System.out.println("Ingrese un alias");
        String alias=leer.next();
        da.setAlias(alias);
        
        System.out.println("Ingrese un correo");
        String correo=leer.next();
        da.setCorreo(correo);
        
        System.out.println("Ingrese su telefono");
        int telefono=leer.nextInt();
        da.setTelefono(telefono);
        /////////////////////////////////////////
        System.out.println("Ingrese el codigo del curso");
        String codigocurso=leer.next();
        da.setCodigoCurso(codigocurso);
       
        System.out.println("Ingrese un nombre del curso");
        String nombrecurso=leer.next();
        da.setNombreCurso(nombrecurso);
        /////////////////////////////////////////
        System.out.println("Ingrese el codigo del curso");
        String codigogrado=leer.next();
        da.setCodigoGrado(codigogrado);
       
        System.out.println("Ingrese un nombre del curso");
        String descripcion=leer.next();
        da.setDescripcion(descripcion);
        
        lis_nombres.add(da);
        
       
        System.out.println("Lista: " + lis_nombres.get(0).getCodigo()+" " + lis_nombres.get(0).getNombre()+" " + lis_nombres.get(0).getAlias()+" " + lis_nombres.get(0).getCorreo()+" " + lis_nombres.get(0).getTelefono());
        System.out.println("Lista: " + lis_nombres.get(0).getCodigoCurso()+" " + lis_nombres.get(0).getNombreCurso());
        System.out.println("Lista: " + lis_nombres.get(0).getCodigoGrado()+" " + lis_nombres.get(0).getDescripcion());
        
        
        
        /*lis_nombres.add("Walter");
    lis_nombres.add("papi");
    lis_nombres.add("Walter");
    lis_nombres.add("Walter");

    for(String n : lis_nombres){
        System.out.println("Nombre: "+ n);
        
    }
    System.out.println("Tamnaño: " + lis_nombres.size());

    System.out.println("Dato posicion 0:  " + lis_nombres.get(0));
    
    lis_nombres.remove(1);
    
    System.out.println("Tamaño: " + lis_nombres.size());*/
    
    
    
    
    }
    
}
