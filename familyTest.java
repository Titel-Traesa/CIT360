package codingtopics;
import java.io.*;
//import java.text.ParseException;
//import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class familyTest {

	public familyTest() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new familyTest().jsonExport();
		try {
			new familyTest().jsonImport();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		

	}
	
	public class familyMembers{
		// Declare data fields
		String name;
		boolean isParent;
		boolean isFemale;
		String [] hobbies;
	
	}

	void jsonExport() {
		JSONObject obj = new JSONObject();
		String [] listhobbies = {"Tennis", "Gold", "Gardening"};
		familyMembers mbr1 = new familyMembers();
		mbr1.name="Ben";
		mbr1.isParent = true;
		mbr1.isFemale = false;
		mbr1.hobbies = listhobbies;
		
		obj.put("name", mbr1.name);
		obj.put("isParent", mbr1.isParent);
		obj.put("isFemale",mbr1.isFemale);
		
		JSONArray list = new JSONArray();
		list.add(mbr1.hobbies[0]);
		list.add(mbr1.hobbies[1]);
		list.add(mbr1.hobbies[2]);
		obj.put("hobbie", list);
		
		//Write to JSON file
		try(FileWriter file = new FileWriter("myJSon.json"))
		{
			file.write(obj.toString());
			file.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(obj);
	}
	
	void jsonImport() throws org.json.simple.parser.ParseException {

		
		JSONParser parser = new JSONParser();
		try (Reader reader = new FileReader("/Users/ctrae/Desktop/CIT360/user.json")){
			
			JSONObject objIn = (JSONObject)parser.parse(reader);
			System.out.println("Here is the JSON imported FILE");
			System.out.println(objIn);
			
			familyMembers mbr = new familyMembers();
			
			mbr.name=(String) objIn.get("name");
			mbr.isFemale = (boolean)objIn.get("isFemale");
			mbr.isParent = (boolean)objIn.get("isParent");
			
			/*I couldn't get the array to work and didn't want to spend more time on it
			*JSONArray getHobbies = (JSONArray)objIn.get("hobbies");
			*Iterator<String> iterator = getHobbies.iterator();
			*Integer i=0;
			*while(iterator.hasNext()){
			*mbr.hobbies[i]=iterator.next();
			i=i+1;
			}*/
			//mbr.hobbies = (String [])objIn.get("hobbies");//how do I cast the java array???
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
