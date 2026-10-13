package demo;

public class bank {
	private String accHolderName;
	private int accnumber;
	private int accbalance;
	private String accStatus;
	
	public  void setaccHolderName(String accHolderName){
		  this.accHolderName=accHolderName;
	}
	
	public String getaccHolderName() {
	        return accHolderName;
	    }
	
	
	
	public void setaccnumber(int accnumber) {
		this.accnumber=accnumber;
	}
	
	 public int getaccNumber() {
	        return accnumber;
	    }
	 
	 
	
	public void setaccbalance(int accbalance) {
		 this.accbalance = accbalance;
		
	}
	
	public int getaccbalance() {
		return accbalance;
	}
	

	
	public void setaccStatus(String accStatus) {
		this.accStatus= accStatus;
	}
	
	  public String getaccStatus() {
	        return accStatus;
	    }
	
	
	  public static void main(String[] args) {
		  bank b = new bank();
		  b.setaccHolderName("prashant patil ");
		  b.setaccnumber(909009009);
		  b.setaccbalance(4909);
		  b.setaccStatus("active");	
		  
		  
		  System.out.println("Account Holder: " + b.getaccHolderName());
	      System.out.println("Account Number: " + b.getaccNumber());
	      System.out.println("Account Balance: " + b.getaccbalance());
	      System.out.println("Account Status: " + b.getaccStatus());
	  
	
	  
	  if (b.getaccStatus().equals("active") && b.getaccbalance() > 1000) {
		  System.out.println("Acoount is active and  has balance");
	  }
	  else {
		  System.out.println("Account is inactive");
	  }
	
}
}

