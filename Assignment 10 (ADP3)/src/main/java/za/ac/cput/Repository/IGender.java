package za.ac.cput.Repository;

import za.ac.cput.Domain.Gender;

import java.util.Set;

public interface IGender extends IReposetory <Gender,String>{
    Set<Gender> getAll();
}
