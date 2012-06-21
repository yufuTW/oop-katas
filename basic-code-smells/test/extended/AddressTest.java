package extended;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AddressTest {
    @Test
    public void testPrintsAddress() throws Exception {
        //Given
        String houseNumber = "5";
        String houseName = "Berkshire";
        String streetName = "Lemon Road";
        String city = "Cantebury";
        String postCode = "W5 C56";
        Address address = new Address(houseNumber, houseName, streetName, city, postCode);
        String expectedAddress = String.format("%s\n%s\n%s\n%s\n%s", houseNumber, houseName, streetName, city, postCode);

        //When
        String actualAddressString = address.printAddress();

        //Then
        assertThat(actualAddressString, is(expectedAddress));
    }
}
