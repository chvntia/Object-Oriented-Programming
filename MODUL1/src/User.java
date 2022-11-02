public class User {
    String name;
    int phoneNumber;
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void register(){
        System.out.println("Register Success");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
    
}