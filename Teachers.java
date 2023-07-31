package LabTwoPartOne;

    public class Teachers extends Persons {


        private Degree degree;
        private String speciality;

        public Teachers(String nameOfPerson, Sex sex, String nameOfDepartment, Degree degree, String speciality) {
            super(nameOfPerson, sex, nameOfDepartment);
            setDegree(degree);
            setSpeciality(speciality);
        }

        public Degree getDegree() {
            return degree;
        }

        public void setDegree(Degree degree) {
            this.degree = degree;
        }

        public String getSpeciality() {
            return speciality;
        }

        public void setSpeciality(String speciality) {
            this.speciality = speciality;
        }

        enum Degree {
            BS,
            MSc,
            PhD
        }

}
