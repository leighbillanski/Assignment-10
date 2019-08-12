package za.ac.cput.Repository.Imp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.Gender;
import za.ac.cput.Factory.GenderFactory;
import za.ac.cput.Repository.IGender;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRImpTest {

    private String id=null;

    private IGender comp;
    @Before
    public void setUp() throws Exception {
        this.comp = GenderRImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Gender> company = this.comp.getAll();
        Assert.assertEquals(1,company.size());
    }

    @Test
    public void create() {
        Gender student = GenderFactory.getGender("Female");
        Gender result = comp.create(student);
        id= result.getGenderId();
        Assert.assertNotNull(student);
    }

    @Test
    public void read() {
        Gender student = comp.read(id);
        Assert.assertNotNull(student);
    }}