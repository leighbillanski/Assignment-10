package za.ac.cput.Service.Imp;

import za.ac.cput.Domain.Gender;
import za.ac.cput.Service.IGender;

import java.util.Set;

public class GenderSImp implements IGender {
    private za.ac.cput.Repository.IGender repository;

    private static final GenderSImp genderS = new GenderSImp();
    GenderSImp(){}

    public static GenderSImp getService() {
        return genderS;
    }

    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return repository.create(gender);
    }

    @Override
    public Gender read(String s) {
        return repository.read(s);
    }
}
