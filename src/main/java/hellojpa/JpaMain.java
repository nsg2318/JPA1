package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        //emf의 persistenceUnitName 은 pom.xml의 name "hello"
        //emf는 애플리케이션 로딩 시점의 딱 1번만 로드되어야 함(DB 당 하나)
        //em 은 한 작업단위마다 만들어줘야함 마치 컬렉션에 저장해두는 것과 같음
        //쓰레드간 공유하면 안됨
        //JPA의 모든 변경은 트랜잭션 안에서 실행
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code
        try {

            List<JpaMember> result = em.createQuery("select m from JpaMember as m", JpaMember.class)
                    .getResultList();

            for (JpaMember jpaMember : result) {
                System.out.println("jpaMember = " + jpaMember.getName());
            }

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
