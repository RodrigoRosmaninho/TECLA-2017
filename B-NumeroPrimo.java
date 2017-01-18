import java.util.Scanner;

public class Main {
	private static int number, prime;
	  public static void main(String[] args){
	   Scanner in = new Scanner(System.in);
	   prime = 1;
	   number = in.nextInt();
	   if(number == 0 || number == 1){
		   prime = 0;
	   } else if(number == 2){
		   prime = 1;
	   }else {
		   for(int i = 2; i < number; i++){
			   if(number % i == 0){
				   prime = 0;
				   break;				   
			   }			   
		   }
	   }	   
	   System.out.println(prime);
	  }
}
