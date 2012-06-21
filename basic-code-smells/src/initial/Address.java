package initial;

import java.util.LinkedHashMap;
import java.util.Map;

public class Address {
    private Map<String, String> addressBook;

    public Address(String houseNumber, String houseName, String streetName, String city, String postCode) {
        addressBook = new LinkedHashMap<String, String>();
        addressBook.put("House Number", houseNumber);
        addressBook.put("House Name", houseName);
        addressBook.put("Street Name", streetName);
        addressBook.put("City", city);
        addressBook.put("Post Code", postCode);
    }

    public String printFullAddress() {
        String addressString = "";
        for (String addressKey : addressBook.keySet()) {
            String value = addressBook.get(addressKey);
            if (value != "")
                addressString += addressKey + ": " + value + "\n";
        }
        return addressString;
    }
}
