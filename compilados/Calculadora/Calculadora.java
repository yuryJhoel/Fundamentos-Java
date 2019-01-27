import java.util.Scanner;
public class Calculadora {

  public static void main(String arg[]){
    Scanner in = new Scanner(System.in);
    String nombre, reOperacion;
    int num1 = 0, num2 = 0, resultado =0, numOperacion=0;


    System.out.println("Cual es tu nombre");
    nombre = in.nextLine();
    
    do{
          System.out.println("Cual es el primer numero de tu operacion");
          num1 = in.nextInt();
          System.out.println("Cual es el segundo numero de tu operacion");
          num2 = in.nextInt();
          System.out.println("Que operacion quieres hacer 1 = suma, 2 = Resta, 3 = multiplicacion, 4 = division");
          numOperacion = in.nextInt();  
          reOperacion = "si";

      if(numOperacion == 1){
        resultado = num1 + num2;
        System.out.println(nombre +" el resultado de la suma es: " + resultado);
      }else if(numOperacion == 2){
        resultado = num1 - num2;
        System.out.println(nombre + " el resultado de la resta es: " + resultado);
      }else if(numOperacion == 3){
        resultado = num1 * num2;
        System.out.println(nombre + " el resultado de la multiplicacion es: "+ resultado);
      }else if(numOperacion == 4){
        resultado = num1 / num2;
        System.out.println(nombre + " el resultado de la division es: " + resultado);
      }else {
        System.out.println(nombre + "Esa operacion no existe en el sistema");
      }
    }while(reOperacion == "si");
  }
}