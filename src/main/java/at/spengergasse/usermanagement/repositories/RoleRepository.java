package at.spengergasse.usermanagement.repositories;

import at.spengergasse.usermanagement.models.Role;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleRepository extends CrudRepository<Role, Integer>
{
    //@Query("SELECT r.role FROM r_roles r")
    List<String> getallRoles();
}
