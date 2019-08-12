package za.ac.cput.Service.Imp;

import za.ac.cput.Domain.Race;
import za.ac.cput.Service.IRace;

import java.util.Set;

public class RaceSImp implements IRace {
    private za.ac.cput.Repository.IRace repository;

    private static final RaceSImp raceS = new RaceSImp();
    RaceSImp(){}

    public static RaceSImp getService() {
        return raceS;
    }

    @Override
    public Set<Race> getAll() {
        return repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return repository.create(race);
    }

    @Override
    public Race read(String s) {
        return repository.read(s);
    }
}
