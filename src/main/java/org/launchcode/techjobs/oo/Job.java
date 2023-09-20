//Job
package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this(); // Call the first constructor to initialize ID
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
/*
    @Override
    public String toString() {
        String idString = "ID: " + this.getId();
        String nameString = "Name: " + (this.getName().isEmpty() ? "Data not available" : this.getName());
        String employerString = "Employer: " + (this.getEmployer().getValue().isEmpty() ? "Data not available" : this.getEmployer().getValue());
        String locationString = "Location: " + (this.getLocation().getValue().isEmpty() ? "Data not available" : this.getLocation().getValue());
        String positionTypeString = "Position Type: " + (this.getPositionType().getValue().isEmpty() ? "Data not available" : this.getPositionType().getValue());
        String coreCompetencyString = "Core Competency: " + (this.getCoreCompetency().getValue().isEmpty() ? "Data not available" : this.getCoreCompetency().getValue());

        return System.lineSeparator() +
                idString + System.lineSeparator() +
                nameString + System.lineSeparator() +
                employerString + System.lineSeparator() +
                locationString + System.lineSeparator() +
                positionTypeString + System.lineSeparator() +
                coreCompetencyString + System.lineSeparator();
    }

 */
        @Override
        public String toString() {
            String idString = "ID: " + this.getId();
            String nameString = "Name: " + (this.getName() != null ? (this.getName().isEmpty() ? "Data not available" : this.getName()) : "Data not available");
            String employerString = "Employer: " + (this.getEmployer() != null && this.getEmployer().getValue() != null ? (this.getEmployer().getValue().isEmpty() ? "Data not available" : this.getEmployer().getValue()) : "Data not available");
            String locationString = "Location: " + (this.getLocation() != null && this.getLocation().getValue() != null ? (this.getLocation().getValue().isEmpty() ? "Data not available" : this.getLocation().getValue()) : "Data not available");
            String positionTypeString = "Position Type: " + (this.getPositionType() != null && this.getPositionType().getValue() != null ? (this.getPositionType().getValue().isEmpty() ? "Data not available" : this.getPositionType().getValue()) : "Data not available");
            String coreCompetencyString = "Core Competency: " + (this.getCoreCompetency() != null && this.getCoreCompetency().getValue() != null ? (this.getCoreCompetency().getValue().isEmpty() ? "Data not available" : this.getCoreCompetency().getValue()) : "Data not available");

            return System.lineSeparator() +
                    idString + System.lineSeparator() +
                    nameString + System.lineSeparator() +
                    employerString + System.lineSeparator() +
                    locationString + System.lineSeparator() +
                    positionTypeString + System.lineSeparator() +
                    coreCompetencyString + System.lineSeparator();
        }



}
