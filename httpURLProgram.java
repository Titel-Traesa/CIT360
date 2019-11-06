package codingtopics;

import java.net.*;
import java.util.Scanner;
import java.io.*;
public class httpURLProgram {

	public static boolean chkURLValid(String testURL) {
		try {
			URL obj = new URL(testURL);
			obj.toURI();
			return true;
		}catch (MalformedURLException e) {
			return false;
		}catch (URISyntaxException e) {
			return false;
		}
			
		}

	public httpURLProgram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{ //this is in the event the web page being opened is problematic
		//create object and store the webpage data
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a website name - In the format of https://websitename.com: \n");
		String tryURL = (in.nextLine());
		
		if (chkURLValid(tryURL)) {
		
		URL testWebPage = new URL(tryURL);
		//Open connection to page
		HttpURLConnection testIt = (HttpURLConnection) testWebPage.openConnection();
		
		BufferedReader getText = new BufferedReader(new InputStreamReader(testIt.getInputStream()));
		
		
		//assign string to grab the httpCode and then output it
		String gethttpCode;
		
		while((gethttpCode = getText.readLine())!=null) {
			if(gethttpCode.isEmpty()!=true) {
				System.out.println(gethttpCode);
			}else {
				System.out.println("There is nother to print");
			}
		}
		}else {
			System.out.println("Enter valid URL");
		}
		in.close();
		
		}
		

	}


