import java.util.Scanner;

public class Cultura
{
                static int numeroBacterias;
                static int dias;
		
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
                        numeroBacterias = in.nextInt();
                        
                        while((numeroBacterias % 2) == 0) {
                            numeroBacterias = numeroBacterias / 2;
                            dias = dias + 1;
                        }
                        
                        System.out.println(numeroBacterias + " " + dias);
                        
		}

	}
