package at.spengergasse.usermanagement.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "u_users")
public class User
{
    @Id
    @Column(name = "u_userId")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;
    @Column(name = "u_firstname")
    private String firstname;
    @Column(name = "u_lastname")
    private String lastname;
    @Column(name = "u_email")
    private String email;
    @Column(name = "u_deleted")
    private boolean isDeleted;
    @Column(name = "u_createdAt")
    private Date created;
    @Column(name = "u_deletedAt")
    private Date deleted;
    @ManyToMany
    Set<Role> roles;

}
