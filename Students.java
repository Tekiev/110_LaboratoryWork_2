package LabTwoPartOne;

public class Students extends Persons {

    private Bolon bolon;

    private int numberOfCourse;

    private String themeOfDissertation;

    public Students(String nameOfPerson, Sex sex, String nameOfDepartment, Bolon bolon, int numberOfCourse) {
        super(nameOfPerson, sex, nameOfDepartment);
        setBolon(bolon);
        setNumberOfCourse(numberOfCourse);
    }

    public Students(String nameOfPerson, Sex sex, String nameOfDepartment, String themeOfDissertation) {
        super(nameOfPerson, sex, nameOfDepartment);
        setThemeOfDissertation(themeOfDissertation);
    }

    public Bolon getBolon() {
        return bolon;
    }

    public void setBolon(Bolon bolon) {
        this.bolon = bolon;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public void setNumberOfCourse(int numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public String getThemeOfDissertation() {
        return themeOfDissertation;
    }

    public void setThemeOfDissertation(String themeOfDissertation) {
        this.themeOfDissertation = themeOfDissertation;
    }

    enum Bolon {
        Bachelor,
        Master
    }

}
