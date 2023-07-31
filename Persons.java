package LabTwoPartOne;

public class Persons {

    private String name;

    private Sex sex;

    private String nameOfDepartment;

    public Persons(String name, Sex sex, String nameOfDepartment) {

        setName(name);
        setSex(sex);
        setNameOfDepartment(nameOfDepartment);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepartment) {
        this.nameOfDepartment = nameOfDepartment;
    }

    enum Sex {
        M,
        F
    }

}
