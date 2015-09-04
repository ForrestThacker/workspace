package input.controller;

import java.util.Scanner;

public class InputController
{
	//Declaration section
	//All class data members are declared private
	
	private Scanner myInput;

	//Constructors go here
	
	public InputController()
	{
		myInput = new Scanner(System.in);
	}

	//Methods
	
	public void start()
	{
	questions();
	}
	
	private void questions()
	{
		System.out.println("Hey, what is your name?");
		String input;
		input = myInput.next();
		myInput.nextLine();
	  	System.out.println("Your name's "+ input + "? sucks to be you, m8.");
	  	System.out.println("Uh wot m8? Your full name pls");
	  	String fullName = myInput.nextLine();
	  	System.out.println("Your dumb name is: " + fullName);
	  	System.out.println("Whats your age hot stuff?");
	  	int myAge = myInput.nextInt();
	  	System.out.println("Wow " + input + " You is " + myAge + " years old m8?");
	}
	
}

