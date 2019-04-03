package com.patterns.behaviour.template;

import java.util.Scanner;

public abstract class FileProcessorTemplatePattern {
	
	public boolean writeToFile = false;

	public final void fileProcessing() {   //Template method final so subclass cant override
		
		System.out.println("**********Template Design Pattern ********");
		open();
		if(writeToFile = userWants()){
			write();
			save();
		}else{
			read();
		}		
		close();

	}

	abstract void read();   //abstract methods to be declared by subclass

	abstract void write();

	public void open() {    //deafult implemented methods
		System.out.println("File is opening...");
	}

	public void save() {
		System.out.println("Saving File...");
	}

	public void close() {
		System.out.println("File is closing...");
	}
	
	public boolean userWants(){
		System.out.println("Do you want to write to file (y/n) : ");
		Scanner s = new Scanner(System.in);
		String answer = s.nextLine();
		
		if(answer.equals("y")){
			return true;
		}else 
			return false;
		
	}
}
