package at.spengergasse.usermanagement.persistence;

import at.spengergasse.usermanagement.model.User;
import org.aspectj.apache.bcel.util.Repository;
import java.util.List;

public interface UserRepository extends Repository
{
    void save();
    User findById();
    List<User> findAll();
    List<User> findByName();
}
