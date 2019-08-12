package za.ac.cput.Service.Imp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.Employee;
import za.ac.cput.Domain.Race;
import za.ac.cput.Factory.RaceFactory;
import za.ac.cput.Repository.Imp.EmployeeRImp;
import za.ac.cput.Repository.Imp.RaceRImp;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceSImpTest {

    private RaceRImp repository;
    private Race course;

    private String id=null;


    private Race getSaved(){
        return this.repository.getAll().iterator().next();}

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRImp.getRepo();
        this.course = RaceFactory.getRace("Toy");
    }

    @Test
    public void getAll() {
        Set<Race> courses = this.repository.getAll();
    }

    @Test
    public void create() {
        Race created = this.repository.create(this.course);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.course);
    }

    @Test
    public void read() {
        Race student = this.repository.read(id);
        assertEquals(student,student);
    }

}