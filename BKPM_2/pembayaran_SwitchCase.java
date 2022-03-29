import java.util.Scanner;
public class kasir_SwitchCase {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String nama;
        int angka;
        
        System.out.println("\t Cafe Ceria\t");
        System.out.println("\tAneka Minuman\t");
        System.out.println("=====================================");
        System.out.println("\tSpecial Menu :\t");
        System.out.println("\n1.Soft Drink\n \n2.Mix Juice\n \n3.Nescafe\n \n4.Soda Milk\n \n5.Tea\n");
        System.out.println("=====================================");
        
        System.out.println("Masukkan Nama Pembeli: ");
        nama = input.nextLine();
        
        System.out.println("Silahkan masukkan angka pilihan anda: ");
        angka = input.nextInt();
        
        switch(angka){
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft Drink");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix Juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
            break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda Milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Angka yang anda masukkan salah");
        }
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih "+nama+" telah berkunjung di Cafe Ceria");
        
    }
}
