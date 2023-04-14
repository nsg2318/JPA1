package hellojpa;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY_ITEM")
public class CategoryItem {

    @Id
    @GeneratedValue
    private Long category_item_id;
    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;
}
