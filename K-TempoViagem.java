import java.util.Scanner;

public class TempoViagem {
    
    static String distancia, tempo;
    static float velocidade, percorrer, resultado;
    static int horas, minutos, segundos;


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        distancia = in.nextLine();
        tempo = in.nextLine();
        velocidade = Float.parseFloat(in.nextLine());
        percorrer = Float.parseFloat(in.nextLine());
        
        if (distancia.matches("Km")){
            velocidade = velocidade *1000;
            percorrer = percorrer * 1000;
        }
        
        if(tempo.matches("h")){
            velocidade = velocidade / 3600;
        }
        
        
        resultado = percorrer / velocidade;
        
        segundos = Math.round(resultado);
        
        while (segundos > 59){
            segundos -= 60;
            minutos += 1;
        }
        
        while (minutos > 59){
            minutos -= 60;
            horas += 1;
        } 
        
        
        System.out.println(String.format("%d:%02d:%02d", horas,minutos,segundos));
        
    }
    
}
