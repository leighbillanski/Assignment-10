package za.ac.cput.Service;

import za.ac.cput.Domain.EmpRaceGender;

import java.util.Set;

public interface BridgeS extends IService<EmpRaceGender, String> {
    Set<EmpRaceGender> getAll();
}
