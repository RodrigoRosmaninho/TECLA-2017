import java.util.ArrayList;
import java.util.Scanner;

public class Lider {
    
    static int n;
    static int m;
    static ArrayList<Integer> mesa;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        in.nextLine();
        m = in.nextInt();
        
        mesa = new ArrayList<Integer>(n);
        
        for(int i = 0; i <= n - 1 ; i++) {
            mesa.add(i + 1);
        }
        
        int posicao = n;
        
        for(int i = 0; i <= n - 2 ; i++) {
            int novaPosicao = posicao;
            
            for(int x = 0; x < m; x++) {
                if((novaPosicao + 1) > mesa.size()) {
                    novaPosicao = 1;
                }
                else {
                    novaPosicao = novaPosicao + 1;
                }
            }
            
            mesa.remove(novaPosicao - 1);
            mesa.trimToSize();
            
            posicao = novaPosicao - 1;
        }
        
        System.out.println(mesa.get(0));
        
    }
}
