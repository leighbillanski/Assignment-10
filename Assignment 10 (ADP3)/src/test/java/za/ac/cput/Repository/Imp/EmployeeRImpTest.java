package za.ac.cput.Repository.Imp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.Employee;
import za.ac.cput.Factory.EmployeeFactory;
import za.ac.cput.Repository.IEmployee;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRImpTest {

    private String id=null;

    private IEmployee comp;
    @Before
    public void setUp() throws Exception {
        this.comp = EmployeeRImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Employee> company = this.comp.getAll();
        Assert.assertEquals(1,company.size());
    }

    @Test
    public void create() {
        Employee student = EmployeeFactory.getEmployee("Kaylynn","Johnson");
        Employee result = comp.create(student);
        id= result.getEmployeeId();
        Assert.assertNotNull(student);
    }

    @Test
    public void read() {
        Employee student = comp.read(id);
        Assert.assertNotNull(student);
    }

}