import java.util.Scanner;

public class Cultura2 {
    
    static int linhas, colunas;
    static boolean parar = false;
    static int numeroMarcadores = 0;
    static int marcadoresInfetados = 0;
    static int dias = 0;
    static int dias1 = 0;
    static int dias2;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] input = in.nextLine().split(" ");
        linhas = Integer.parseInt(input[0]);
        colunas = Integer.parseInt(input[1]);
        
        String[][] cultura = new String[linhas][colunas];
        
        for(int i = 0; i < linhas; i++) {
            cultura[i] = in.nextLine().split(" ");
            
            for(int k = 0; k < colunas; k++) {
                System.out.println(i + ", " + k + ", " + linhas + ", " + colunas);
                if(cultura[i][k].equals("M")) {
                    numeroMarcadores = numeroMarcadores + 1;
                }
            }
            
        }
        
        while(parar == false){
            
            int y = 0;
        
            for(int i = 0; i < linhas ; i++) {
                // int somaBolas = Integer.parseInt(bolas[y][i]) + Integer.parseInt(bolas[y][i + 1]) + Integer.parseInt(bolas[y + 1][i]) + Integer.parseInt(bolas[y + 1][i + 1]);
                String[][] novaCultura = cultura;
                
                if(cultura[y][i].equals("*")) {
                    if(y != 0) {
                        if(novaCultura[y - 1][i].equals("M")) {
                            marcadoresInfetados = marcadoresInfetados + 1;
                        }
                        novaCultura[y - 1][i] = "*";
                    }
                    if(y != linhas - 1) {
                        if(novaCultura[y + 1][i].equals("M")) {
                            marcadoresInfetados = marcadoresInfetados + 1;
                        }
                        novaCultura[y + 1][i] = "*";
                    }
                    if(i != 0) {
                        if(novaCultura[y][i - 1].equals("M")) {
                            marcadoresInfetados = marcadoresInfetados + 1;
                        }
                        novaCultura[y][i - 1] = "*";
                    }
                    if(i != colunas - 1) {
                        if(novaCultura[y][i + 1].equals("M")) {
                            marcadoresInfetados = marcadoresInfetados + 1;
                        }
                        novaCultura[y][i + 1] = "*";
                    }
                }
                
                if(marcadoresInfetados == 1 && dias1 != 0) {
                    dias1 = dias;
                }
                
                if(marcadoresInfetados == numeroMarcadores) {
                    dias2 = dias;
                    parar = true;
                    break;
                }
           
                if(i == colunas - 1 && y != linhas) {
                y = y + 1;
                i = -1;
                }
            }
            
                dias = dias + 1;
        }
        
        System.out.println(dias1 + " " + dias2);
        
        
        
    }
}
