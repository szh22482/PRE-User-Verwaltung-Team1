package at.spengergasse.usermanagement.repositories;

import at.spengergasse.usermanagement.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
