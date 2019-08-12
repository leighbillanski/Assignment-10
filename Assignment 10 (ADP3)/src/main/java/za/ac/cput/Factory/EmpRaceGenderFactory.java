package za.ac.cput.Factory;

import za.ac.cput.Domain.EmpRaceGender;
import za.ac.cput.Domain.Employee;
import za.ac.cput.Domain.Gender;
import za.ac.cput.Domain.Race;
import za.ac.cput.Util.Misc;

public class EmpRaceGenderFactory {
    public static EmpRaceGender getEmployee(Employee employee, Race race, Gender gender) {
        return new EmpRaceGender.Builder().employee(employee)
                .race(race)
                .gender(gender)
                .build();
    }
}
