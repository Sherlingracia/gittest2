package comm.jenifer.git;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Git {
	 
	    public static void main(String[]args) throws FileNotFoundException        
	    { 
	            Scanner console = new Scanner(System.in);           

	            System.out.println("File to be read: ");
	            String inputFile = console.next();

	            File file = new File(inputFile);
	            Scanner in = new Scanner(file);

	            int words = 0;
	            int lines = 0;
	            int chars = 0;

	            while(in.hasNext())
	            {
	                in.next();
	                words++;
	            }

	            while(in.hasNextLine())
	            {
	                in.nextLine();
	                lines++;
	            }
	            while(in.hasNextByte())
	            {
	                in.nextByte();
	                chars++;
	            }
	    }
	}


