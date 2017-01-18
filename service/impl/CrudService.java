import org.springframework.stereotype.Service;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Objects;

/**
 * Implements service workflow methods for entities.
 *
 * @author tlmader.dev@gmail.com
 * @since 2016-11-20
 */
@Service
abstract class CrudService<T extends BaseEntity> implements ICrudService<T> {

    private ICrudRepository<T> repository;

    public CrudService(ICrudRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> getAll() {
        return this.repository.getAll();
    }

    @Override
    public T get(Long id) {
        T entity = this.repository.get(id);
        if (entity == null) {
            throw new WebApplicationException("Could not find entity with ID " + String.valueOf(id), Response.Status.NOT_FOUND);
        }
        return entity;
    }

    @Override
    public T create(Long id, T entity) {
        if (!Objects.equals(id, entity.getId())) {
            throw new WebApplicationException("ID must equal 'id' attribute in body", Response.Status.BAD_REQUEST);
        }
        entity.setId(id);
        return this.repository.create(entity);
    }

    @Override
    public T update(Long id, T entity) {
        if (!Objects.equals(id, entity.getId())) {
            throw new WebApplicationException("ID must equal 'id' attribute in body", Response.Status.BAD_REQUEST);
        }
        entity.setId(id);
        return this.repository.update(entity);
    }

    @Override
    public void delete(Long id) {
        this.repository.delete(id);
    }
}
