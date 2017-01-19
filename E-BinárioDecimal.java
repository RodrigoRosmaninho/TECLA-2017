import java.util.Scanner;

public class BinarioDecimal {
    
    static int binario128, binario64, binario32, binario16, binario8, binario4, binario2, binario1, resultado;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        binario128 = in.nextInt();
        binario64 = in.nextInt();
        binario32 = in.nextInt();
        binario16 = in.nextInt();
        binario8 = in.nextInt();
        binario4 = in.nextInt();
        binario2 = in.nextInt();
        binario1 = in.nextInt();

        resultado = (binario128 * 128) + (binario64* 64) + (binario32 * 32) + (binario16* 16) + (binario8 * 8) + (binario4* 4) + (binario2 * 2) + (binario1* 1);
        System.out.println(resultado);
        
    }
    
}
