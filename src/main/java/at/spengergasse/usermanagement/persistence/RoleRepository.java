package at.spengergasse.usermanagement.persistence;

import at.spengergasse.usermanagement.model.Role;
import org.aspectj.apache.bcel.util.Repository;

import java.util.List;

public interface RoleRepository extends Repository
{
    void save();
    List<Role> findAll();
    Role findById();
    Role findByRole();
}
