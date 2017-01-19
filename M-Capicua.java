import java.util.Scanner;

public class Capicua {
    
    static int numero;
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       numero = in.nextInt();
       int possivelCapicua = Integer.parseInt(new StringBuilder(String.valueOf(numero)).reverse().toString());
       
       while(possivelCapicua != numero) {
           numero = numero + 1;
           possivelCapicua = Integer.parseInt(new StringBuilder(String.valueOf(numero)).reverse().toString());
       }
       
       System.out.println(numero);
       
       
   } 
}
