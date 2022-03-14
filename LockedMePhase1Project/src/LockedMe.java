import java.io.File;
public class LockedMe {

    static final String projectFilesPath="D:\\Files";
	public static void displayMenu() {
		 System.out.println("===================================");
	     System.out.println("\tWelcome To LockedMe.com");
	     System.out.println("\tDeveloped by Roshan Mahale");
	     System.out.println("===================================");
	     System.out.println("\t1. Get All File");
	     System.out.println("\t2. Add new File");
	     System.out.println("\t3. Delete a File");
	     System.out.println("\t4. Search File");
	     System.out.println("\t5. Exit");
	     System.out.println("************************************");
	}
	public static void getAllFiles() {
		File file = new File(projectFilesPath);
        String [] fileList = file.list();
        for (var allfiles:fileList){
            System.out.println(allfiles);
        }
	}
    public static void addNewFile() {
		
	}
    public static void deleteFile() {
		
	}
    public static void SearchFiles() {
		
	}
	

}
