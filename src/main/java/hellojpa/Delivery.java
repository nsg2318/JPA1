package hellojpa;

import javax.persistence.*;

@Entity
@Table(name = "DELIVERY")
public class Delivery {

    public Delivery() {
    }

    @Id
    @GeneratedValue
    private Long delivery_id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    private String city;
    private String street;

    public Delivery(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
