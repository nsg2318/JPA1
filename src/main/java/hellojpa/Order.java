package hellojpa;

import javax.persistence.*;

@Entity
@Table(name = "ORDERS")
public class Order {


    public Order() {
    }

    @Id
    @GeneratedValue
    private Long order_id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    // 주 테이블에 연관관계 주인
    @OneToOne
    @JoinColumn(name = "DELIVERY_ID")
    private Delivery delivery;

    public Order(Member member, Delivery delivery) {
        this.member = member;
        this.delivery = delivery;
    }

    public Member getMember() {
        return member;
    }

    public Delivery getDelivery() {
        return delivery;
    }
}
