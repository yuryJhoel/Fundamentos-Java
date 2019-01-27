import java.util.Scanner;
public class SwitchCase{

  public static void main(String args[]){
  int num1, num2, resultado, parametro;

  Scanner in = new Scanner(System.in);
  System.out.println("Dame el numero 1");
  num1 = in.nextInt();
  System.out.println("Dame el segundo numero");
  num2 = in.nextInt();
  System.out.println("Quer operacion deses hacer 1 = (+), 2 = (-), 3 = (x), 4 = (/) ");
  parametro = in.nextInt();
  

    switch(parametro){
		case 1: resultado = num1 + num2;
				System.out.println("El resultado de la suma es: "+ resultado);
				break;
		case 2: resultado = num1 - num2;
		        System.out.println("El resultado de la resta es: " + resultado);
				break;
		case 3: resultado = num1 * num2;
				System.out.println("El resultado de la multiplicaion es: " + resultado);
				break;
		case 4: resultado = num1 / num2;
				System.out.println("El resultado de la division es: " + resultado);
				break;
        default: System.out.println("Error: La opcion no existe");
                break;
	}
 }
}