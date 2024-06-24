package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {

	public AddPlace addPlacePayload(String name, String language, String address)
	{
		AddPlace p = new AddPlace();
		
		p.setAccuracy(50);
		p.setAddress(address);
		p.setLanguage(language);
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("https://rahulshettyacademy.com");
		p.setName(name); 
	
		List <String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		
		p.setTypes(myList);
		
		
		Location L = new Location();
		L.setLat(-38.383494);
		L.setLng(33.427362);
		
		p.setLocation(L);
		
		return(p);
	
	}
	
	public String deletePlacePayload(String placeId)
	{
		
		return ("{\n\n    \"place_id\":\""+placeId+"\"\n}");
		
	}
	
	
	
}
