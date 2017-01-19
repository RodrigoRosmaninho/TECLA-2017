import java.util.Scanner;


public class JogoGalo {
    
    static int jogador, n1, n2, n3, n4, n5, n6, n7, n8, n9;
    static String[] fila1, fila2, fila3;
    static String sFila1, sFila2, sFila3;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        jogador = Integer.valueOf(in.nextLine());
        sFila1 = in.nextLine();
        sFila2 = in.nextLine();
        sFila3 = in.nextLine();
        fila1 = sFila1.split(" ");
        fila2 = sFila2.split(" ");
        fila3 = sFila3.split(" ");
        
        n1 = Integer.parseInt(fila1[0]);
        n2 = Integer.parseInt(fila1[1]);
        n3 = Integer.parseInt(fila1[2]);
        n4 = Integer.parseInt(fila2[0]);
        n5 = Integer.parseInt(fila2[1]);
        n6 = Integer.parseInt(fila2[2]);
        n7 = Integer.parseInt(fila3[0]);
        n8 = Integer.parseInt(fila3[1]);
        n9 = Integer.parseInt(fila3[2]);
        
        if (n1 +n2 +n3 == jogador*2) {
            if(n1 == 0){
                System.out.println("1 1");
            } else if(n2 == 0){
                System.out.println("1 2");
            } else if(n3 == 0){
                System.out.println("1 3");
            }
        } else if (n4 +n5 +n6 == jogador*2) {
            if(n4 == 0){
                System.out.println("2 1");
            } else if(n5 == 0){
                System.out.println("2 2");
            } else if(n6 == 0){
                System.out.println("2 3");
            }
        } else if (n7 +n8 +n9 == jogador*2) {
            if(n7 == 0){
                System.out.println("3 1");
            } else if(n8 == 0){
                System.out.println("3 2");
            } else if(n9 == 0){
                System.out.println("3 3");
            }
        } else if (n1 +n4 +n7 == jogador*2) {
            if(n1 == 0){
                System.out.println("1 1");
            } else if(n4 == 0){
                System.out.println("2 1");
            } else if(n7 == 0){
                System.out.println("3 1");
            }
        } else if (n2 +n5 +n8 == jogador*2) {
            if(n2 == 0){
                System.out.println("1 2");
            } else if(n5 == 0){
                System.out.println("2 2");
            } else if(n8 == 0){
                System.out.println("3 2");
            }
        } else if (n3 +n6 +n9 == jogador*2) {
            if(n3 == 0){
                System.out.println("1 3");
            } else if(n6 == 0){
                System.out.println("2 3");
            } else if(n9 == 0){
                System.out.println("3 3");
            }
        } else if (n1 +n5 +n9 == jogador*2) {
            if(n1 == 0){
                System.out.println("1 1");
            } else if(n5 == 0){
                System.out.println("2 2");
            } else if(n9 == 0){
                System.out.println("3 3");
            }
        } else if (n3 +n5 +n7 == jogador*2) {
            if(n3 == 0){
                System.out.println("1 3");
            } else if(n5 == 0){
                System.out.println("2 2");
            } else if(n7 == 0){
                System.out.println("3 1");
            }
        } else {
            System.out.println("0");
        }       
    }
    
}
