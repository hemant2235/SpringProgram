package CI.Annotation;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;
    private String city;
    private String country;

    public Address() {
        // Default values for simplicity
        this.street = "Mangalabag";
        this.city = "BBSR";
        this.country = "Odisha";
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + country;
    }
}
