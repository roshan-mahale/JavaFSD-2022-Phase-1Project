import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
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

           try{ FileWriter fw = new FileWriter(projectFilesPath+"\\"+filename+".txt");

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
        try{
        Scanner obj = new Scanner(System.in);
        String fileName;
        System.out.println("Enter file name to deleted: ");
        fileName =obj.nextLine();
        //case sensitive
        ArrayList<String> allFilesNames = new ArrayList<String>();
        File file = new File(projectFilesPath);
        String [] fileList = file.list();
        for (var allfiles:fileList){
            allFilesNames.add(allfiles);
        }
        File f = new File(projectFilesPath+"\\"+fileName);
        
        if (allFilesNames.contains(fileName)){
            f.delete();
            System.out.println("File delete Successfully");
        } else{
            System.out.println("File does not found");
        }
    } catch(Exception Ex) {
        System.out.println("Unable to delete file. Please contact developer.");

    }

		
	}
    public static void SearchFiles() {
        try{
            Scanner obj = new Scanner(System.in);
            String fileName;
            System.out.println("Enter file name to Searched: ");
            fileName =obj.nextLine();
            //case sensitive
            ArrayList<String> allFilesNames = new ArrayList<String>();
            File file = new File(projectFilesPath);
            String [] fileList = file.list();
            for (var allfiles:fileList){
                allFilesNames.add(allfiles);
            }
            File f = new File(projectFilesPath+"\\"+fileName);
            
            if (allFilesNames.contains(fileName)){
                
                System.out.println("File found Successfully");
            } else{
                System.out.println("File does not found");
            }
        } catch(Exception Ex) {
            System.out.println("Unable to delete file. Please contact developer.");
    
        }
		
	}
	

}
