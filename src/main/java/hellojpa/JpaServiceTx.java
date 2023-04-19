package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class JpaServiceTx implements JpaService {

    private final EntityManager entityManager;
    private final JpaService jpaService;

    public JpaServiceTx(EntityManager entityManager, JpaService jpaService) {
        this.entityManager = entityManager;
        this.jpaService = jpaService;
    }

    @Override
    public void invoke() {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        try {
            jpaService.invoke();
            tx.commit();
        } catch (Exception e) {
            System.out.println("rollback 실행");
            tx.rollback();
        } finally {
            entityManager.close();
        }
        entityManager.close();
    }
}
