import java.util.Scanner;
public class MatricesBidimensionales2 {
    public static void main(String args[]){
        int filas, columnas, contador;
        contador = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("¿Cuantas filas deseas?: ");
        filas = in.nextInt();
        System.out.println("¿Cuantas columnas deseas?:  ");
        columnas = in.nextInt();

        
        int caja [][] = new int[filas][columnas];

        for(int i= 0; i<filas; i++){
            for(int j = 0; j < columnas; j++){
                caja[i][j] = contador;
                contador++;

                System.out.print("[" +caja[i][j] + "]");
            }
            System.out.println("");
        }

    }
}