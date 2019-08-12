package za.ac.cput.Repository.Imp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.EmpRaceGender;
import za.ac.cput.Domain.Employee;
import za.ac.cput.Factory.EmpRaceGenderFactory;
import za.ac.cput.Factory.EmployeeFactory;
import za.ac.cput.Factory.GenderFactory;
import za.ac.cput.Factory.RaceFactory;
import za.ac.cput.Repository.Bridge;
import za.ac.cput.Repository.IEmployee;

import java.util.Set;

import static org.junit.Assert.*;

public class BridgeImpTest {

    private String id=null;

    private Bridge comp;
    @Before
    public void setUp() throws Exception {
        this.comp = BridgeImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<EmpRaceGender> company = this.comp.getAll();
        Assert.assertEquals(1,company.size());
    }

    @Test
    public void create() {
        EmpRaceGender student = EmpRaceGenderFactory.getEmployee(EmployeeFactory.getEmployee("Kaylynn","Johndon"), RaceFactory.getRace("Coloured"), GenderFactory.getGender("Female"));
        EmpRaceGender result = comp.create(student);
        id= result.getGender().getName();
        assertEquals("Female",id);
    }

    @Test
    public void read() {
        EmpRaceGender student = comp.read(id);
        assertEquals(student,student);
    }
}