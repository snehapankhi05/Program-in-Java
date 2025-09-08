package project;

import java.io.*;
public class ExcepTestChain {

	public static void main(String[] args) {
		try
		{
			ArithmeticException ex=new ArithmeticException("ExceptionMsg");
			ex.initCause(new IOException("We are unable to read/write infinite"));
			throw ex;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}

}

