package at.spengergasse.usermanagement.model;

import java.util.Date;
import java.util.Objects;

public class User {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private long phonenumber;
    private Date birthdate;
    private boolean deleted;
    private boolean isadmin;

    public User(int id, String firstname, String lastname, String email,
                long phonenumber, Date birthdate, boolean deleted, boolean isadmin)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.birthdate = birthdate;
        this.deleted = deleted;
        this.isadmin = isadmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public boolean isIsadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && phonenumber == user.phonenumber && deleted == user.deleted && isadmin == user.isadmin && Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(email, user.email) && Objects.equals(birthdate, user.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, email, phonenumber, birthdate, deleted, isadmin);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                ", birthdate=" + birthdate +
                ", deleted=" + deleted +
                ", isadmin=" + isadmin +
                '}';
    }
}
