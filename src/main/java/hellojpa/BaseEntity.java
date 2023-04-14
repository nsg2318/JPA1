package hellojpa;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {

    private String createdBy;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
