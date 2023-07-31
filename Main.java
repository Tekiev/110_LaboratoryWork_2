package LabTwoPartOne;

public class Main {

    public static void main(String[] args) {

        Teachers [] teachers = new Teachers[] {

                new Teachers("Ronald Turner", Persons.Sex.M, "Computer science", Teachers.Degree.PhD, "Programming paradigms"),

                new Teachers("Ruth Hollings", Persons.Sex.F, "Jurisprudence", Teachers.Degree.MSc, "Domestic arbitration")};

        Students [] students = new Students[] {

                new Students("Leo Wilkinson", Persons.Sex.M, "Computer science", Students.Bolon.Bachelor, 3),

                new Students("Anna Cunningham", Persons.Sex.F, "World economy", Students.Bolon.Bachelor, 1),

                new Students("Jill Lundqvist", Persons.Sex.F, "Jurisprudence", Students.Bolon.Master, 1),

                new Students("Ronald Correra", Persons.Sex.M, "Computer science", "Design of a functional programming language")};

        printAll(teachers);

        printAll(students);

    }

    public static void print (Teachers person) {

        System.out.println

                ("This is " + person.getName() + "." + ((person.getSex() == Persons.Sex.M) ? " He" : " She") + " teaches" + " at " + person.getNameOfDepartment() + "\n" +

                        ((person.getSex() == Persons.Sex.M) ? "He" : "She") + " has " + person.getDegree() + " degree in " + person.getSpeciality() + "." + "\n");

    }

    public static void print (Students person) {

        System.out.println

                ("This is " + person.getName() + "." + ((person.getSex() == Persons.Sex.M) ? " He" : " She") + " studies" + " at " + person.getNameOfDepartment() + "\n" +

                        ((person.getBolon() != null) ?  ((person.getSex() == Persons.Sex.M) ? "He" : "She") + " is " + person.getNumberOfCourse() + "'th year " + person.getBolon() + " student." :

                                ((person.getSex() == Persons.Sex.M) ? "His" : "Her") + " thesis title is " + person.getThemeOfDissertation()) + "\n");

    }

    public static void printAll (Teachers [] teachers) {

        for (Teachers  teacher: teachers) {

            print(teacher);

        }

    }

    public static void printAll (Students [] students) {

        for (Students  student: students) {

            print(student);

        }

    }
}
