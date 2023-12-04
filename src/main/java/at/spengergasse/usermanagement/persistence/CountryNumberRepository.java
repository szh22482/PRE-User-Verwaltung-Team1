package at.spengergasse.usermanagement.persistence;

import at.spengergasse.usermanagement.model.CountryNumber;
import org.aspectj.apache.bcel.util.Repository;

import java.util.List;

public interface CountryNumberRepository extends Repository
{
    void save();
    CountryNumber findById();
    CountryNumber findByName();
    List<CountryNumber> findAll();
}
