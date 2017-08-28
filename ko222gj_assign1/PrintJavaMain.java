package ko222gj_assign1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintJavaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File startDir = new File("C:/Users/khalid/workspace/1DV506");
		visitSub(startDir);
	}
	
	private static int depth = 1;
	private static int count = 0;
	
	private static void visitSub(File file) {
		if (file.isDirectory()) {
			printDir(file);
			depth++;
			File [] subs = file.listFiles();
			for (File f : subs) {
				visitSub(f);
				
			}
			depth--;
		}
	
	}

	
	private static void printDir(File file) {
	    File [] subs = file.listFiles();
		for (File f : subs) {

			int breaker = f.getName().indexOf(".");

			if(breaker > 0 ) 

				if( f.getName().substring(breaker+1, f.getName().length()).equals("java")) {

			Scanner file1 = null;
		

		try {

			 file1 = new Scanner(f);

		}

		catch (FileNotFoundException exception) {

			System.err.println("File is not found");

		}

		int counter = 0;

		while(file1.hasNextLine()) {

			counter ++;

			file1.nextLine();

		}
		
		StringBuffer buf = new StringBuffer();
			for(int i = 0; i < depth; i++) {
				buf.append(" ");
			}
		System.out.println((++count) + buf.toString() + f.getName() + " (" + counter + ")" );	
	}

}}}

	