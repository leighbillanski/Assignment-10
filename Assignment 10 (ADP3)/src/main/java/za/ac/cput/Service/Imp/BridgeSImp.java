package za.ac.cput.Service.Imp;

import za.ac.cput.Domain.EmpRaceGender;
import za.ac.cput.Repository.Imp.BridgeImp;
import za.ac.cput.Service.BridgeS;

import java.util.Set;

public class BridgeSImp implements BridgeS {

    private BridgeImp repo;

    @Override
    public Set<EmpRaceGender> getAll() {
        return repo.getAll();
    }

    @Override
    public EmpRaceGender create(EmpRaceGender empRaceGender) {
        return repo.create(empRaceGender);
    }

    @Override
    public EmpRaceGender read(String s) {
        return repo.read(s);
    }
}
