public class Fibonacci {
    public static void main (String args[]){
        int a,b,c,count;
        a = 0;
        b = 1;
        count = 0;
        System.out.println("la sucesion con do-while es: ");
        do{
            c = a+b;
            System.out.println(a);
            a = b;
            b = c;
            count++;
        }while(count <= 7);
            System.out.println("");
    }
}