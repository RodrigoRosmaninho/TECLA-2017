import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class z {

  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int[] numero = new int[5];
    for (int i = 0; i < 5; i++) {
      String line = in.readLine();
      numero[i] = Integer.valueOf(line);
    }
    Arrays.sort(numero);
    System.out.println(numero[0]);
    System.out.println(numero[4]);
  }
}
