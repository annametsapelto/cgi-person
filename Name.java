public class Name {
    private String firstName;
    private String lastName;

    public Name (String first, String last) {
        setFirstName(first);
        setLastName(last);
    }

    public void setFirstName(String first) {
        if(first.length > 1) {        
            this.firstName = first;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String last) {
        if(last.length > 1) {
            this.lastName = last;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return getLastName() + ", " + getFirstName();
    }
}