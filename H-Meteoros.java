import java.util.Scanner;

public class Meteoros
{
		static String cantos;
		static String[] arrayCantos;
		
		static int numeroMeteoros, x1, x2, y1, y2;
		
		static int resultado = 0;
		
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			cantos = in.nextLine();
                        numeroMeteoros = in.nextInt();
                        in.nextLine();
                        
                        arrayCantos = cantos.split(" ");
                        
                        x1 = Integer.parseInt(arrayCantos[0]);
                        y1 = Integer.parseInt(arrayCantos[1]);
                        x2 = Integer.parseInt(arrayCantos[2]);
                        y2 = Integer.parseInt(arrayCantos[3]);
                        
                        for(int i = 0; i <= numeroMeteoros - 1 ; i++ ) {
                            String[] meteoro = in.nextLine().split(" ");
                            int xx = Integer.parseInt(meteoro[0]);
                            int yy = Integer.parseInt(meteoro[1]);
                            
                            
                            if(((xx <= x1 && xx >= x2) || (xx >= x1 && xx <= x2)) && ((yy <= y1 && yy >= y2) || (yy >= y1 && yy <= y2))) {
				resultado = resultado + 1;
                            }
                            
                        }
                        
                        System.out.println(resultado);
		}

	}
