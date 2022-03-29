import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TreeApp {
    public static void main(String[] args) throws IOException{
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "Haris");
        theTree.insert(25, "Haqi");
        theTree.insert(75, "Aziz");
        theTree.insert(12, "Herlambang");
        theTree.insert(37, "Leo");
        theTree.insert(43, "Azzam");
        theTree.insert(30, "Abi");
        theTree.insert(33, "Juki");
        theTree.insert(97, "Budi");
        theTree.insert(93, "Rendi");
        theTree.insert(97, "Tegar");
        
        while (true) {            
            System.out.print("Enter first letter of show "
                    + "insert, find, Deletem or traverse: ");
            int choice = getChar();
            switch(choice){
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value and data to insert: ");
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("found: ");
                        found.displayNode();
                        System.out.println("\n");
                    }else{
                        System.out.println("Could not find "+ value );
                    }
                    break;
                case 'd':
                    System.out.println("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("Deleted "+value);
                    }else{
                        System.out.println("Cold not delete "+ value);
                    }
                    break;
                case 't':
                    System.out.println("Enter type 1, 2 or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.println("Invalid entry ");
            }
        }
    }
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    
     public static char getChar() throws IOException {
         String s = getString();
         return s.charAt(0);
     }
     
     public static int getInt() throws IOException {
         String s = getString();
         return Integer.parseInt(s);
     }
}
