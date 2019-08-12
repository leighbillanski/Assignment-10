package za.ac.cput.Repository.Imp;

import za.ac.cput.Domain.EmpRaceGender;
import za.ac.cput.Domain.Employee;
import za.ac.cput.Factory.EmpRaceGenderFactory;
import za.ac.cput.Repository.Bridge;

import java.util.*;

public class BridgeImp implements Bridge {

    private  static BridgeImp repo = null;
    private Map<String,EmpRaceGender> emp;

    private BridgeImp() {this.emp = new HashMap<>();}

    public static  BridgeImp getRepo() {
        if(repo == null) {
            repo = new BridgeImp();
        }
        return repo;
    }

    @Override
    public Set<EmpRaceGender> getAll() {
        Collection<EmpRaceGender> employees = this.emp.values();
        Set<EmpRaceGender> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public EmpRaceGender create(EmpRaceGender empRaceGender) {
        this.emp.put(new Employee().getEmployeeId(),empRaceGender);
        return empRaceGender;
    }

    @Override
    public EmpRaceGender read(String s) {
        return this.emp.get(s);
    }
}
