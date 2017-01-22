import java.util.Scanner;

public class Paridade {

    static long numero;
    static String resultado = "";
    static int paridade;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        numero = in.nextLong();
        
        while ( numero != 0 ){
            
            if (numero % 2 == 0){
               resultado = resultado + "0"; 
               numero = numero /2;
            } else {
               resultado = resultado + "1";
               numero -= 1;
               numero = numero / 2;
            }
            
        }
        
        for (int i=0 ; i < resultado.length() ; i++){
            paridade += Integer.parseInt(resultado.substring(i, i+1));
        }
        
        System.out.println(paridade);
    }
    
}
