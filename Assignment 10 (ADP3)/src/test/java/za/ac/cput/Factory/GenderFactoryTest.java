package za.ac.cput.Factory;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.Gender;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getGender() {
        String name = "Female";
        Gender company = GenderFactory.getGender(name);
        assertEquals("Female", company.getName());
    }
}