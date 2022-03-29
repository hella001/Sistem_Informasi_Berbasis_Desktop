package array;

import java.util.Scanner;

public class arrayBarisAngka {
    public static void main(String[] args) {
        // Menampilkan barisan angka
       int[][] angka = {
                        {5,6,1,7},{8,1,2,9},
                        {5,4,7,1},{8,3,7,5}
                        };

		for (int i = 0; i < angka.length; i++) {
			for (int j = 0; j < angka[i].length; j++) {
				System.out.print(angka[i][j]+"\t");
			}
			System.out.println();
		}
    }
}
