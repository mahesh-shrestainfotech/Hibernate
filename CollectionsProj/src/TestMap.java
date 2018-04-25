import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {

		      // key ,callingcode
		HashMap<String,String>  callingCodes = new HashMap<>();
		
		callingCodes.put("IND", "091");
		callingCodes.put("US","001");
		callingCodes.put("UK","044");
		
		HashMap<String,String>  callingCodes2 = new HashMap<>();
		
		callingCodes2.put("AUS","006");
		callingCodes2.put("SING","066");
		callingCodes2.put("CAN","001");
		
		callingCodes.putAll(callingCodes2);
		
		Set<Entry<String,String>> entries = callingCodes.entrySet();
		
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
//		Set<String> keys = callingCodes.keySet();
//		
//		for (String str : keys) {
//			System.out.println(str);
//		}
		
		
	}

}
