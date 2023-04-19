package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaFactory {

    JpaService getJpaService() {
        return getJpaServiceTx();
    }

    private JpaService getJpaServiceTx() {
        EntityManager manager = getManager();
        return new JpaServiceTx(manager,getJpaServiceImpl(manager));
    }

    private JpaService getJpaServiceImpl(EntityManager manager) {
        return new JpaServiceImpl(manager);
    }

    private EntityManager getManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        return emf.createEntityManager();
    }
}
