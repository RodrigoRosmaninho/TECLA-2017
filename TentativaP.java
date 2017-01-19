import java.util.Scanner;

public class ConversaoDeMusica {
    
    static long espaçoGB;
    static long espaçoBytes;
    static int horas, segundos;
    static int nmrBitrates;
    static long diferença = -1;
    static int recordista; 
    
    public static void main(String[] Args){
        Scanner in = new Scanner(System.in);
        
        espaçoGB = in.nextInt();
        in.nextLine();
        horas = in.nextInt();
        in.nextLine();
        nmrBitrates = in.nextInt();
        in.nextLine();
        
        segundos = horas * 3600;
        
        espaçoBytes = espaçoGB * 8589934592L;
        
        for(int i = 0; i <= nmrBitrates - 1; i++) {
            int br = in.nextInt();
            long bitrate = br * segundos;
            in.nextLine();
            
            if(espaçoBytes >= bitrate) {
                if(diferença == -1) {
                    diferença = espaçoBytes - bitrate;
                    recordista = br;
                }
                else {
                    long diff = espaçoBytes - bitrate;
                    if(diff < diferença) {
                        diferença = diff;
                        recordista = br;
                    }
                }
            }
        }
        
        System.out.println(recordista);
        
    }
