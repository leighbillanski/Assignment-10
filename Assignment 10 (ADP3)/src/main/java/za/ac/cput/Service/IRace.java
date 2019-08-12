package za.ac.cput.Service;

import za.ac.cput.Domain.Race;

import java.util.Set;

public interface IRace extends IService<Race,String>{
    Set<Race> getAll();
}
