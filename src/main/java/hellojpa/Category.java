package hellojpa;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.*;

@Entity
@Table(name = "CATEGORY")
public class Category {
    @Id
    @GeneratedValue
    private Long category_id;

    private String name;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "PARENT_ID")
    private Category parent;

    @OneToMany(mappedBy = "parent", cascade = ALL)
    private List<Category> child = new ArrayList<>();
}
