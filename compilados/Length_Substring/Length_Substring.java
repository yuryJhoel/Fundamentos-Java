import java.util.Scanner;
public class Length_Substring{
    public static void main(String args[]){
        String cadena, cadenaDeseada;
        int corteInicial, corteFinal;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa un cadena de caracteres");
        cadena = in.nextLine();
        System.out.println("¿Que parte de la cadena desea obtener desde ....?: ");
        corteInicial = in.nextInt();
        System.out.println("¿Hasta ...? : ");
        corteFinal = in.nextInt();
        
        cadenaDeseada = cadena.substring(corteInicial, corteFinal);

        System.out.println("El ancho de los caracteres que introduciste es: " + cadena.length());
        System.out.println("El texto que deseabas obtener es el siguiente : "+ cadenaDeseada);
    }
}