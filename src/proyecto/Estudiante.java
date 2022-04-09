
package proyecto;
import java.util.Scanner;

public class Estudiante {
    
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    int i;
    int suma = 0;
    int[] notas = new int[3];
    Scanner entrada = new Scanner(System.in);
    
   /**
    *Metodo es para ingresar los datos 
    * de los estudiantes 
    */
   public void Ingreso(){
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
       
        //Bucle para introducir las 3 notas de lapso 
        for(i=0; i<notas.length; i++)
        {
            System.out.printf("Introduzca tu nota %d: ", i+1);
            notas[i] = entrada.nextInt();
        }
        

        for(i=0; i<notas.length; i++)
        {
            suma += notas[i];
        }
        System.out.println("");
        System.out.println("Su promedio de nota es " + suma / 3);
        System.out.println("");
        
       }
  

    }
 

