package array;

import java.util.Scanner;

public class arrayNomerRandom {
    public static void main(String[] args) {
                // Membuat deretan array acak
        Scanner input = new Scanner(System.in);
        int deret = 0;
        
        System.out.println("masukan jumlah deret :");
        deret = input.nextInt();
        
        int [] deretrandom = new int [deret];
        for (int i = 0; i < deret; i++) {
            deretrandom[i]=(int) (Math.random() *10); 
        }
        
        for (int j = 0; j < deret; j++) {
            System.out.println(deretrandom[j]+"\t");
        }
    }
}
