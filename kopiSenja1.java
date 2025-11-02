import java.util.Scanner;

public class kopiSenja1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int total_pelanggan_keseluruhan = 0;
        int total_item_keseluruhan = 0;
        
       
        System.out.print(" jumlah cabang kafe: ");
        int jumlah_cabang = sc.nextInt();
        
        
        for (int cabang = 1; cabang <= jumlah_cabang; cabang++) {
            System.out.println("\nCabang " + cabang + ":");
            
           
            System.out.print("Masukkan jumlah pelanggan? ");
            int jumlah_pelanggan = sc.nextInt();
            
            
            int total_item_cabang = 0;
            
            
            for (int pelanggan = 1; pelanggan <= jumlah_pelanggan; pelanggan++) {
                
                System.out.print("Masukkan jumlah item untuk pelanggan " + pelanggan + "? ");
                int jumlah_item = sc.nextInt();
                total_item_cabang += jumlah_item;
            }
            
            
            System.out.println("Cabang " + cabang + ": " + jumlah_pelanggan + " pelanggan, " + total_item_cabang + " item");
            
            total_pelanggan_keseluruhan += jumlah_pelanggan;
            total_item_keseluruhan += total_item_cabang;
        }
        
       
        System.out.println("\nTotal keseluruhan:");
        System.out.println("Total pelanggan: " + total_pelanggan_keseluruhan);
        System.out.println("Total item: " + total_item_keseluruhan);
        
        sc.close();
    }
}
