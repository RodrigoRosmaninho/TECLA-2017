import java.util.ArrayList;
import java.util.Scanner;

public class Cultura22 {

    static int linhas, colunas;
    static int recordistaMenor = 0;
    static int recordistaMaior = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(" ");
        linhas = Integer.parseInt(input[0]);
        colunas = Integer.parseInt(input[1]);

        String[][] cultura = new String[linhas][colunas];
        ArrayList<String> m = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<String>();

        for(int i = 0; i < linhas; i++) {
            cultura[i] = in.nextLine().split("");

            for(int k = 0; k < colunas; k++) {
                if(cultura[i][k].equals("M")) {
                    m.add(i + "," + k);
                }
                else if(cultura[i][k].equals("*")) {
                    b.add(i + "," + k);
                }
            }
        }
        
        int[] diasM = new int[m.size()];
        
        for(int i = 0; i < m.size(); i++) {
            int xm = Integer.parseInt(m.get(i).split(",")[0]);
            int ym = Integer.parseInt(m.get(i).split(",")[1]);
            
            int recordista = 0;
            
            for(int x = 0; x < b.size(); x++) {
                int xb = Integer.parseInt(b.get(x).split(",")[0]);
                int yb = Integer.parseInt(b.get(x).split(",")[1]);
                
                int distanciaX = xb - xm;
                int distanciaY = yb - ym;
                
                if(distanciaX < 0){
                    distanciaX = distanciaX * -1;
                }
                if(distanciaY < 0){
                    distanciaY = distanciaY * -1;
                }
                
                int dias = distanciaX + distanciaY;
                
                if(dias < recordista || recordista == 0) {
                    recordista = dias;
                }
            } 
            
            diasM[i] = recordista;
        }
        
        for(int i = 0; i < diasM.length; i++) {
            if(recordistaMenor == 0 ) {
                recordistaMenor = diasM[i];
                recordistaMaior = diasM[i];
            }
            else if(diasM[i] < recordistaMenor) {
                recordistaMenor = diasM[i];
            }
            else if(diasM[i] > recordistaMaior) {
                recordistaMaior = diasM[i];
            }
        }

        System.out.println(recordistaMenor + " " + recordistaMaior);

    }
}
