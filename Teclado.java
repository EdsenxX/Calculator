import java.util.Scanner;

public class Teclado{
  public static void main(String args[]){
     Scanner usuario = new Scanner(System.in);
     String nombre = "";
     int n1 = 0, n2 = 0, resultado = 0;

     System.out.println("PorFavor Ingresa Tu Nombre");
     nombre = usuario.nextLine;

     System.out.println("Bienvenido(a) " + nombre);
     System.out.println("Menu De Operaciones.");
     System.out.println("1.- Suma");
     System.out.println("2.- Resta");
     System.out.println("3.- Multiplicación");
     System.out.println("4.- División");
     System.out.println("Selecciona Una Opcion");
     do{
       op = usuario.nextInt;
     }while(op<1 or op>4);
 
     switch(op);

  }
}