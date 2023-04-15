package hellojpa;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.LAZY;

@Entity
@Table(name = "ORDERS")
public class Order {


    public Order() {
    }

    @Id
    @GeneratedValue
    private Long order_id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    // 주 테이블에 연관관계 주인
    @OneToOne(fetch = LAZY,cascade = ALL)
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
