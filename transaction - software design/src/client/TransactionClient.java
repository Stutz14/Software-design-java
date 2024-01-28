package client;

import utilities.SpecificRequestObject1;

public class TransactionClient {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transaction aTransaction = new Transaction();
		SpecificRequestObject1 aRequestObject = new SpecificRequestObject1();
		
		aTransaction.setaRequestObject(aRequestObject);
		
		aTransaction.performTransaction();

	}

}
