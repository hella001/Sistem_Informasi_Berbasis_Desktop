package array;

import java.util.Scanner;

import java.util.Scanner;

public class arrayMenu {
    
    public static void main(String[] args) {
         // Program array untuk menampilkan menu
        String pembeli;
        int item;
        Scanner buyer=new Scanner(System.in);
        Scanner barang=new Scanner(System.in);
        String menu[]=new String[6];
        menu[0]="";
        menu[1]="Rendang";
        menu[2]="Ayam Panggang";
        menu[3]="Green Tea";
        menu[4]="Thai Tea";
        menu[5]="Kopi Aceh";
       
        
        System.out.println("                   CAFE AKUHALU                  ");
        System.out.println("        SELAMAT DATANG SELAMAT MENIKMATI        ");
        System.out.println("Masukan nama pembeli :");
        pembeli=buyer.nextLine();
        System.out.println("Masukan barang yang dipesan :");
        item=barang.nextInt();
        	
        switch (item) {
            case 1:
                System.out.println(pembeli +" "+"membeli"+" "+menu[1]);
                break;
            case 2:
                System.out.println(pembeli +" "+"membeli"+" "+menu[2]);
                break;
            case 3:
                System.out.println(pembeli +" "+"membeli"+" "+menu[3]);
                break;
            case 4:
                System.out.println(pembeli +" "+"membeli"+" "+menu[4]);
                break;
            case 5:
                System.out.println(pembeli +" "+"membeli"+" "+menu[5]);
                break;
            default:
                System.out.println("NIAT BELI GAK?");
                break;   
        }
            System.out.println("Terimakasih");
}
}
