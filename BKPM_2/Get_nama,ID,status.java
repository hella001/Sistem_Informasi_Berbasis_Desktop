import java.util.Scanner;
public class MenampilkanNamaId{
    public static void main (String [] args) {
        Scanner scan=new Scanner(System.in);
     
        String fName, iName, stuId, stuStatus;
     
        System.out.println("\t--------------------------------------------");
        System.out.println("\tIsi biodata mahasiswa dengan benar.");
        System.out.println("\t--------------------------------------------");
       
        System.out.print("\tNama Depan\t: ");
        fName=scan.nextLine();
       
        System.out.print("\tNama Belakang\t: ");
        iName=scan.nextLine();
       
        System.out.print("\tStudent ID\t: ");
        stuId=scan.nextLine();
       
        System.out.print("\tStudent Status\t: ");
        stuStatus=scan.nextLine();
 
        System.out.println();
        System.out.println("\t========================================================================");
        System.out.println("\t\t\t\tBiodata mahasiswa");
        System.out.println("\t========================================================================");
        System.out.println("\tNama Lengkap\t\t\t: "+fName+" "+iName);
        System.out.println("\tStudent ID\t\t\t: "+stuId);
        System.out.println("\tStudent Status\t\t\t: "+stuStatus);
        System.out.println("\t========================================================================");
    }
}
