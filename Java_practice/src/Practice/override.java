package Practice;

public class override {
	
	int total ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class Account
	{
		
		public int withdraw(int amount)
		{
			if(amount>100)
			{
			int total = 100+amount;	
			}
			return total;
		}
	}
	
	public class savingAccount extends Account
	{
		
		public int withdraw(int amount)
		{
			if(amount<50) 
			{
				int total = 50+amount;
			}
			return total;
			
		}
	}
}
