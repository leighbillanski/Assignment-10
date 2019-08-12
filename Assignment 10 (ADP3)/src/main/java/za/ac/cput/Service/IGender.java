package za.ac.cput.Service;

import za.ac.cput.Domain.Gender;

import java.util.Set;

public interface IGender extends IService<Gender,String> {
    Set<Gender> getAll();
}
