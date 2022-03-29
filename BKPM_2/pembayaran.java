import java.util.Scanner;
public class kasir {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String nama;
        int harga,harga1,harga2,harga3,harga4,jumlah;
        
        System.out.println("============================================================");
        System.out.println("\t\tKharisma Agung Plaza <KAP>\t\t");
        System.out.println("\t\tPromo Belanja Berhadiah\t\t");
        System.out.println("\t    Khusus Pembelian 5 Barang Pertama\t");
        System.out.println("\t     Dengan harga minimum 10.000,00\t");
        System.out.println("============================================================");
        
        System.out.println("Masukkan Nama Pembeli :");
       nama = input.nextLine();
       
       System.out.println("Masukkan harga barang ke-1 :");
       harga = input.nextInt();
       System.out.println("Masukkan harga barang ke-2 :");
       harga1 = input.nextInt();
       System.out.println("Masukkan harga barang ke-3 :");
       harga2 = input.nextInt();
       System.out.println("Masukkan harga barang ke-4 :");
       harga3 = input.nextInt();
       System.out.println("Masukkan harga barang ke-5 :");
       harga4 = input.nextInt();
       
       jumlah = harga+harga1+harga2+harga3+harga4;
       System.out.println("Total harga atas nama "+nama+" adalah Rp."+jumlah);
       if (jumlah>=10000){
           System.out.println("\nSelamat....\nAnda mendapat hadiah 1 buah mug cantik");
       }else {
           System.out.println("\nMohon Maaf....\nPembelian anda tidak mencapai Rp.10.000");
           System.out.println("Anda belum beruntung untuk mendapatkan hadiahnya");
       }
       
       System.out.println("============================================================");
       System.out.println("\t\tTerima Kasih\t\t");
       System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
    }  
}
