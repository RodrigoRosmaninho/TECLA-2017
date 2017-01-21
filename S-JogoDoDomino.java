import java.util.Scanner;

public class JogoDoDomino {
    
    static int pecas;
    static int resultado = 1;
    static int numeroImpares = 0;
    static int[] numeros;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        numeros = new int[] {0, 0, 0, 0, 0, 0, 0};
        
        pecas = in.nextInt();
        in.nextLine();
        
        for(int i = 0; i <= pecas - 1; i++) {
            String[] pecaIndividual = in.nextLine().split(" ");
            int lado1 = Integer.parseInt(pecaIndividual[0]);
            int lado2 = Integer.parseInt(pecaIndividual[1]);
            
            numeros[lado1] = numeros[lado1] + 1;
            numeros[lado2] = numeros[lado2] + 1;
        }
        
        for(int i = 0; i <= 6; i++) {
            if((numeros[i] % 2) != 0) {
                numeroImpares = numeroImpares + 1;
            }
        }
        
        if(numeroImpares > 2) {
            resultado = 0;
        } 
        
        System.out.println(resultado);
        
    }
}
