package extended;


public class Address {
    private final String houseNumber;
    private final String houseName;
    private final String streetName;
    private final String city;
    private final String postCode;

    public Address(String houseNumber, String houseName, String streetName, String city, String postCode) {

        this.houseNumber = houseNumber;
        this.houseName = houseName;
        this.streetName = streetName;
        this.city = city;
        this.postCode = postCode;
    }

    public String printAddress() {
        return houseNumber + "\n"
                + houseName + "\n"
                + streetName + "\n"
                + city  + "\n"
                + postCode;
    }
}
