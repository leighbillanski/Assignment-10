package za.ac.cput.Repository.Imp;

import za.ac.cput.Domain.Employee;
import za.ac.cput.Repository.IEmployee;

import java.util.*;

public class EmployeeRImp implements IEmployee {

    private  static EmployeeRImp repo = null;
    private Map<String,Employee> emp;

    private EmployeeRImp() {this.emp = new HashMap<>();}

    public static  EmployeeRImp getRepo() {
        if(repo == null) {
            repo = new EmployeeRImp();
        }
        return repo;
    }

    @Override
    public Set<Employee> getAll() {
        Collection<Employee> employees = this.emp.values();
        Set<Employee> set = new HashSet<>();
        set.addAll(employees);
        return set;
    }

    @Override
    public Employee create(Employee e) {
        this.emp.put(e.getEmployeeId(),e);
        return e;
    }

    @Override
    public Employee read(String s) {
        return this.emp.get(s);
    }
}
