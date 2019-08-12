package za.ac.cput.Repository;

import za.ac.cput.Domain.Employee;

import java.util.Set;

public interface IEmployee extends IReposetory<Employee,String>{
    Set<Employee> getAll();
}
