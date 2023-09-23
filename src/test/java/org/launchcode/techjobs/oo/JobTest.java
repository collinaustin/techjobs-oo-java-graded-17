package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId() {

        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        String msg = "each Job object should include job name, employer, " +
                "location, positionType, and coreCompetency. each field a unique class";

        Job productTester = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(msg, "Product tester",  productTester.getName());
        assertTrue(msg, productTester.getName() instanceof String);

        assertEquals(msg, "ACME",  productTester.getEmployer().getValue());
        assertTrue(msg, productTester.getEmployer() instanceof Employer);

        assertEquals(msg, "Desert",  productTester.getLocation().getValue());
        assertTrue(msg, productTester.getLocation() instanceof Location);

        assertEquals(msg, "Quality control",  productTester.getPositionType().getValue());
        assertTrue(msg, productTester.getPositionType() instanceof PositionType);

        assertEquals(msg, "Persistence",  productTester.getCoreCompetency().getValue());
        assertTrue(msg, productTester.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {

        String msg = ("Two job objects are NOT equal if their id values differ, " +
                "even if all other fields are the same.");
        Job badJob = new Job("game tester", new Employer("Microsoft"), new Location("Washington"), new PositionType("Tester"), new CoreCompetency("Xbox/PC"));
        Job goodJob = new Job("game tester", new Employer("Microsoft"), new Location("Washington"), new PositionType("Tester"), new CoreCompetency("Xbox/PC"));

        assertFalse(msg, badJob.equals(goodJob));
    }
}
