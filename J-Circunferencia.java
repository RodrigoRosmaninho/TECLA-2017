import java.util.Scanner;

public class Circunferencia {
    
    static String[] pontoC , pontoP;
    static int raio , cX, cY, pX, pY;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        pontoP = in.nextLine().split(" ");
        pontoC = in.nextLine().split(" ");
        raio = Integer.parseInt(in.nextLine());
        
        
        cX = Integer.parseInt(pontoC[0]);
        cY = Integer.parseInt(pontoC[1]);
        pX = Integer.parseInt(pontoP[0]);
        pY = Integer.parseInt(pontoP[1]);
        
        if( ((cX-pX)*(cX-pX) + (cY-pY)*(cY-pY)) < (raio*raio) ) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }        
        
    }
    
}
