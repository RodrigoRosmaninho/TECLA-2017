import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Diagrama2 {

    static ArrayList<String[]> percurso;
    static ArrayList<String> letrasRepetidas;
    static ArrayList<ArrayList<String>> caminhos, percursoRepetidoCaminhos;
    static ArrayList<String[]> percursoRepetido;
    static String[] ordem = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l," ,"m" , "n", "o", "p", "q", "r", "s", "t" ,"u", "v", "w", "x", "y", "z" };
    static int tarefas, melhor;
    static String primeira, ultima;

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        tarefas = Integer.parseInt(in.nextLine());
        primeira = in.nextLine();
        ultima = in.nextLine();
        percurso = new ArrayList<String[]>();
        percursoRepetido = new ArrayList<String[]>();
        percursoRepetidoCaminhos = new ArrayList<ArrayList<String>>();
        caminhos = new ArrayList<ArrayList<String>>();
        caminhos.add(new ArrayList<String>());
        letrasRepetidas = new ArrayList<String>();
        
        for (int i = 0; i < tarefas; i++){
            String[] atual =  in.nextLine().split(" ");         //Ficar com todo o input do utilizador
            percurso.add(atual);
        }
        
        for (int x = 0; x < ordem.length; x++){
            
            int repetido = 0;
            
            for (int i = 0; i < tarefas; i++){
                if (percurso.get(i)[0].compareTo(ordem[x])== 0){
                    repetido += 1;                          //Descobrir numero de Arrays necessarios
                    if (repetido > 1 ){
                        letrasRepetidas.add(ordem[x]);
                    }
                    
                }  
            }
            
        }
        
        for (int i = 0; i < caminhos.size(); i++){
            
            caminhos.get(i).add(primeira);      //Adicionar 1 letra a todos
            
        }
        
 //////IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
        
 
 
         for (int i = 0; i < caminhos.size(); i++){
             
             for ( int x = 0; x < percurso.size(); x++){
                 
                 if (caminhos.get(i).get(caminhos.get(i).size()-1).equals(percurso.get(x)[0])&& !letrasRepetidas.contains(percurso.get(x)[0])) { 
                     caminhos.get(i).add(percurso.get(x)[1]);
                     caminhos.get(i).add(percurso.get(x)[2]);
                     x = -1;
                 }
                 if (x > -1){
                 if (caminhos.get(i).get(caminhos.get(i).size()-1).equals(percurso.get(x)[0]) && letrasRepetidas.contains(percurso.get(x)[0])){
                     boolean repeated = false;
                     
                     for (int q = 0; q < percursoRepetido.size(); q++){
                         if (percursoRepetidoCaminhos.get(q).equals(caminhos.get(i)) && percursoRepetido.get(q).equals(percurso.get(x))){
                             repeated =true;
                         }
                     }
                     
                     
                                        
                     if (percursoRepetido.contains(percurso.get(x))){
                         if(percursoRepetidoCaminhos.contains(caminhos.get(i))){
                            if(repeated){      //index !PR == PRC

                                //nothing
                                
                            }
                         }
                     }
                     
                     if (percursoRepetido.contains(percurso.get(x))){
                         if(percursoRepetidoCaminhos.contains(caminhos.get(i))){
                            if(!repeated){  //index !PR == PRC

                                percursoRepetido.add(percurso.get(x));
                              percursoRepetidoCaminhos.add(new ArrayList<String>());
                            
                            for (int t = 0; t < caminhos.get(i).size(); t++){
                                percursoRepetidoCaminhos.get(percursoRepetidoCaminhos.size()-1).add(caminhos.get(i).get(t));
                            }

                             caminhos.add(new ArrayList<String>() );

                                for (int y = 0; y< caminhos.get(i).size(); y++){

                                   caminhos.get(caminhos.size()-1).add("" + caminhos.get(i).get(y));

                                }                    

                            caminhos.get(i).add(percurso.get(x)[1]);
                            caminhos.get(i).add(percurso.get(x)[2]);
                            x = -1;
                                
                            }
                         }
                     }
                    if (x > -1){  
                     if (percursoRepetido.contains(percurso.get(x))){
                         if(!percursoRepetidoCaminhos.contains(caminhos.get(i))){
                           
                                percursoRepetido.add(percurso.get(x));
                            percursoRepetidoCaminhos.add(new ArrayList<String>());
                            
                            for (int t = 0; t < caminhos.get(i).size(); t++){
                                percursoRepetidoCaminhos.get(percursoRepetidoCaminhos.size()-1).add(caminhos.get(i).get(t));
                            }
                            
                            
                            
                            

                             caminhos.add(new ArrayList<String>() );

                                for (int y = 0; y< caminhos.get(i).size(); y++){

                                   caminhos.get(caminhos.size()-1).add("" + caminhos.get(i).get(y));

                                }                    

                            caminhos.get(i).add(percurso.get(x)[1]);
                            caminhos.get(i).add(percurso.get(x)[2]);
                            x = -1;
                                
                            }
                         
                     }
                    }
                     
                     
                      if (x > -1){
                     if (!percursoRepetido.contains(percurso.get(x))){
                            percursoRepetido.add(percurso.get(x));
                              percursoRepetidoCaminhos.add(new ArrayList<String>());
                            
                            for (int t = 0; t < caminhos.get(i).size(); t++){
                                percursoRepetidoCaminhos.get(percursoRepetidoCaminhos.size()-1).add(caminhos.get(i).get(t));
                            }

                             caminhos.add(new ArrayList<String>() );

                                for (int y = 0; y< caminhos.get(i).size(); y++){

                                   caminhos.get(caminhos.size()-1).add("" + caminhos.get(i).get(y));

                                }                    

                            caminhos.get(i).add(percurso.get(x)[1]);
                            caminhos.get(i).add(percurso.get(x)[2]);
                            x = -1;
                     
                     
                     }
                      }
                      
                      repeated = false;
                 }
                 
                 }
                 
                 
             }
              if(!caminhos.get(i).get(caminhos.get(i).size()-1).equals(ultima)){
                     caminhos.remove(caminhos.get(i));
                     i -= 1;
                 }
             
         }
 
 
 
 
/////////FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF
        int soma = 0;
        for (int i = 0; i < caminhos.size(); i++){
            
            for (int x = 1; x < caminhos.get(i).size(); x+= 2){
                soma += Integer.parseInt(caminhos.get(i).get(x));
                
            }
            if (soma > melhor){
                melhor = soma;
            }
            soma = 0;
        }
        
        if (tarefas != 0 ){
            System.out.println(melhor);
        } else {
            System.out.println("0");
        }
        
        
        
        
    }
    
}
