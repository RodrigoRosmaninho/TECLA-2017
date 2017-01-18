import java.util.Scanner;

public class PontoInterior
{
		static String pontoP, ponto1, ponto2;
		static String[] arrayP, array1, array2;
		static int abcissaP, abcissa1, abcissa2;
		static int ordenadaP, ordenada1, ordenada2;
		
		static int abcissaMax, abcissaMin, ordenadaMax, ordenadaMin;
		
		static int resultado = 0;
		
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			pontoP = in.nextLine();
			ponto1 = in.nextLine();
			ponto2 = in.nextLine();
			
			arrayP = pontoP.split(" ");
			array1 = ponto1.split(" ");
			array2 = ponto2.split(" ");
			
			abcissaP = Integer.parseInt(arrayP[0]);
			ordenadaP = Integer.parseInt(arrayP[1]);
			abcissa1 = Integer.parseInt(array1[0]);
			ordenada1 = Integer.parseInt(array1[1]);
			abcissa2 = Integer.parseInt(array2[0]);
			ordenada2 = Integer.parseInt(array2[1]);

			if(abcissa1 > abcissa2) {
				abcissaMax = abcissa1;
				abcissaMin = abcissa2;
			} 
			else {
				abcissaMax = abcissa2;
				abcissaMin = abcissa1;
			}
			
			if(ordenada1 > ordenada2) {
				ordenadaMax = ordenada1;
				ordenadaMin = ordenada2;
			} 
			else {
				ordenadaMax = ordenada2;
				ordenadaMin = ordenada1;
			}
			
			if((abcissaP < abcissaMax && abcissaP > abcissaMin) && (ordenadaP < ordenadaMax && ordenadaP > ordenadaMin)) {
				resultado = 1;
			}

			System.out.println(resultado);
			
		}

	}

