package array;

import java.util.Scanner;

public class arrayKasir {
    public static void main(String[] args) {
        // Program kasir sederhana menggunakan array
        String pembeli;
        String barang[]=new String[3];
        int harga[]=new int[3], total;
        Scanner buyer=new Scanner(System.in);
        Scanner brg1=new Scanner(System.in);
        Scanner hrg1=new Scanner(System.in);
        
        System.out.println("              TOKO AH TONG                      ");
        System.out.println("   PROMO TIKET UMROH SETIAP PEMBELIAN 250.000   ");
        
        
        System.out.println("Masukan nama pembeli :");
        pembeli=buyer.nextLine();
        
        System.out.println("Masukan nama barang :");
        barang[0]=brg1.nextLine();
        System.out.println("Masukan harga barang :");
        harga[0]=hrg1.nextInt();
        
        System.out.println("Masukan nama barang :");
        barang[1]=brg1.nextLine();
        System.out.println("Masukan harga barang :");
        harga[1]=hrg1.nextInt();
        
        System.out.println("Masukan nama barang :");
        barang[2]=brg1.nextLine();
        System.out.println("Masukan harga barang :");
        harga[2]=hrg1.nextInt();
        
        total=harga[0]+harga[1]+harga[2];
        System.out.println("Total belanja" +" " +pembeli+ " " + "adalah:" +total);
        
        if (total>=100000) {
            System.out.println("Selamat anda mendapat tiket umroh");
        }else{
            System.out.println("Tidak mencapai minimum belanja");
            
        }
    } 
}
