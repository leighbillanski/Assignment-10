package za.ac.cput.Service.Imp;

import za.ac.cput.Domain.Employee;
import za.ac.cput.Service.IEmployee;

import java.util.Set;

public class EmployeeSImpl implements IEmployee {


    private za.ac.cput.Repository.IEmployee repository;
    private static final EmployeeSImpl employeeS = new EmployeeSImpl();
    EmployeeSImpl(){}

    public static EmployeeSImpl getService() {
        return employeeS;
    }

    @Override
    public Set<Employee> getAll() {
        return repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return repository.create(employee);
    }

    @Override
    public Employee read(String s) {
        return repository.read(s);
    }
}
