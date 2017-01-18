import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Defines the REST API for ${NAME} entities.
 *
 * @author tlmader.dev@gmail.com
 * @since ${DATE}
 */
@RestController
@RequestMapping("api/${NAME}")
public class ${NAME}Controller {

    @Qualifier("${NAME}Service")
    @Autowired
    private ICrudService<${NAME}> service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<${NAME}>> getAll() {
        return new ResponseEntity<>(this.service.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public ResponseEntity<${NAME}> get(@PathVariable("id") Long id) {
        return new ResponseEntity<>(this.service.get(id), HttpStatus.OK);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.POST)
    public ResponseEntity<${NAME}> create(@PathVariable("id") Long id, @RequestBody ${NAME} entity) {
        return new ResponseEntity<>(this.service.create(id, entity), HttpStatus.CREATED);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.PUT)
    public ResponseEntity<${NAME}> update(@PathVariable("id") Long id, @RequestBody ${NAME} entity) {
        return new ResponseEntity<>(this.service.update(id, entity), HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.DELETE)
    public ResponseEntity<${NAME}> delete(@PathVariable("id") Long id) {
        this.service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
