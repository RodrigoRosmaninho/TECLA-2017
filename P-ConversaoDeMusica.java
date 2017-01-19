import java.util.Scanner;

public class ConversaoDeMusica {
    
    static long espacoGB;
    static long espacoBytes;
    static int horas;
    static long segundos;
    static int nmrBitrates;
    static long diferenca = -1;
    static long recordista; 
    
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        
        espacoGB = in.nextInt();
        in.nextLine();
        horas = in.nextInt();
        in.nextLine();
        nmrBitrates = in.nextInt();
        in.nextLine();
        
        segundos = horas * 3600;
        
        espacoBytes = espacoGB * 8589934592L;
        
        for(int i = 0; i <= nmrBitrates - 1; i++) {
            long br = in.nextInt();
            long bitrate = br * segundos;
            in.nextLine();
            
            if(espacoBytes >= bitrate) {
                if(diferenca == -1) {
                    diferenca = espacoBytes - bitrate;
                    recordista = br;
                }
                else {
                    long diff = espacoBytes - bitrate;
                    if(diff < diferenca) {
                        diferenca = diff;
                        recordista = br;
                    }
                }
            }
        }
        
        System.out.println(recordista);
        
    }
}
