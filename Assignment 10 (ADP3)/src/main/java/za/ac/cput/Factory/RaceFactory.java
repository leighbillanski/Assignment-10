package za.ac.cput.Factory;

import za.ac.cput.Domain.Race;
import za.ac.cput.Util.Misc;

public class RaceFactory {
    public static Race getRace(String race) {
        return new Race.Builder().raceId(Misc.generateId())
                .race(race)
                .build();
    }

}
