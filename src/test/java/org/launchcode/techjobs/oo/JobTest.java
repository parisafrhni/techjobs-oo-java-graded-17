//JobTest
package org.launchcode.techjobs.oo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here


    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertTrue(true);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(job1.equals(job2));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Employer employer = new Employer("ACME");
        Job job = new Job("Product tester", employer, new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String result = job.toString();

        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();

        assertEquals(expected, result);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Employer employer = new Employer("ACME");
        Job job = new Job("Product tester", employer, new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String result = job.toString();
        assertTrue(result.startsWith(System.lineSeparator()));
        assertTrue(result.endsWith(System.lineSeparator()));
    }
    @Test
    public void testToStringHandlesEmptyField() {

        Job job = new Job();
        String jobString = job.toString();

        System.out.println(jobString);

        assertTrue(jobString.contains("Name: Data not available"));
        assertTrue(jobString.contains("Employer: Data not available"));
        assertTrue(jobString.contains("Location: Data not available"));
        assertTrue(jobString.contains("Position Type: Data not available"));
        assertTrue(jobString.contains("Core Competency: Data not available"));
    }
}





