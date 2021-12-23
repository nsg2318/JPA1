package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        try {
//            JpaMember jpaMember1 = new JpaMember(150L, "a");
//            JpaMember jpaMember2 = new JpaMember(151L, "b");
//            //persist 마다 쿼리를 날리면 최적화 여지가 없다.
//            em.persist(jpaMember1);
//            em.persist(jpaMember2);

            JpaMember jpaMember = new JpaMember(200L,"member200");
            em.persist(jpaMember);

            System.out.println("==================");
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
