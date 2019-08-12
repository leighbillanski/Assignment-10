package za.ac.cput.Service;

import za.ac.cput.Domain.Employee;

import java.util.Set;

public interface IEmployee extends IService<Employee,String>{
    Set<Employee> getAll();
}
