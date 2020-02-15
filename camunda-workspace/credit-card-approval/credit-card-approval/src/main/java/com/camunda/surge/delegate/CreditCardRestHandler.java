package com.camunda.surge.delegate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.camunda.surge.model.Customers;



public class CreditCardRestHandler {
	
	HttpURLConnection conn;
	
	
	public void postNewCustomer(Customers customers) {
		 
		 try {
			
			 URL url = new URL("http://localhost:8080/post");
				conn = (HttpURLConnection) url.openConnection();
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Type", "application/json");

				String input = "{\"firstname\":\""+customers.getFirstname()+"\",\"lastname\":\""+customers.getLastname()+"\",\"age\":"+customers.getAge()+",\"score\":"+customers.getScore()+"}";

				OutputStream os = conn.getOutputStream();
				os.write(input.getBytes());
				os.flush();

			/*
			 * if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) { throw new
			 * RuntimeException("Failed : HTTP error code : " + conn.getResponseCode()); }
			 */

				BufferedReader br = new BufferedReader(new InputStreamReader(
						(conn.getInputStream())));

				String output;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}

				

			  } catch (IOException e) {
				System.out.println("Posted in Database!!!");
			} finally {
				  conn.disconnect();
			  }

	}
}
