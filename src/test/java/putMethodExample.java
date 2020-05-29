import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class putMethodExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonData = "{\"id\":\"1\",\"title\":\"newTitle\"},\"body\":\"newBody\",\"userID\":\"1\"}";
		
		byte[] jsonBytes = jsonData.getBytes();
		
	    OutputStream outputStream = connection.getOutputStream();
	    outputStream.write(jsonBytes);
	    
	    System.out.println("Status response code is "+ connection.getResponseCode());
	    System.out.println("status response message is "+ connection.getResponseMessage());
	    
	    InputStream inputStream = connection.getInputStream();
	    
	    InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	    
	    BufferedReader buferedReader = new BufferedReader(inputStreamReader);
	    
	    String line;
	    StringBuffer buffer = new StringBuffer();
	    
	    while((line=buferedReader.readLine())!=null)
	    {
	    	buffer.append(line);
	    }
	    
	    System.out.println("Changed data is "+ buffer);
	

	}

}
