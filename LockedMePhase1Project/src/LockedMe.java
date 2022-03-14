import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
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
        Scanner obj = new Scanner(System.in);
            //get file name from user
            String filename;
            System.out.println("Enter File name to added: ");
            filename= obj.nextLine();

            //get no. of lines want to write in file
            int linesCount;
            System.out.println("Enter no. of line want to write: ");
            linesCount = Integer.parseInt(obj.nextLine());

           try{ FileWriter fw = new FileWriter(projectFilesPath+"\\"+filename);

            //read line by line from user
            for (int i=1; i<=linesCount; i++){
                System.out.println("Enter line to be write: ");
                fw.write(obj.nextLine()+"\n");
            }
            System.out.println("File Added Successfully");
            fw.close();
        } catch (Exception Ex) {
           System.out.println("Please contact developer");
        }
		
	}
    public static void deleteFile() {
		
	}
    public static void SearchFiles() {
		
	}
	

}
