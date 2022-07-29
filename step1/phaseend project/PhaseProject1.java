package com;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhaseProject1 {

	public static void main(String[] args) {
		 System.out.println("\n**************************************\n");
	        System.out.println("\tWelcome to the App \n");
	        System.out.println("**************************************");
            System.out.println("\nThis app is developed by Amit Kumar.\n");
            optionsSelection();
	}
	private static void optionsSelection() {
        String[] arr = {"1. Returns current file names in ascending order.",
                "2. Returns the details of user interface such as add a file to the existing directory list, delete a user specified file from the existing directory list,Search a user specified file from the main directory",
                "3. Close the application"
        };
        int[] arr1 = {1,2,3};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
            // display the all the Strings mentioned in the String array
        }
        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        //for(int j=1;j<=slen;j++){
            //if(options==j){
                switch (options){
                    case 1:
                    	userInput();
                       
                        optionsSelection();
                        break;
                    case 2:
                    	System.out.println("\nEnter your choice what do you want to perform:\t");
                    	 Scanner cs = new Scanner(System.in);
                    	 System.out.println("\n 1. For adding file in the existing directory");
                    	 System.out.println(" 2. For deleting file in the existing directory");
                    	 System.out.println(" 3. For search file in the existing directory");
                    	 
                         int  choice =  cs.nextInt();
                         switch(choice) {
                         case 1:
                        	 Scanner sca = new Scanner( System.in );
                             System.out.println("Enter the file path where you want to add file: ");
                             String dirPath = sca.nextLine(); // Takes the directory path as the user input

                             File folder = new File(dirPath);
                             try {
                           	  Scanner cre = new Scanner( System.in );
                                 System.out.println("Enter the file name you want to add: ");
                                 String dir = cre.nextLine();
                                 File file = new File(folder.getAbsolutePath(), dir);
                                 
                                 boolean flag = file.createNewFile();
                                 if (flag) {
                                   System.out.println("File has been created successfully at the specified location\n");
                                 }
                                 else {
                                   System.out.println("File already present at the specified location\n");
                                 }
                               }
                               catch(IOException e) {
                                 System.out.println("Exception Occurred:");
                                 e.printStackTrace();
                               }
                        	 break;
                         case 2:
                        	 Scanner scan = new Scanner( System.in );
                             System.out.println("Enter the file path where you want to delete file: ");
                             String diPath = scan.nextLine(); // Takes the directory path as the user input

                             File folde = new File(diPath);
                             try {
                           	  Scanner dele = new Scanner( System.in );
                                 System.out.println("Enter the file name you want to delete: ");
                                 String dir = dele.nextLine();
                                 File file = new File(folde.getAbsolutePath(), dir);
                                 
                                 if(file.delete())                      //returns Boolean value  
                                 {  
                                 System.out.println(file.getName() + " deleted successfully\n");   //getting and printing the file name  
                                 }  
                                 else  
                                 {  
                                 System.out.println("File Not Found.");  
                                 }  
                                 
                               }
                             catch(Exception e)  
                             {  
                             e.printStackTrace();  
                             }  
                        	 break;
                         case 3:
                        	 try {
                        		  Scanner scn = new Scanner( System.in );
                        	      System.out.println("Enter the file path where you want to search file: ");
                        	      String diPth = scn.nextLine(); // Takes the directory path as the user input

                        	      File foldr = new File(diPth);
                        	     
                        	      String[] flist = foldr.list();
                        	      int flag=0;
                        	          
                        	      if (flist == null) {
                        	           System.out.println("Empty directory.");
                        	          }
                        	       else {
                        	        	  Scanner sear = new Scanner( System.in );
                        	              System.out.println("Enter the file name you want to search: ");
                        	        	  String ccn=sear.nextLine();
                        	        	  
                        	        	  
                        	    
                        	              // Linear search in the array
                        	              for (int i = 0; i < flist.length; i++) {
                        	                  String filename =flist[i];
                        	                  
                        	                 if (filename.equalsIgnoreCase(ccn)) {
                        	                      System.out.println(filename + " found");
                        	                      flag=1;
                        	                      
                        	                      
                        	                  }
                        	                
                        	              }
                        	              
                        	          }
                        	      if (flag==0) {
                        	    	  System.out.println("File not found");
                        	      }
                        	          }
                        	          
                        	           catch(Exception e)  
                        	           {  
                        	            e.printStackTrace();  
                        	            }  
                        	 break;
                         
                         default :
                        	 System.out.println("You have made an invalid choice!");
                        	 
                             break;
                        	 
                         }
                       
                        optionsSelection();

                        break;
                    case 3:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!\n");
                        optionsSelection();
                        break;
                }
            //}
        //}

    }
	 private static void closeApp() {
	        System.out.println("Closing your application... \nThank you!");
	            }
	 private static  void userInput()
     {
         Scanner scanner = new Scanner( System.in );
         System.out.println("Enter the file path: ");
         String dirPath = scanner.nextLine(); // Takes the directory path as the user input

         File folder = new File(dirPath);
        
         
         if(folder.isDirectory())
         {
             File[] fileList = folder.listFiles();

             Arrays.sort(fileList);

             System.out.println("\nTotal number of items present in the directory: " + fileList.length );


             // Lists only files since we have applied file filter
             for(File file:fileList)
             {
                 System.out.println(file.getName());
             }

             // Creating a filter to return only files.
             FileFilter fileFilter = new FileFilter()
             {
                 @Override
                 public boolean accept(File file) {
                     return !file.isDirectory();
                 }
             };

             fileList = folder.listFiles(fileFilter);

             // Sort files by name
             Arrays.sort(fileList, new Comparator()
             {
                 @Override
                 public int compare(Object f1, Object f2) {
                     return ((File) f1).getName().compareTo(((File) f2).getName());
                 }
             });

             //Prints the files in file name ascending order
             for(File file:fileList)
             {
                 System.out.println(file.getName());
             }

         }  
     }
	 

}
