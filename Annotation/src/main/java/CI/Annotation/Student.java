package CI.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private final Address address;

    @Autowired
    public Student(Address address) {
        this.name = "Hemant Kumar Panda"; 
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.toString());
    }
}
