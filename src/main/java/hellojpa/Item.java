package hellojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class Item {
    @Id
    @GeneratedValue
    private Long item_id;
    private String name;

    private String price;
    private String stockQuantity;

}
