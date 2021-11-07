package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//테이블 명이 기본 규칙과 다른경우
@Table(name = "JPAMEMBER")
public class JpaMember {

    @Id
    private Long id;
    private String name;

    public JpaMember(){}

    public JpaMember(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
