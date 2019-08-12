package za.ac.cput.Repository.Imp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.Race;
import za.ac.cput.Factory.RaceFactory;
import za.ac.cput.Repository.IRace;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRImpTest {

    private String id=null;

    private IRace comp;
    @Before
    public void setUp() throws Exception {
        this.comp = RaceRImp.getRepo();
    }

    @Test
    public void getAll() {
        Set<Race> company = this.comp.getAll();
        Assert.assertEquals(1,company.size());
    }

    @Test
    public void create() {
        Race student = RaceFactory.getRace("Coloured");
        Race result = comp.create(student);
        id= result.getRaceId();
        Assert.assertNotNull(student);
    }

    @Test
    public void read() {
        Race student = comp.read(id);
        Assert.assertNotNull(student);
    }}