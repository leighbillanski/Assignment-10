package za.ac.cput.Factory;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Domain.Race;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getRace() {
        String name = "Coloured";
        Race company = RaceFactory.getRace(name);
        assertEquals("Coloured", company.getName());
    }
}