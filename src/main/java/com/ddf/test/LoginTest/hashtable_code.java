package com.ddf.test.LoginTest;

import java.util.Hashtable;

public class hashtable_code 
{
	 public static void main(String args[])
	    {
	        Hashtable<Integer, String> h1 = new Hashtable<>();
	        Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
	        Hashtable<String, String> h3 = new Hashtable<String, String>();
	        h2.put(1,"Savita");
	       // h1.put(2,"Savita");
	       // h1.put(3,"Savita");
	        
	        h3.put("Savita", "Yadav");
	        System.out.println("Mapping of h2:"+h2);
	    }
	        

}
