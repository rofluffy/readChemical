import java.lang.System;
import java.io.*;
import java.lang.Character;
import java.util.*;


public class ReadC{
	static final int MAX_LEN = 255;
	//ArrayList<Element> formular = new ArrayList<Element>();

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
			readChem(chemical);
		}
		//System.out.println("your chemical is:" + chemical);
			

	}

	public static void readChem(String chemical){

		// empty list of elements
		ArrayList<Element> formular = new ArrayList<Element>();

		String name = "";
		int coef = 1; //by defaul

		Element newE = new Element(name, coef);
		
		for (int i = 0; i < chemical.length(); i++){
			// read each char in chemical
			char c = chemical.charAt(i);
			//System.out.println("check c: " + c + "\n");
			if (Character.isUpperCase(c)){
				// UpperCase implies a new element is started

				//System.out.println("It's upper: " + c);

				// if newE's name is not empty, add to formular
				if (newE.getName() != ""){
					formular.add(newE);
				}

				name = Character.toString(c);
				newE = new Element(name, coef);

			}else if (Character.isLowerCase(c)){
				// LowerCase implies it's follow up of the previous one
				//System.out.println("It's lower: " + c);

				String newN = newE.getName() + Character.toString(c);
				newE.setName(newN);

			}else if (Character.isDigit(c)){
				// Int implies it's coef of an element
				//System.out.println("It's int: " + c);
				int newC = Character.getNumericValue(c);
				newE.setCoef(newC);
			}
		}

		System.out.println("check len of formular: " + formular.size());
	}

	public static void printChemical(String chemical){

		System.out.println("your chemical is:" + chemical);

	}





}