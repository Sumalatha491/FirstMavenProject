package com.personal.firstProject.com.personal.firstProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class ReverseString {

	@Test
	public void javaPrograms()
	{
		// TODO Auto-generated method stub

		//Reverse a String
		String str = "SUMA";
		String rev ="";

		char ch[]= str.toCharArray();

		for (int i= ch.length-1; i>=0; i--)
		{
			rev = rev+ ch[i];
		}

		System.out.println("REversed string is"+ rev);

		// Reverse a number
		int num= 2346;
		int revnum=0;

		while (num != 0)
		{
			revnum = revnum*10;
			revnum = revnum + num%10;
			num = num/10; 
		}
		System.out.println("REversed number is "+ revnum);

		// Duplicate characters in a string

		String str1 = "applemm";
		int count = 0;

		char ch1[] = str1.toCharArray();

		for(int i=0; i< str1.length(); i++)
		{
			for(int j= i+1; j< str1.length(); j++)
			{
				if(ch1[i]==ch1[j])
				{
					System.out.println("Duplicate character " + ch1[j]);
					break;
				}
			}
		}

		List<String> alist = new ArrayList<String>();

		alist.add(null);

		for (String string : alist) {

			System.out.println("Array list data is " + string);

		}

		Set<String> set = new HashSet<String>();

		set.add(null);

		for (String string1 : set) {

			System.out.println("set data is " + string1);

		}
		Iterator iterator = set.iterator();

		while(iterator.hasNext())
		{
			System.out.println("Iterator values are" + iterator.next());
		}
		
		String a = "Love";  
        String b = "You";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;  
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        
        
        System.out.println("After : " + a + " " + b);  
        
        String st = "LoveYou";
        System.out.println("sub String is"+ st.substring(0,4));
        
    	//Factorial of a number
    	
    	//Scanner scan = new Scanner(System.in);
    	int num1 = 5;
    	
    	int fact=1;

    	for(int i=1; i<= num1 ; i++)
    	{
    		fact = fact*i;
    	}
    	System.out.println("factorial of a number is "+ fact);
    	
    	//Fibanocci series
    	
    	int x=0, y=1, num2 =10;
    	System.out.println(x+ " "+ y);
    	for(int j=2; j<num2; ++j)
     	{
     		int z=x+y;
     		x=y;
     		y=z;
     		System.out.println(""+z);
     	}
    	
    	//odd number or even number;
    	
    	int even =4;
    	
    	if(even%2 ==0)
    	{
    		System.out.println("Number is even");
    	}
    	else
    	{
    		System.out.println("Number is odd");
    	}
    	
    	//Swap 2 numbers with out third variable
    	int first =4, second =6;
    	
    	int third = first+second;
    	first = third-first;
    	second = third-second;
    	
    	System.out.println("First number is "+ first);
    	System.out.println("Second number is"+ second);
    	
    	//Swap 2 strings with third variable
    	String firststr = "SUMA";
    	String secondstr = "BANA";
    	
    	String thirdstr ="";
    	
    	thirdstr = firststr;
    	firststr = secondstr;
    	secondstr = thirdstr;
    	
    	System.out.println("First string is " + firststr);
    	System.out.println("Second string is " + secondstr);
    	
    	int prime = 4,k;
    	
    	for( k=2; k<prime; k++)
    	{
    		if(prime%2==0)
    		{
    			System.out.println("Number is not prime");
    			break;
    		}
    	}
    	if(prime==k)
    	{
    		System.out.println("Number is prime");
    	}
    	
    	//Armstrong number 
    	
    	int no = 123, doarm,arm=0;
    	doarm = no;
    	
    	while(no >0)
    	{
    		int a1 = no %10;
    		no = no/10;
    		arm = arm+ a1*a1*a1;
    		
    	}
    	
    	if(arm==doarm)
    	{
    		System.out.println("number is armstrong");
    	}
    	else
    	{
    		System.out.println("Number is not armstrong");
    	}
    	
    	// Duplicate words in the String
    	
    	String newString = "bread is more than and bread";
    	
    	String[] strarray = newString.split(" ");
    	
    	HashMap<String, Integer> words = new HashMap<String, Integer>();
    	
    	for(String word : strarray)
    	{
    		if(words.containsKey(word.toLowerCase()))
    		{
    			words.put(word.toLowerCase(), words.get(word.toLowerCase())+1);
    		}
    		else
    		{
    		   words.put(word.toLowerCase(), 1);	
    		}
    	}
    	
    	Set<String> keyset= words.keySet();
    	
    	
    	for(String key : keyset)
    	{
    		//System.out.println(key);
    		//System.out.println("string is " + keys.toLowerCase());
    		//System.out.println("value is "+ words.get(keys));
    		if(words.get(key)>1)
    		{
    			System.out.println("duplicate strings are " + words.get(key));
    		}
    	}
    	
    	 //Difference between equals and compare to
    	
    	String compare1 = "agni";
    	String compare2 = "Suma";
    	
    	int result = compare1.compareTo(compare2);
    	
    		System.out.println("comparision result is" + result);
    	
	}
	
   

}
