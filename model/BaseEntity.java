package project.api.model;

import javax.persistence.MappedSuperclass;

/**
 * Contains the abstract methods for entities.
 *
 * @author tlmader.dev@gmail.com
 * @since 2016-11-17
 */

@MappedSuperclass
public abstract class BaseEntity {

    public abstract Long getId();

    public abstract void setId(Long id);
}
