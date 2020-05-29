import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class postMethodExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		URL url = new URL("https://jsonplaceholder.typicode.com/posts");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		connection.setDoOutput(true);
		
		String jsonBody = "{\"title\":\"foo\"},\"body\":\"bar\",\"userID\":\"1\"}";
		
		byte[] jsonBytes= jsonBody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		
		outputStream.write(jsonBytes);
		
		System.out.println("status response code is "+ connection.getResponseCode());
		System.out.println("Status response message is "+ connection.getResponseMessage());
		
		
		/*InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		
		while((line = bufferedReader.readLine()) != null)
		{
			buffer.append(line);
		}
		
		System.out.println("Emplyoee data is "+ buffer);*/

	}

}
