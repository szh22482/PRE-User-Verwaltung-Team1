package at.spengergasse.usermanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.util.List;

@Entity
@Getter
@Builder
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "countrynumbers")
public class CountryNumber extends AbstractPersistable<Long>
{
    private String name;
    private String countrycode;
    private int dialCode;
    private String flagImage;
    @OneToMany
    private List<User> users;
}
