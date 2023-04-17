package hellojpa;

import javax.persistence.*;

@Entity
@Table(name = "MEMBER")
public class Member {

    @Id @GeneratedValue
    private Long member_id;
    private String name;

    @Embedded
    private Address address;

    public Long getMember_id() {
        return member_id;
    }

    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Member(){}

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
