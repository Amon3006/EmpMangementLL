// package com.calender;

public class ConsoleInput {
	public static String getString() {
		try {
			byte[] input = new byte[100];
			int len = System.in.read(input);
			byte[] finalinput = new byte[len - 2];
			System.arraycopy(input, 0, finalinput, 0, len - 2);
			String S = new String(finalinput);
			return S;
		} catch (Exception e) {
			System.out.print(e);
		}
		return null;
	}

	public static int getInt() {
		int i;
	while(true)
		{
			try{
				i = Integer.parseInt(getString());
				break;
	}
	
	catch(Exception e){
		System.out.println("invalid Number try again");}
		
	}
	return i;
	}


	public static float getFloat() {
		float i;
	while(true)
		{
			try{
				i = Float.parseFloat(getString());
				break;
	}
	
	catch(Exception e){
		System.out.println("invalid Number try again");}
		
	}
	
	return i;
	
 }
}
