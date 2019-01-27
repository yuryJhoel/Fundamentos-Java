import java.util.Scanner;
public class Equals {
    public static void main(String args[]){
        String nombre;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Quien eres para entrar este sistemas en minuscula el nobre please");
        nombre = in.nextLine();

        if(nombre.equals("yury")){
            System.out.println("Bienvenido a casa Yury");
        }else {
            System.out.println("¿En verdad eres mi creado?");
        }
    }
}