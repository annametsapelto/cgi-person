public class Person {
    private Name name;
    private String id;
    private Address address;
    private String email;
    private String phone;
    private BirthDay birthday;

    public Person(Name name, String id, Address address, String email, String phone, BirthDay birthday) {}

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BirthDay getBirthday() {
        return birthday;
    }

    public void setBirthday(BirthDay birthday) {
        this.birthday = birthday;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setEmail(String email) {
        if(email.length() > 5 && email.contains("@")) {
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        if(phone.length() > 8) {
            this.phone = phone;
        }
    }

    public String getPhone() {
        return phone;
    }
}