package za.ac.cput.Domain;

public class Employee {

        private String employeeId;
        private String name;
        private String sname;

        public Employee(){}

        private Employee(Builder builder){
            this.name = builder.name;
            this.sname = builder.sname;
        }

        public String getEmployeeId(){return employeeId;}

        public String getName() {
            return name;
        }

        public String getSname() {return sname;}



        public static class Builder{

            private String employeeId;
            private String name;
            private String sname;

            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Builder Sname(String sname) {
                this.sname = sname;
                return this;
            }

            public Builder employeeId(String companyId){
                this.employeeId = companyId;
                return this;
            }

            public Employee build() {
                return new Employee(this);
            }

        }

        @Override
        public String toString() {
            return "Employee ID" + employeeId + '\'' +
                    "Employee Name" + name + '\'' +
                    "Employee Surname" + sname;
        }

    }

