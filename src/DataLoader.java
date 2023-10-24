
import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;;

public class DataLoader extends DataConstants{
	
	public static ArrayList<User> getUser() {
		ArrayList<User> users = new ArrayList<User>();
		
		try {
			FileReader reader = new FileReader(USER_FILE_NAME);
			JSONParser parser = new JSONParser();	
			JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < peopleJSON.size(); i++) {
				JSONObject personJSON = (JSONObject)peopleJSON.get(i);
				UUID id = UUID.fromString((String)personJSON.get(USER_ID));
				String userName = (String)personJSON.get(USER_USERNAME);
                String password = (String)personJSON.get(USER_PASSWORD);
				String firstName = (String)personJSON.get(USER_FIRST_NAME);
				String lastName = (String)personJSON.get(USER_LAST_NAME);
				
				users.add(new User(id, userName, password, firstName, lastName));
			}
			
			return users;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}