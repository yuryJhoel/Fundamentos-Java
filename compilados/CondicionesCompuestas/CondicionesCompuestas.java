import java.util.Scanner;

public class CondicionesCompuestas{
  public static void main(String args[]){
   String nombre;
   int clave, antiguedad;
   
   Scanner in = new Scanner(System.in);
   System.out.println("�Cual es tu nombre?");
   nombre = in.nextLine();
   System.out.println("�Clave del area en que trabaja ej: 1, 2 o 3?");
   clave = in.nextInt();
   System.out.println("�Cual es la antiguedad del trabajador en la empresa ej: 3, 5 ?");
   antiguedad = in.nextInt();
   
   if(clave == 1){
     if(antiguedad <= 1){
       System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " a�os de servicio");
       System.out.println("Merece 6 d�as de vacaciones");
     }else if(antiguedad <= 6){
       System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " a�os de servicio");
       System.out.println("Merece 14 d�as de vacaciones");

     }else if(antiguedad >= 7){
       System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " a�os de servicio");
       System.out.println("Merece 20 d�as de vacaciones");
     }   
   }else if(clave == 2){
     if(antiguedad <= 1){
       System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " a�os de servicio");
       System.out.println("Merece 7 d�as de vacaciones");
     }else if(antiguedad <= 6){
       System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " a�os de servicio");
       System.out.println("Merece 15 d�as de vacaciones");
     }else if(antiguedad >= 7){
       System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " a�os de servicio");
       System.out.println("Merece 22 d�as de vacaciones");
     }  
   }else if(clave == 3){
     if(antiguedad <= 1){
       System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " a�os de servicio");
       System.out.println("Merece 10 d�as de vacaciones");
     }else if(antiguedad <= 6){
       System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " a�os de servicio");
       System.out.println("Merece 20 d�as de vacaciones");
     }else if(antiguedad >= 7){
       System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " a�os de servicio");
       System.out.println("Merece 30 d�as de vacaciones");
     }  
   }
  }
}