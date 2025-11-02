import java.util.Scanner;

 public class kuadrat13 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = 5;

      for ( int i = 1; i <= n; i++) {
          int jumlah = 0;
          String rincian = "";

      for (int j = 1; j <= i; j++) {
          jumlah += j * j;
          rincian += j * j;
          if (j < i) {
              rincian += " + ";
         }
       }

       System.out.println("n = " + i +" \u2192 Jumlah kuadrat = "  + rincian + "=" + jumlah);
      }
   }
 }