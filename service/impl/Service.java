import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implements service workflow methods for ${NAME} entities.
 *
 * @author tlmader.dev@gmail.com
 * @since ${DATE}
 */
@Service
public class ${NAME}Service extends CrudService<${NAME}> {

    @Autowired
    public ${NAME}Service(ICrudRepository<${NAME}> repository) {
        super(repository);
    }
}
