
public class ATM{
	
	
	private double balance;
	private double depositeAmount;
	private double withDrawAmount;
	
	public ATM(){
		
		
	}
	
	
	public void setBalance(double balance){
		
		this.balance = balance;
		
	}
	
	public double getBalance(){
		
		return this.balance;
		
	}
	
	public void setDepositeAmount(double depositeAmount){
		
		this.depositeAmount = depositeAmount;
		
	}
	
	public double getDepositeAmount(){
		
		
		return this.depositeAmount;
		
	}
	
	public void setWithDrawAmount(double withDrawAmount){
		
		
		this.withDrawAmount = withDrawAmount;
	}
	
	public double getWithDrawAmount(){
		
		
		return this.withDrawAmount;
	}

}
