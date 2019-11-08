package control;
import model.*;
import view.*;

public class mainControl {
	//create an instance of menuView and modelFoodBudget
	menuView view1 = new menuView();
	modelFoodBudget model1 = new modelFoodBudget();
	
	public int userChoice;
	public int extAmt;
	

	public mainControl() {
		// TODO Auto-generated constructor stub
	}

	public void menuControl() {
		//do {
			userChoice = view1.displayMenu();
		
		
		switch(userChoice) {
		case 1:
			//Display Total Budget
			int ttlBudget = model1.getTtlBudget();
			view1.viewBudgetAmt(ttlBudget);
			menuControl();
			break;
		case 2:
			//Display Current Balance
			int currBalance = model1.getCurrBalance();
			view1.viewCurrBalance(currBalance);
			menuControl();
			break;
		case 3:
			//User enter's expense and then show total expenses
			int exp = view1.getExpense();
			int ttlExp = model1.updateExpense(exp);
			int currBal = model1.getCurrBalance();
			view1.viewTtlExpCurrBal(ttlExp, currBal);
			menuControl();
			break;
		case 4:
			//Say goodbye
			view1.sayGoodbye();
			System.exit(0);
			break;
		default:
			//try again
			System.out.printf("%d is not a valid entry.\n", userChoice);
			menuControl();
		}
		//}while(userChoice!=4);
		
		
		}
		
		
	}
	

