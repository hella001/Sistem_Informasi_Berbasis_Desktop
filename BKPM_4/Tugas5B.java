public class Tugas5B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("        Do_while");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int i = 1;
        do {
            System.out.print(i*2 + " ");
            i++;
        } 
        while ( i < 100);
    }
}
