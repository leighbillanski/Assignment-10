package za.ac.cput.Service.Imp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.Gender;
import za.ac.cput.Factory.GenderFactory;
import za.ac.cput.Repository.Imp.GenderRImp;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderSImpTest {

    private GenderRImp repository;
    private Gender course;

    private String id=null;


    private Gender getSaved(){
        return this.repository.getAll().iterator().next();}

    @Before
    public void setUp() throws Exception {
        this.repository =GenderRImp.getRepo();
        this.course = GenderFactory.getGender("Toy");
    }

    @Test
    public void getAll() {
        Set<Gender> courses = this.repository.getAll();
    }

    @Test
    public void create() {
        Gender created = this.repository.create(this.course);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.course);
    }

    @Test
    public void read() {
        Gender student = this.repository.read(id);
        assertEquals(student,student);
    }

}