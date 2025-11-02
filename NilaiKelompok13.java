import java.util.Scanner;

public class NilaiKelompok13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j, nilai;
        float totalNilai, rataNilai;
        float maxRata = 0;
        int kelompokMax = 0;

        
        while (i <= 6) {
            System.out.println("\nKelompok " + i);

            totalNilai = 0; 

          
            for (j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari penilai ke-" + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

           
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + " : nilai rata-rata = " + rataNilai);

           
            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokMax = i;
            }

            i++;
        }

        
        System.out.println("\n=======================================");
        System.out.println("Kelompok dengan rata-rata tertinggi adalah: Kelompok " 
                           + kelompokMax + " dengan nilai rata-rata " + maxRata);
        System.out.println("=======================================");

        sc.close();
    }
}
