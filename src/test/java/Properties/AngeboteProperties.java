package Properties;

public class AngeboteProperties {
    static private String Password;
    static private String DummyID;
    static private String FirstName;
    static private String LastName;
    static private String Street;
    static private String PostCode;
    static private String Place;
    static private String TelephoneNumber;
    static private String DateOfBirth;
    static private String HouseNumber;
    static private String Iban;

    public static String getIban() {
        return Iban;
    }

    public static void setIban(String iban) {
        Iban = iban;
    }


    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }


    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.TelephoneNumber = telephoneNumber;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }


    public String getHouseNumber() {
        return HouseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        HouseNumber = houseNumber;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getDummyID() {
        return DummyID;
    }

    public void setDummyID(String dummyID) {
        DummyID = dummyID;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }



}
