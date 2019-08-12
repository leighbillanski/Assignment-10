package za.ac.cput.Domain;

public class EmpRaceGender {
    private Employee employee;
    private Race race;
    private Gender gender;

    public EmpRaceGender(){}

    private EmpRaceGender(Builder builder){
        this.employee = builder.employee;
        this.race = builder.race;
        this.gender = builder.gender;
    }

    public Employee getEmployee(){return employee;}

    public Race getRace() {
        return race;
    }

    public Gender getGender() {return gender;}



    public static class Builder{

        private Employee employee;
        private Race race;
        private Gender gender;

        public Builder employee(Employee emp) {
            this.employee = emp;
            return this;
        }

        public Builder race(Race race) {
            this.race = race;
            return this;
        }

        public Builder gender(Gender gender){
            this.gender = gender;
            return this;
        }

        public EmpRaceGender build() {
            return new EmpRaceGender(this);
        }

    }

    @Override
    public String toString() {
        return "Employee ID" + employee + '\'' +
                "Employee Name" + race + '\'' +
                "Employee Surname" + race;
    }

}
