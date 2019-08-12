package za.ac.cput.Factory;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.Employee;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getEmployee() {
        String name = "Kaylynn";
        String sname = "Johnson";
        Employee company = EmployeeFactory.getEmployee(name,sname);
        assertEquals("Kaylynn", company.getName());
        assertEquals("Johnson", company.getSname());
    }
}