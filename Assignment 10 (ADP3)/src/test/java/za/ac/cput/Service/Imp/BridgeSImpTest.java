package za.ac.cput.Service.Imp;

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
import za.ac.cput.Repository.Imp.BridgeImp;
import za.ac.cput.Repository.Imp.EmployeeRImp;

import java.util.Set;

import static org.junit.Assert.*;

public class BridgeSImpTest {

    private BridgeImp repository;
    private EmpRaceGender course;

    private String id=null;

    private Bridge comp;

    private EmpRaceGender getSaved(){
        return this.repository.getAll().iterator().next();}

    @Before
    public void setUp() throws Exception {
        this.repository = BridgeImp.getRepo();
        this.course = EmpRaceGenderFactory.getEmployee(EmployeeFactory.getEmployee("Kaylynn","Johndon"), RaceFactory.getRace("Coloured"), GenderFactory.getGender("Female"));
    }

    @Test
    public void getAll() {
        Set<EmpRaceGender> courses = this.repository.getAll();
    }

    @Test
    public void create() {
        EmpRaceGender created = this.repository.create(this.course);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.course);
    }

    @Test
    public void read() {
        EmpRaceGender student = this.repository.read(id);
        assertEquals(student,student);
    }
}