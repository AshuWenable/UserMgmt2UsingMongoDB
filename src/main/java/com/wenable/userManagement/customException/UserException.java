package com.wenable.userManagement.customException;

@SuppressWarnings("serial")
public class UserException extends Exception {
	public UserException(String msg)
	{
		super(msg);
	}
	
	public UserException(String msg,Throwable cause)
	{
		super(msg,cause);
	}
	

}
