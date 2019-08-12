package za.ac.cput.Service.Imp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.Employee;
import za.ac.cput.Domain.Race;
import za.ac.cput.Factory.EmployeeFactory;
import za.ac.cput.Repository.IEmployee;
import za.ac.cput.Repository.IRace;
import za.ac.cput.Repository.Imp.EmployeeRImp;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeSImplTest {

    private EmployeeRImp repository;
    private Employee course;

    private String id=null;

    private IEmployee comp;

    private Employee getSaved(){
        return this.repository.getAll().iterator().next();}

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRImp.getRepo();
        this.course = EmployeeFactory.getEmployee("Woody","Toy");
    }

    @Test
    public void getAll() {
        Set<Employee> courses = this.repository.getAll();
    }

    @Test
    public void create() {
        Employee created = this.repository.create(this.course);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.course);
    }

    @Test
    public void read() {
        Employee student = this.repository.read(id);
        assertEquals(student,student);
    }

}