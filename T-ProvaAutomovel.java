import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class ProvaAutomovel {

    static int numeroCarros;
    static ArrayList<String> podio;
	static ArrayList<String> podioFinal;

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		numeroCarros = in.nextInt();
		in.nextLine();

		podio = new ArrayList<String>(numeroCarros);
		podioFinal = new ArrayList<String>(numeroCarros);

		for(int i = 0; i <= numeroCarros - 1 ; i++ ) {
			String[] dados = in.nextLine().split(" ");
			String nome = dados[0];
			int tempo1 = Integer.parseInt(dados[1]);
			int tempo2 = Integer.parseInt(dados[2]);

			int tempo = tempo1 + tempo2;

			for(int x = 0; x <= 4; x++) {
				int pen = Integer.parseInt(dados[x + 3]);
				
				if(pen == 1) {
					tempo = tempo + 5;
				}
				else if(pen == 2) {
					tempo = tempo + 10;
				}
			}

			podio.add(nome + "_" + String.valueOf(tempo));

		}
		
		for(int k = 0; k <= numeroCarros - 1; k++) {
		
			for(int i = 0; i <= podio.size() - 1; i++) {
				int numeroDeMaior = 0;
				String nome = podio.get(i).split("_")[0];
				int somaTempo = Integer.parseInt(podio.get(i).split("_")[1]);
			
            	for(int x = 0; x <= podio.size() - 1; x++) {
                	if (!(podio.get(i).equals(podio.get(x)))) {
						int somaTempo2 = Integer.parseInt(podio.get(x).split("_")[1]);			
					
						if(somaTempo > somaTempo2) {
							numeroDeMaior = numeroDeMaior + 1;
						}
                	}
            	}
			
				if(numeroDeMaior == 0) {
					podioFinal.add(podio.get(i));
					podio.remove(i);
					podio.trimToSize();
					break;
				}
			
			}
		}
		
		for(int i = 0; i <= podioFinal.size() - 1; i++) {
			String nome = podioFinal.get(i).split("_")[0];
			int s = Integer.parseInt(podioFinal.get(i).split("_")[1]);
			System.out.println(nome + " " + String.format(Locale.ENGLISH, "%02d", ((s/60)%60)) + ":" + String.format(Locale.ENGLISH, "%02d", (s%60)));
		}
	} 
}
