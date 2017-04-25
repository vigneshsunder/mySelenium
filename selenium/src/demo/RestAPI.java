package demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class RestAPI {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://maps.googleapis.com/maps/api/geocode/json?address=chicago&sensor=false&#8221");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		System.out.println(conn.getResponseCode());
		
		Scanner scan = new Scanner(url.openStream());
		String entireResponse = new String();
		while (scan.hasNext())
		entireResponse += scan.nextLine();

		//System.out.println("Response : " + entireResponse);

		scan.close();
		
		System.out.println(entireResponse.contains("\"formatted_address\" : \"Chicago, IL, USA\""));

	}

}
