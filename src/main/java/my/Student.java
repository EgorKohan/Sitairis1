package my;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Objects;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
        "name",
        "telephone",
        "address"
})
public class Student {
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    private String login;

    @XmlElement(required = true)
    private String name;

    @XmlAttribute(required = true)
    private String faculty;

    @XmlElement(required = true)
    private int telephone;

    @XmlElement(required = true)
    private Address address = new Address();

    public Student() {
    }

    public Student(String login, String name, String faculty, int telephone, Address address) {
        this.login = login;
        this.name = name;
        this.faculty = faculty;
        this.telephone = telephone;
        this.address = address;
    }

    @XmlRootElement
    @XmlType(name = "address", propOrder = {
            "country",
            "city",
            "street"
    })
    public static class Address {

        private String country;
        private String city;
        private String street;

        public Address() {
        }

        public Address(String country, String city, String street) {
            this.country = country;
            this.city = city;
            this.street = street;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Address address = (Address) o;
            return Objects.equals(country, address.country) &&
                    Objects.equals(city, address.city) &&
                    Objects.equals(street, address.street);
        }

        @Override
        public int hashCode() {
            return Objects.hash(country, city, street);
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", telephone=" + telephone +
                ", address=" + address +
                '}' + '\n';
    }
}

