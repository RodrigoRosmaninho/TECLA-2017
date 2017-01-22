import java.util.ArrayList;
import java.util.Scanner;

public class ProtecaoSenhas {

    static int combinacoes;
    static ArrayList<String[]> lista;
    static ArrayList<ArrayList<String>> kA, kB,kC, kD, kE;
    static ArrayList<ArrayList<String>> n1, n2, n3, n4, n5, n6;
    static String solucao;
    static String r1, r2,r3,r4,r5,r6;
 
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        combinacoes = Integer.parseInt(in.nextLine());
        
        lista = new ArrayList<String[]>();
        
        
        kA = new ArrayList<ArrayList<String>>();
        kB = new ArrayList<ArrayList<String>>();
        kC = new ArrayList<ArrayList<String>>();
        kD = new ArrayList<ArrayList<String>>();
        kE = new ArrayList<ArrayList<String>>();
        
        n1 = new ArrayList<ArrayList<String>>();
        n2 = new ArrayList<ArrayList<String>>();
        n3 = new ArrayList<ArrayList<String>>();
        n4 = new ArrayList<ArrayList<String>>();
        n5 = new ArrayList<ArrayList<String>>();
        n6 = new ArrayList<ArrayList<String>>();
        
        
        for (int i = 0; i < combinacoes; i++){
            
            
            
            lista.add(in.nextLine().split(" "));
            kA.add(new ArrayList<String>());
            kB.add(new ArrayList<String>());
            kC.add(new ArrayList<String>());
            kD.add(new ArrayList<String>());
            kE.add(new ArrayList<String>());
            
            n1.add(new ArrayList<String>());
            n2.add(new ArrayList<String>());
            n3.add(new ArrayList<String>());
            n4.add(new ArrayList<String>());
            n5.add(new ArrayList<String>());
            n6.add(new ArrayList<String>());
            
            
            
        }
        
            
            
        
       for (int x = 0; x < combinacoes; x++){
            
           kA.get(x).add(lista.get(x)[0]);
            kA.get(x).add(lista.get(x)[1]);
            kB.get(x).add(lista.get(x)[2]);
            kB.get(x).add(lista.get(x)[3]);
            kC.get(x).add(lista.get(x)[4]);
            kC.get(x).add(lista.get(x)[5]);
            kD.get(x).add(lista.get(x)[6]);
            kD.get(x).add(lista.get(x)[7]);
            kE.get(x).add(lista.get(x)[8]);
            kE.get(x).add(lista.get(x)[9]);
            
        }
       
       
       
      
       
       
       
       
           
           for (int x = 0; x < combinacoes; x++){
               
               
               switch(lista.get(x)[10]){
                   case "A":
                        n1.get(x).add(kA.get(x).get(0));
                        n1.get(x).add(kA.get(x).get(1));
                        break;
                   case "B":
                        n1.get(x).add(kB.get(x).get(0));
                        n1.get(x).add(kB.get(x).get(1));
                        break;
                   case "C":
                        n1.get(x).add(kC.get(x).get(0));
                        n1.get(x).add(kC.get(x).get(1));
                        break;
                   case "D":
                        n1.get(x).add(kD.get(x).get(0));
                        n1.get(x).add(kD.get(x).get(1));
                        break;
                   case "E":
                        n1.get(x).add(kE.get(x).get(0));
                        n1.get(x).add(kE.get(x).get(1));
                        break;
               }
               
               
           }
           
       
             
           for (int x = 0; x < combinacoes; x++){
               
               
               switch(lista.get(x)[11]){
                   case "A":
                        n2.get(x).add(kA.get(x).get(0));
                        n2.get(x).add(kA.get(x).get(1));
                        break;
                   case "B":
                        n2.get(x).add(kB.get(x).get(0));
                        n2.get(x).add(kB.get(x).get(1));
                        break;
                   case "C":
                        n2.get(x).add(kC.get(x).get(0));
                        n2.get(x).add(kC.get(x).get(1));
                        break;
                   case "D":
                        n2.get(x).add(kD.get(x).get(0));
                        n2.get(x).add(kD.get(x).get(1));
                        break;
                   case "E":
                        n2.get(x).add(kE.get(x).get(0));
                        n2.get(x).add(kE.get(x).get(1));
                        break;
               }
               
               
           }
           
           
             for (int x = 0; x < combinacoes; x++){
               
               
               switch(lista.get(x)[12]){
                   case "A":
                        n3.get(x).add(kA.get(x).get(0));
                        n3.get(x).add(kA.get(x).get(1));
                        break;
                   case "B":
                        n3.get(x).add(kB.get(x).get(0));
                        n3.get(x).add(kB.get(x).get(1));
                        break;
                   case "C":
                        n3.get(x).add(kC.get(x).get(0));
                        n3.get(x).add(kC.get(x).get(1));
                        break;
                   case "D":
                        n3.get(x).add(kD.get(x).get(0));
                        n3.get(x).add(kD.get(x).get(1));
                        break;
                   case "E":
                        n3.get(x).add(kE.get(x).get(0));
                        n3.get(x).add(kE.get(x).get(1));
                        break;
               }
               
               
           }
             
               for (int x = 0; x < combinacoes; x++){
               
               
               switch(lista.get(x)[13]){
                   case "A":
                        n4.get(x).add(kA.get(x).get(0));
                        n4.get(x).add(kA.get(x).get(1));
                        break;
                   case "B":
                        n4.get(x).add(kB.get(x).get(0));
                        n4.get(x).add(kB.get(x).get(1));
                        break;
                   case "C":
                        n4.get(x).add(kC.get(x).get(0));
                        n4.get(x).add(kC.get(x).get(1));
                        break;
                   case "D":
                        n4.get(x).add(kD.get(x).get(0));
                        n4.get(x).add(kD.get(x).get(1));
                        break;
                   case "E":
                        n4.get(x).add(kE.get(x).get(0));
                        n4.get(x).add(kE.get(x).get(1));
                        break;
               }
               
               
           }
       
               
               
                 for (int x = 0; x < combinacoes; x++){
               
               
               switch(lista.get(x)[14]){
                   case "A":
                        n5.get(x).add(kA.get(x).get(0));
                        n5.get(x).add(kA.get(x).get(1));
                        break;
                   case "B":
                        n5.get(x).add(kB.get(x).get(0));
                        n5.get(x).add(kB.get(x).get(1));
                        break;
                   case "C":
                        n5.get(x).add(kC.get(x).get(0));
                        n5.get(x).add(kC.get(x).get(1));
                        break;
                   case "D":
                        n5.get(x).add(kD.get(x).get(0));
                        n5.get(x).add(kD.get(x).get(1));
                        break;
                   case "E":
                        n5.get(x).add(kE.get(x).get(0));
                        n5.get(x).add(kE.get(x).get(1));
                        break;
               }
               
               switch(lista.get(x)[15]){
                   case "A":
                        n6.get(x).add(kA.get(x).get(0));
                        n6.get(x).add(kA.get(x).get(1));
                        break;
                   case "B":
                        n6.get(x).add(kB.get(x).get(0));
                        n6.get(x).add(kB.get(x).get(1));
                        break;
                   case "C":
                        n6.get(x).add(kC.get(x).get(0));
                        n6.get(x).add(kC.get(x).get(1));
                        break;
                   case "D":
                        n6.get(x).add(kD.get(x).get(0));
                        n6.get(x).add(kD.get(x).get(1));
                        break;
                   case "E":
                        n6.get(x).add(kE.get(x).get(0));
                        n6.get(x).add(kE.get(x).get(1));
                        break;
               }
               
               
           }
       
                 
                 for (int t = 0; t < 10; t++){
                     
                     int repetido = 0;
                     
                     for (int x = 0; x < combinacoes; x++){
                         
                         if (n1.get(x).contains("" + t)){
                             repetido += 1;
                         }
                         
                     }
                     
                     if (repetido == combinacoes){
                         r1 = ""+ t;
                     }
                     
                     
                 }
                 
                  for (int t = 0; t < 10; t++){
                     
                     int repetido = 0;
                     
                     for (int x = 0; x < combinacoes; x++){
                         
                         if (n2.get(x).contains("" +t)){
                             repetido += 1;
                         }
                         
                     }
                     
                     if (repetido == combinacoes){
                         r2 = ""+ t;
                     }
                     
                     
                 }
                  
                  
                   for (int t = 0; t < 10; t++){
                     
                     int repetido = 0;
                     
                     for (int x = 0; x < combinacoes; x++){
                         
                         if (n3.get(x).contains("" + t)){
                             repetido += 1;
                         }
                         
                     }
                     
                     if (repetido == combinacoes){
                         r3 = ""+ t;
                     }
                     
                     
                 }
                   
                   
                    for (int t = 0; t < 10; t++){
                     
                     int repetido = 0;
                     
                     for (int x = 0; x < combinacoes; x++){
                         
                         if (n4.get(x).contains("" +t)){
                             repetido += 1;
                         }
                         
                     }
                     
                     if (repetido == combinacoes){
                         r4= ""+ t;
                     }
                     
                     
                 }
                    
                    
                    for (int t = 0; t < 10; t++){
                     
                     int repetido = 0;
                     
                     for (int x = 0; x < combinacoes; x++){
                         
                         if (n5.get(x).contains("" +t)){
                             repetido += 1;
                         }
                         
                     }
                     
                     if (repetido == combinacoes){
                         r5 = ""+ t;
                     }
                     
                     
                 }
                    
                    for (int t = 0; t < 10; t++){
                     
                     int repetido = 0;
                     
                     for (int x = 0; x < combinacoes; x++){
                         
                         if (n6.get(x).contains("" +t)){
                             repetido += 1;
                         }
                         
                     }
                     
                     if (repetido == combinacoes){
                         r6 = ""+ t;
                     }
                     
                     
                 }
       
       System.out.println(r1 + " "+
               r2 + " "+
               r3 + " "+
               r4 + " "+
               r5 + " "+
               r6);
    }
    
}
