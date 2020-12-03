package composition;

public class Student {

    private String name;
    private int age;
    private Address address;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        Address tempAddress = new Address(streetAddress, zipCode, state, phone);
        setAddress(tempAddress);
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress(){ return address;}

    public void setAddress(Address address) {
        this.address = address;
    }
}
