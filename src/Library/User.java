package Library;

public abstract class User {
    protected String name;
    protected String email;
    protected String PhoneNumber;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public User(String name,String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    abstract public void menu();
}
