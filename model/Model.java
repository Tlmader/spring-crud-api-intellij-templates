import javax.persistence.*;

/**
 * Contains the methods and fields for ${NAME} entities.
 *
 * @author tlmader.dev@gmail.com
 * @since ${DATE}
 */
@Entity
public class ${NAME} extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    public Model() {}

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
