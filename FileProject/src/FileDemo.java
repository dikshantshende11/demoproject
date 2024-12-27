import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileDemo {
	int a;
static File javafile=null;
	public static void main(String[] args) {
		int choice=0;

	do {
		
	
	System.out.println("Enter Your choice");
	System.out.println("1.create file");	
	System.out.println("2.write file");	
	System.out.println("3.read file");	
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
		
		switch(choice){
		case 1:
			createFile();
			break;
		case 2:
			writeFile();
			break;
		case 3:
			readFile();
			break;
			
		}	
	
	}while(choice>0 && choice<3); {
		System.out.println("Existing program...");
	}
	}
	public static void createFile() {
		System.out.println("Enter your file name");
		Scanner sc=new Scanner(System.in);
		String filename=sc.next();
		 javafile=new File("C:\\java\\"+filename+".txt");

			try {
				javafile.createNewFile();
			} catch (IOException e) {
			System.out.println("failed");
			}
		
		System.out.println("create file succesfully");
	}public static void writeFile(){
		
		try {
			if(javafile==null) {
				System.out.println("file not exist");
			}else {
			FileWriter fw=new FileWriter(javafile);
			fw.write("hello world");
			fw.write("hello java");
			fw.close();
			System.out.println("file written sucessfully");
			}
		} catch (IOException e) {
			System.out.println("file writing failed");
		}	
		}public static void readFile(){
			try {
			
				Scanner sc=new Scanner(javafile);
			String fileinput=sc.nextLine();
			System.out.println(fileinput);
			} catch (FileNotFoundException e) {
				System.out.println("file reading failed");
			}
			
		}
	}
	
		
	
		
		
		

	
