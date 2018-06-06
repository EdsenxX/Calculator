import java.util.Scanner;

public class Teclado{
  public static void main(String args[]){
     Scanner usuario = new Scanner(System.in);
     String nombre = "";
     int n1 = 0, n2 = 0, resultado = 0, op = 0;

     System.out.println("PorFavor Ingresa Tu Nombre");
     nombre = usuario.nextLine();

     System.out.println("Bienvenido(a) " + nombre);
     System.out.println("Menu De Operaciones.");
     System.out.println("1.- Suma");
     System.out.println("2.- Resta");
     System.out.println("3.- Multiplicación");
     System.out.println("4.- División");
     System.out.println("5.- Salir");
     do{
       System.out.println("Selecciona Una Opcion");
       op = usuario.nextInt();
     }while(op<1 || op>5);
 
     switch(op){
       case 1:
       System.out.println("Suma");
       System.out.println("Introdusca Un Número");
       n1 = usuario.nextInt();
       System.out.println("Introdusca Un Segundo Número");
       n2 = usuario.nextInt();
       resultado = n1 + n2;
       System.out.println(n1 + " + " + n2 + " = " + resultado);
       n1 = 0;
       n2 = 0;
       resultado = 0;
       break;
       
       case 2:
       System.out.println("Resta");
       System.out.println("Introdusca Un Número");
       n1 = usuario.nextInt();
       System.out.println("Introdusca Un Segundo Número");
       n2 = usuario.nextInt();
       resultado = n1 - n2;
       System.out.println(n1 + " - " + n2 + " = " + resultado);
       n1 = 0;
       n2 = 0;
       resultado = 0;
       break;

       case 3:
       System.out.println("Multiplicación");
       System.out.println("Introdusca Un Número");
       n1 = usuario.nextInt();
       System.out.println("Introdusca Un Segundo Número");
       n2 = usuario.nextInt();
       resultado = n1 * n2;
       System.out.println(n1 + " * " + n2 + " = " + resultado);
       n1 = 0;
       n2 = 0;
       resultado = 0;
       break;

       case 4:
       System.out.println("División");
       System.out.println("Introdusca Un Número");
       n1 = usuario.nextInt();
       System.out.println("Introdusca Un Segundo Número");
       n2 = usuario.nextInt();
       resultado = n1 / n2;
       System.out.println(n1 + " / " + n2 + " = " + resultado);
       n1 = 0;
       n2 = 0;
       resultado = 0;
       break;
 
       case 5:
       break;
    
     }

  }
}