import java.lang.System;
import java.io.*;

public class ReadC{
	static final int MAX_LEN = 255;

	public static void main(String[] args) throws IOException{

		// if (args.length != 1){
		// 	System.err.println("Usage: java ReadC <element> \n");
		// 	System.exit(1);
		// }
		// String chemical = args[0];

		// int i;
		// while ((i = System.in.read()) != -1){
		// 	System.out.print((char) i);
		// }

		byte cmdString[] = new byte[MAX_LEN];

		// get cmd line
		for (int len = 1; len>0;){
			System.out.print("Please enter your element: ");
			len = System.in.read(cmdString);
			String chemical = new String(cmdString, 0, len-1);

			if (len <= 0){
				break;
			}

			// print chemical
			System.out.println("len is: " + chemical.length());
			printChemical(chemical);
		}
		//System.out.println("your chemical is:" + chemical);
			

	}

	// public static String checkC(String chemical){
	// 	//for (int i = 0; i < chemical.length())
	// }

	public static void printChemical(String chemical){

		System.out.println("your chemical is:" + chemical);

	}






}