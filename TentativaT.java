import java.util.Scanner;
import java.util.ArrayList;

public class ProvaAutomovel {
    
    static int numeroCarros;
    static ArrayList<String> podio;
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       numeroCarros = in.nextInt();
       in.nextLine();
       
       podio = new ArrayList<String>(numeroCarros);
       
       for(int i = 0; i <= numeroCarros - 1 ; i++ ) {
           String[] dados = in.nextLine().split(" ");
           String nome = dados[0];
           int tempo1 = Integer.parseInt(dados[1]);
           int tempo2 = Integer.parseInt(dados[2]);
           
           int tempo = tempo1 + tempo2;
           
           for(int x = 0; x <= 4; x++) {
               tempo = tempo + Integer.parseInt(dados[x + 3]);
           }
           
           podio.add(nome + "_" + String.valueOf(tempo));
           
       }
       
       for(int i = 0; i <= numeroCarros - 1; i++) {
            for(int x = 0; x <= numeroCarros - 1; x++) {
                if (!(podio.get(i).equals(podio.get(x)))) {
                    
                }
            }
       }
       
   } 
}
