import java.util.Scanner;

public class Cultura2 {

    static int linhas, colunas;
    static boolean parar = false;
    static int numeroMarcadores = 0;
    static int marcadoresInfetados = 0;
    static int dias = 1;
    static int dias1 = 0;
    static int dias2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] input = in.nextLine().split(" ");
        linhas = Integer.parseInt(input[0]);
        colunas = Integer.parseInt(input[1]);

        String[][] cultura = new String[linhas][colunas];

        for(int i = 0; i < linhas; i++) {
            cultura[i] = in.nextLine().split(" ");

            for(int k = 0; k < colunas; k++) {
                if(cultura[i][k].equals("M")) {
                    numeroMarcadores = numeroMarcadores + 1;
                }
            }

        }

        while(parar == false){
			
			System.out.println("while loop, dia: " + dias);

            int y = 0;
			
			String[][] novaCultura = cultura;
			
            for(int i = 0; i < linhas ; i++) {
				System.out.println(" for loop, i: " + i + ", y: " + y);
				
				System.out.println(cultura[y][i]);

                if(cultura[y][i].equals("*")) {
					System.out.println("Asterisco!");
                    if(y != 0) {
                        if(cultura[y - 1][i].equals("M")) {
							System.out.println("M encontrado!");
                            marcadoresInfetados = marcadoresInfetados + 1;
                        }
                        novaCultura[y - 1][i] = "*";
                    }
                    if(y != linhas - 1) {
                        if(cultura[y + 1][i].equals("M")) {
                            marcadoresInfetados = marcadoresInfetados + 1;
							System.out.println("M encontrado!");
                        }
                        novaCultura[y + 1][i] = "*";
                    }
                    if(i != 0) {
                        if(cultura[y][i - 1].equals("M")) {
                            marcadoresInfetados = marcadoresInfetados + 1;
							System.out.println("M encontrado!");
                        }
                        novaCultura[y][i - 1] = "*";
                    }
                    if(i != colunas - 1) {
                        if(cultura[y][i + 1].equals("M")) {
                            marcadoresInfetados = marcadoresInfetados + 1;
							System.out.println("M encontrado!");
                        }
                        novaCultura[y][i + 1] = "*";
                    }
                }

                if(marcadoresInfetados == 1 && dias1 != 0) {
                    dias1 = dias;
					System.out.println("Primeiro M!");
                }

                if(marcadoresInfetados == numeroMarcadores) {
                    dias2 = dias;
                    parar = true;
                    break;
                }

                if(i == colunas - 1 && y != linhas) {
					y = y + 1;
					i = -1;
                }
            }
			
			cultura = novaCultura;

			dias = dias + 1;
        }

        System.out.println(dias1 + " " + dias2);

    }
}
                        if(novaCultura[y + 1][i].equals("M")) {
                            marcadoresInfetados = marcadoresInfetados + 1;
                        }
                        novaCultura[y + 1][i] = "*";
                    }
                    if(i != 0) {
                        if(novaCultura[y][i - 1].equals("M")) {
                            marcadoresInfetados = marcadoresInfetados + 1;
                        }
                        novaCultura[y][i - 1] = "*";
                    }
                    if(i != colunas - 1) {
                        if(novaCultura[y][i + 1].equals("M")) {
                            marcadoresInfetados = marcadoresInfetados + 1;
                        }
                        novaCultura[y][i + 1] = "*";
                    }
                }
                
                if(marcadoresInfetados == 1 && dias1 != 0) {
                    dias1 = dias;
                }
                
                if(marcadoresInfetados == numeroMarcadores) {
                    dias2 = dias;
                    parar = true;
                    break;
                }
           
                if(i == colunas - 1 && y != linhas) {
                y = y + 1;
                i = -1;
                }
            }
            
                dias = dias + 1;
        }
        
        System.out.println(dias1 + " " + dias2);
        
        
        
    }
}
