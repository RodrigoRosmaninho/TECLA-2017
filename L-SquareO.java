import java.util.Scanner;

public class SquareO {
    
    static String[] linha1, linha2, linha3;
    static String[] bolas1, bolas2, bolas3, bolas4;
    static int resultado = 1;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        linha1 = in.nextLine().split(" ");
        linha2 = in.nextLine().split(" ");
        linha3 = in.nextLine().split(" ");
        
        bolas1 = in.nextLine().split(" ");
        bolas2 = in.nextLine().split(" ");
        bolas3 = in.nextLine().split(" ");
        bolas4 = in.nextLine().split(" ");
        
        String[][] linhas = {linha1, linha2, linha3};
        String[][] bolas = {bolas1, bolas2, bolas3, bolas4};
        int y = 0;
        
        for(int i = 0; i <= 2 ; i++) {
            
            int somaBolas = Integer.parseInt(bolas[y][i]) + Integer.parseInt(bolas[y][i + 1]) + Integer.parseInt(bolas[y + 1][i]) + Integer.parseInt(bolas[y + 1][i + 1]);
            
            if (somaBolas != Integer.parseInt(linhas[y][i])) {
                resultado = 0;
            }
            
            if(i == 2 && y != 2) {
                y = y + 1;
                i = -1;
            }
        }
        
        System.out.println(resultado);
        
        
        
    }
}
