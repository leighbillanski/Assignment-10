package za.ac.cput.Repository;

import za.ac.cput.Domain.EmpRaceGender;

import java.util.Set;

public interface Bridge extends IReposetory<EmpRaceGender,String> {
    Set<EmpRaceGender> getAll();

}
