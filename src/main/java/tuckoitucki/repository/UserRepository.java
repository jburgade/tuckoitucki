package tuckoitucki.repository;

import org.springframework.data.repository.CrudRepository;
import tuckoitucki.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
