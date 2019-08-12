package za.ac.cput.Factory;

import za.ac.cput.Domain.Gender;
import za.ac.cput.Util.Misc;

public class GenderFactory {
    public static Gender getGender(String gender) {
        return new Gender.Builder().genderId(Misc.generateId())
                .gender(gender)
                .build();
    }

}
