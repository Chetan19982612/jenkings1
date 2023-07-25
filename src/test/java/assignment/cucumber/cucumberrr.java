package assignment.cucumber;

import java.util.Scanner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class cucumberrr {
	int x=0;
	int y=0;
	int z=0;


	/*@Given("^User enter two numbers$")
	public void user_enter_two_numbers() throws Throwable {
		Scanner scanner = new Scanner(System.in);
		System.out.println("User enters the first number");
		x= scanner.nextInt();
		
		System.out.println("User enters the second number");
		y= scanner.nextInt();
	   
	}

	@Then("^user Add two numbers$")
	public void user_Add_two_numbers() throws Throwable {
		z = x+y;
	    
	}*/

	@Then("^Result is displayed$")
	public void result_is_displayed() throws Throwable {
		System.out.println(" Result is :"+ z);
	   
	}
	
	@Given("^User enter two numbers <first number><second number> (\\d+)$")
	public void user_enter_two_numbers_first_number(int arg1, int arg2) throws Throwable {
		x = arg1;
		y = arg2;
		
	    
	}

	@Then("^user add two numbers$")
	public void user_add_two_numbers() throws Throwable {
		
		z = x+y;
		
	   
	}

}
