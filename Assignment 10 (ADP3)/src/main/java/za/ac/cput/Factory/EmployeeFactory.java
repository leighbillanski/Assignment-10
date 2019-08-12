package za.ac.cput.Factory;

import za.ac.cput.Domain.Employee;
import za.ac.cput.Util.Misc;

public class EmployeeFactory {
    public static Employee getEmployee(String name,String sname) {
        return new Employee.Builder().employeeId(Misc.generateId())
                .name(name)
                .Sname(sname)
                .build();
    }
}
