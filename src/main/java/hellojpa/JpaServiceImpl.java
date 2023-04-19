package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaServiceImpl implements JpaService {

    EntityManager em;

    public JpaServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void invoke() throws Exception{

        Movie movie = new Movie();
        movie.setDirector("가나다라");
        movie.setCreatedBy("홍길동");

        //명확할 때
        TypedQuery<Movie> selectMFromMovieM = em.createQuery("select m from Movie m", Movie.class);
        List<Movie> resultList = selectMFromMovieM.getResultList();
        for (Movie movie1 : resultList) {
            System.out.println(movie1.getDirector());
        }
        TypedQuery<String> query = em.createQuery("select m.director from Movie m", String.class);

        //반환 타입이 명확하지 않을 때
        Query query1 = em.createQuery("select m.director,m.createdBy from Movie m");

        em.persist(movie);
        em.flush();
        em.clear();
    }
}
