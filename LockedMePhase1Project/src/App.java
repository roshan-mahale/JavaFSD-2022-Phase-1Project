import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);
	    LockedMe.displayMenu();
	
	    obj.next();
	    obj.close();
    }
}
