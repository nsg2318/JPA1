package hellojpa;

public class JpaMain {
    public static void main(String[] args) throws Exception {
        JpaFactory jpaFactory = new JpaFactory();
        JpaService jpaService = jpaFactory.getJpaService();
        jpaService.invoke();
    }
}
