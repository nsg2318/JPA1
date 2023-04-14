package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        try {

//            Member member = new Member("김");
//            Member member = em.find(Member.class, 1L);
//
//            Delivery delivery = new Delivery("city","street");
//            Delivery delivery = em.find(Delivery.class, 2L);
//
//            Order order = new Order(member, delivery);
//            em.persist(order);

            em.flush();
            em.clear();
//            Order order1 = em.find(Order.class, 1L);
//            String name = order1.getMember().getName();
//            String city = order1.getDelivery().getCity();
            //트랜잭션 커밋
            tx.commit();
        } catch (Exception e){
            tx.rollback();
        }
        finally {
            em.close();
        }
        emf.close();
    }
}
