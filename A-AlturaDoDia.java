import java.util.Scanner;

public class Main {
	private static int hourDay;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		hourDay =  in.nextInt();
		
		if(hourDay>4 && hourDay<8){
			System.out.println("madrugada");
		} else if (hourDay>7 && hourDay<13){
			System.out.println("manha");
		}else if (hourDay>12 && hourDay<20){
			System.out.println("tarde");
		}else if (hourDay>19 && hourDay<25 || hourDay>-1 && hourDay<5){
			System.out.println("noite");
		}
	}

}
