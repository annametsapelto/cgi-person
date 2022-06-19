public class Address {
    private String streetAddress;
    private String zipCode;
    private String city;

    public Address(String streetAddress, String zipCode, String city) {}
    public void setStreetAddress(String street) {
        if(street.length > 5) {
            this.streetAddress = street;
        }
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void zipCode(String zip) {
        if(zip.length === 5) {
            this.zipCode = zip;
        }
    }

    public String getZipCode() {
        return zipCode;
    }
    public void setCity(String city) {
        if(city.length > 5) {
            this.city = city;
        }
    }

    public String getCity() {
        return city;
    }
}