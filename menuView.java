package view;
import java.util.*;
import control.*;

public class menuView {
	public String menuList;
	public int menuChoice;
	public int expAmt;
	Scanner in = new Scanner(System.in);

	public menuView() {
		// TODO Auto-generated constructor stub
	menuList = "\n---------------------------------------------------"

		        +"\n|  Main Menu For Food Budget                              |"

		        +"\n---------------------------------------------------"

		        +"\n1 - Display Total Budget Amount        "

		        +"\n2 - Display Current Balance"    

		        +"\n3 - Enter an expense"
		        
		        +"\n4 - Quit"

		        +"\n---------------------------------------------------"


		        +"\nPlease enter your choice: ";
	
	}
	
	public int displayMenu() {
	System.out.print(menuList);
	menuChoice = in.nextInt();
	return menuChoice;
	}
	
	//Print Food Budget
	public void viewBudgetAmt(int ttlBudget) {
		
		System.out.println("The total amount of the food budget is: $"+ttlBudget);
		
	}
	
	public void viewCurrBalance(int currBalance) {
		System.out.println("The current availabe balance for the food budget is: $"+currBalance);
		
	}
	public int getExpense() {
	System.out.println("Enter expense as an integer:$ ");
	return in.nextInt();
	}
	
	public void viewTtlExpCurrBal(int ttlExp, int currBalance) {
		System.out.println("The total expenses for food are: $" + ttlExp);
		System.out.println("The current availabe balance for the food budget is: $"+currBalance);
		
	}
	
	
	public void sayGoodbye() {
		System.out.println("Thanks for Budgeting and Have a Great Day! \nGood Bye!");
	}
}
