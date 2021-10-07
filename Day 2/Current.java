package com.hsbc.beans;

public class Current extends Accounts{
          private String nomineeName;
	
	public Current(int accountno,long balance,String ifsc,String nomineeName) 
	{
		super(accountno, balance,ifsc);
		this.nomineeName = nomineeName;
		
	}
	
	public String getnomineeName() {
		return nomineeName ;
	}
	public void setnomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	
    public String display() 
    {
		String details = super.display() +" Nominee name: "+ nomineeName;
		return details;
	}
}
	
	
