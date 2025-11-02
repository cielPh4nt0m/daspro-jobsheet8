import java.util.Scanner;
 public class Triangle13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        int i = 0;

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        while(i <= n) {
            int j = 0;
            while (j < i ) {
                System.out.print("*");
                j++;
            }
             i++;
             System.out.println();
        }
       
        
    }
 }
