package hellojpa;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "CATEGORY_ITEM")
public class CategoryItem {

    @Id
    @GeneratedValue
    private Long category_item_id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;
}
