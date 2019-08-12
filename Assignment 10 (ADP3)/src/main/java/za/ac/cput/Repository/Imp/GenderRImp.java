package za.ac.cput.Repository.Imp;

import za.ac.cput.Domain.Gender;
import za.ac.cput.Repository.IGender;

import java.util.*;

public class GenderRImp implements IGender {

    private  static GenderRImp repo = null;
    private Map<String,Gender> emp;

    private GenderRImp() {this.emp = new HashMap<>();}

    public static  GenderRImp getRepo() {
        if(repo == null) {
            repo = new GenderRImp();
        }
        return repo;
    }

    @Override
    public Set<Gender> getAll() {
        Collection<Gender> gender = this.emp.values();
        Set<Gender> set = new HashSet<>();
        set.addAll(gender);
        return set;
    }

    @Override
    public Gender create(Gender gender) {
        this.emp.put(gender.getGenderId(),gender);
        return gender;
    }

    @Override
    public Gender read(String s) {
        return this.emp.get(s);
    }
}
