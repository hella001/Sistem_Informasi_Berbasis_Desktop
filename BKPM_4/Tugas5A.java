public class Tugas5A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner scan = new Scanner(System.in);
        //perintah awal
        System.out.print("Masukkan nilai max: ");
        n=scan.nextInt();
        //masukkan perulangan for
        for(int i=2; i <= n; i += 2) {
            System.out.print(i + " ");
            
        }
            
    }
}
