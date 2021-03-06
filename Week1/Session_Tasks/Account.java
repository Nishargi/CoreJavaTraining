// 5) Exception handling:

/* Create an Account Class with attribute private acc_balance = 0 and withdraw(int amount) method for withdrawal of amount and 
 * showBalance() to show balance.

Create own exception class as WithdrawException and its object should be thrown if asked withdrawal amount is greater than balance amount 
else show withdraw amount success.
*/

package com.neosoft.basics;

public class Account{

	    int acc_balance,amount;
		public Account(int acc_bal) {
			this.acc_balance=acc_bal;	
		}
		
		public void withdraw(int amount) throws WithdrawException{
	        try {
	            
	        	if(amount>acc_balance)
	        	{
	                throw new WithdrawException ("Insufficient funds ! your Current balance is " + acc_balance);
	            }
	        	
	        	else 
	        	{
	                System.out.println("Please Take The Money (Success....)");
	            }
	        } 
	        catch (WithdrawException  mab) {
	            mab.printStackTrace();
	        }
	        acc_balance = acc_balance - amount;
		}
		
		public void showBalance()
		{
			System.out.println("Your Balance is:"+ acc_balance);
		}
		public static void main(String[] args){
				
			Account a1 = new Account(50000);
			Account a2 = new Account(40000);
			try {
				a1.withdraw(20000);
			    a1.showBalance();
			    a2.withdraw(50000);
			    a2.showBalance();
			} catch (WithdrawException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	
		}

}

class WithdrawException extends Exception {

    String message;

    public WithdrawException (String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}


/* Output:
Please Take The Money (Success....)
Your Balance is:30000
Insufficient funds ! your Current balance is 40000
Your Balance is:-10000 */

