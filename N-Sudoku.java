import java.util.Scanner;


public class Sudoku {
    
    static String[][] posicoes;
    static int[][] numeros;
    static int ideal; 
    static boolean certo;

    public static void main(String[] args) {
        
        ideal = 45;
        certo = true;
        
        posicoes = new String[9][9];
        numeros = new int[9][9];
        
        Scanner in = new Scanner(System.in);
        posicoes[0] = in.nextLine().split(" ");
        posicoes[1] = in.nextLine().split(" ");
        posicoes[2] = in.nextLine().split(" ");
        posicoes[3] = in.nextLine().split(" ");
        posicoes[4] = in.nextLine().split(" ");
        posicoes[5] = in.nextLine().split(" ");
        posicoes[6] = in.nextLine().split(" ");
        posicoes[7] = in.nextLine().split(" ");
        posicoes[8] = in.nextLine().split(" ");
        
        for (int i = 0 ; i< 9; i++){
            
            for (int x = 0 ; x< 9; x++){
                
                numeros[i][x] = Integer.parseInt(posicoes[i][x]);
                
            }
            
        }
        
        
        for (int i = 0 ; i< 9; i++){
            for (int x = 0 ; x< 9; x++){
                ideal -= numeros[i][x];
                }
            if(ideal == 0){
                ideal = 45;
            } else {
                certo = false;
            }
        }
        
         for (int i = 0 ; i< 9; i++){
            for (int x = 0 ; x< 9; x++){
                ideal -= numeros[x][i];
                }
            if(ideal == 0){
                ideal = 45;
            } else {
                certo = false;
            }
        }
         
         
        for (int a = 0 ; a< 9; a+= 3){
            for (int b = 0 ; b< 9; b+= 3){
                
                  for (int c  = 0 ; c< 3; c++){
                     for (int d = 0 ; d< 3; d++){
                          ideal -= numeros[a+c][b+d];
                     }
                     
                  
                 }
                if(ideal == 0){
                        ideal = 45;
                   } else {
                       certo = false;
                   }
            }
            
        }
        
        if( certo == false){
            System.out.println("0");
        } else if(certo == true){
            System.out.println("1");
        }
        
        
    }
    
}
