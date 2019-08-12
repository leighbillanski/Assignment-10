package za.ac.cput.Repository;

import za.ac.cput.Domain.Race;

import java.util.Set;

public interface IRace extends IReposetory<Race,String> {
    Set<Race> getAll();
}
