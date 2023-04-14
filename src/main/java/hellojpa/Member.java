package hellojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id @GeneratedValue
    private Long member_id;
    private String name;

    public Member(){}

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
