package com.personal.firstProject.com.personal.firstProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUrlConnectionExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("GET");
		connection.connect();
		
		int statuscode = connection.getResponseCode();
		System.out.println("Response code is " + statuscode);
		
		String responseMsg = connection.getResponseMessage();
		
		System.out.println("Response message is " + responseMsg);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader ipStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferReader = new BufferedReader(ipStreamReader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		
		while((line= bufferReader.readLine()) != null)
		{
			buffer.append(line);
		}
		
		System.out.println(buffer); 
		}
		

	}


