package model;

public class modelFoodBudget {
	 int ttlBudget, ttlExpense;

	public modelFoodBudget() {
		// TODO Auto-generated constructor stub
		ttlBudget = 1000;
		ttlExpense = 0;
	}

	 public int getTtlBudget() {
		return ttlBudget;
	}

	 void setTtlBudget(int ttlBudget) {
		this.ttlBudget = ttlBudget;
	}

	 int getTtlExpense() {
		return ttlExpense;
	}

	 void setTtlExpense(int ttlExpense) {
		this.ttlExpense = ttlExpense;
	}
	
	public int updateExpense(int newExpense) {
		this.ttlExpense=this.ttlExpense + newExpense;
		return ttlExpense;
	}
	
	public int getCurrBalance() {
		return this.ttlBudget - this.ttlExpense;
	}

}
