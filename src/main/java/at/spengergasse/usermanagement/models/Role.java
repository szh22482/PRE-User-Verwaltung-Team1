package at.spengergasse.usermanagement.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "r_roles")
public class Role
{
    @Id
    @Column(name = "r_roleId")
    private Integer roleId;
    @Column(name = "r_name")
    private String role;
    @ManyToMany(mappedBy = "roles")
    Set<User> users;
}
