package clase01;

import javax.swing.JOptionPane;
 
public class Clase01 {
    public static void main(String[] args) {
 
        Object tempObj = 22; 
        tempObj = "Hola";  
        String cadena = "HOLA esto es una cadena DE CARACTERES.";
          
        // Iteración chars de cadena y output consola
        for(int a=0;a<cadena.length();a++){
            System.out.print(cadena.charAt(a));
        }  
        System.out.println("");
        
        iteracionUpper(cadena); 
        iteracionLower(cadena); 
        
        System.out.println("###### Cadenas Upper y Lower #############" );
        System.out.println("Cadena Upper : " + cadena.toUpperCase());
        System.out.println("Cadena Lower : " + cadena.toLowerCase());
        
        // Show message in JOPane Swing 
        JOptionPane.showMessageDialog(null, cadena ); 
    }  
    
    public static void iteracionUpper(String message) {
        for(int a=0;a<message.length();a++){
            char car=message.charAt(a);
            if(car>=97 && car<=122) car-=32;
            System.out.print(car);
        }
        System.out.print("\n");
    }
     
    public static void iteracionLower(String message) {
        char car;
        for(int a=0;a<message.length();a++){
            car=message.charAt(a);
            System.out.print((car>=97 && car<=122)?car-=32:car);
        }
        System.out.print("\n");
    }
}  