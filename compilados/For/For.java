import java.util.Scanner;
public class For{
    public static void main(String args[]){
        int tabla;

        Scanner in = new Scanner(System.in);

        System.out.println("¿La tabla de que numero quieres?");
        tabla = in.nextInt();

        for(int i = 0; i<10 ; i++){
            System.out.println( tabla + " x "+ (i+1)+ " = " + ((i+1) * tabla));
        }
    }
}