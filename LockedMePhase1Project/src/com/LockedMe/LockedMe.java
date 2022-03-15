package com.LockedMe;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class LockedMe {
    // set path for directory
    static final String projectFilesPath="D:\\Files";
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[0m";
    // Declaring the color
    // Custom declaration
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
	public static void displayMenu() {
		 System.out.println("===================================");
	     System.out.println(ANSI_GREEN+"\tWelcome To LockedMe.com"+ANSI_RESET);
	     System.out.println(ANSI_GREEN+"\tDeveloped by"+ANSI_YELLOW+" Roshan Mahale"+ANSI_RESET);
	     System.out.println("===================================");
	     System.out.println(ANSI_GREEN+"\t1. Get All File"+ANSI_RESET);
	     System.out.println(ANSI_GREEN+"\t2. Add new File"+ANSI_RESET);
	     System.out.println(ANSI_GREEN+"\t3. Delete a File"+ANSI_RESET);
	     System.out.println(ANSI_GREEN+"\t4. Search File"+ANSI_RESET);
	     System.out.println(ANSI_GREEN+"\t5. Exit"+ANSI_RESET);
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
        try{
            Scanner obj = new Scanner(System.in);
            //get file name from user
            String filename;
            System.out.println(ANSI_PURPLE+"Enter File name to added: "+ANSI_RESET);
            filename= obj.nextLine();

            //get no. of lines want to write in file
            int linesCount;
            System.out.println(ANSI_PURPLE+"Enter no. of line want to write: "+ANSI_RESET);
            linesCount = Integer.parseInt(obj.nextLine());

            FileWriter fw = new FileWriter(projectFilesPath+"\\"+filename+".txt");

            //read line by line from user
            for (int i=1; i<=linesCount; i++){
                System.out.println(ANSI_PURPLE+"Enter line to be write: "+ANSI_RESET);
                fw.write(obj.nextLine()+"\n");
            }
            System.out.println(ANSI_GREEN+"File Added Successfully"+ANSI_RESET);
            fw.close();
        } catch (Exception Ex) {
           System.out.println("Please contact developer");
        }
		
	}
    public static boolean checkFileList(String fileName) {
        //case sensitive
        ArrayList<String> allFilesNames = new ArrayList<String>();
        File file = new File(projectFilesPath);
        String [] fileList = file.list();
        for (var allfiles:fileList){
            allFilesNames.add(allfiles);
        }
        return (allFilesNames.contains(fileName));
        
 }
    public static void deleteFile() {
        try{
        Scanner obj = new Scanner(System.in);
        String fileName;
        System.out.println(ANSI_PURPLE+"Enter file name to deleted: "+ANSI_RESET);
        fileName =obj.nextLine();
        File f = new File(projectFilesPath+"\\"+fileName);
        if (checkFileList(fileName)){
            f.delete();
            System.out.println(ANSI_GREEN+"File delete Successfully"+ANSI_RESET);
        } else{
            System.out.println(ANSI_RED+"File does not found"+ANSI_RESET);
        }
    } catch(Exception Ex) {
        System.out.println("Unable to delete file. Please contact developer.");

    }

		
	}
    public static void SearchFiles() {
        try {
            Scanner obj = new Scanner(System.in);
            String fileName;
            System.out.println(ANSI_PURPLE+"Enter file name to be searched: "+ANSI_RESET);
            fileName =obj.nextLine();
            File f = new File(projectFilesPath+"\\"+fileName);
            if (checkFileList(fileName)){
               System.out.println(ANSI_GREEN+"File is available"+ANSI_RESET);
            } else{
                System.out.println(ANSI_RED+"File does not found"+ANSI_RESET);
            }
        }
        catch(Exception Ex) {
            System.out.println("Unable to find. Please contact developer");
        }
		
	}
	

}
