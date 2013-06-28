package com.service;

import java.rmi.RemoteException;

import com.service.FirstWebServiceStub.AddTwoNumbers;
import com.service.FirstWebServiceStub.AddTwoNumbersResponse;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws RemoteException{
		// TODO Auto-generated method stub
		FirstWebServiceStub stub = new FirstWebServiceStub();
		AddTwoNumbers atn = new AddTwoNumbers();
		  atn.setFirstNumber(5);
		  atn.setSecondNumber(7);
		  AddTwoNumbersResponse res = stub.addTwoNumbers(atn);
		  System.out.println("============The Response from webservice client======="+res.get_return());
	}

}
