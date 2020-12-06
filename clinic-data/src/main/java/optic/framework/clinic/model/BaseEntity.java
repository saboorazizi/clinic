package optic.framework.clinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    // Box type datatype recommended by Hibernate
    // instead of long we use Long
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
