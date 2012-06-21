package initial;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AddressTest {

    @Test
    public void testPrintAddressWithFullInformationProvided(){
        //Given
        String houseNumber = "1";
        String houseName = "White House";
        String streetName = "London Road";
        String city = "London";
        String postCode = "WC1";

        Address address = new Address(houseNumber, houseName, streetName, city, postCode) ;
        String expectedAddress = String.format("House Number: %s\nHouse Name: %s\nStreet Name: %s\nCity: %s\nPost Code: %s\n", houseNumber, houseName, streetName,city,postCode);

        //When
        String actualAddress = address.printFullAddress();

        //Then
        assertTrue(expectedAddress.equals(actualAddress));
    }

    @Test
    public void testPrintAddressWithFewerInformation(){
        //Given
        String houseNumber = "1";
        String streetName = "London Road";
        String city = "London";
        String postCode = "WC1";

        Address address = new Address(houseNumber, "", streetName, city, postCode);
        String expectedAddress = String.format("House Number: %s\nStreet Name: %s\nCity: %s\nPost Code: %s\n", houseNumber, streetName,city,postCode);

        //When
        String actualAddress = address.printFullAddress();

        //Then
        assertThat(expectedAddress, is(actualAddress));
    }
}
