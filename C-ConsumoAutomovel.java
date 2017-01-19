import java.util.Scanner;


public class ConsumoAutomovel {
    
    static float distancia, deposito, resultado;

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        distancia = Float.valueOf(in.next());
        deposito = Float.valueOf(in.next());
        
        resultado = (deposito/distancia) *100;
        
        System.out.printf("%.2f", resultado);
        System.out.print("\n");
        
    }
    
}
