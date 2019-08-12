package za.ac.cput.Repository.Imp;

import za.ac.cput.Domain.Race;
import za.ac.cput.Repository.IRace;

import java.util.*;

public class RaceRImp implements IRace {

    private  static RaceRImp repo = null;
    private Map<String,Race> emp;

    private RaceRImp() {this.emp = new HashMap<>();}

    public static  RaceRImp getRepo() {
        if(repo == null) {
            repo = new RaceRImp();
        }
        return repo;
    }

    @Override
    public Set<Race> getAll() {
        Collection<Race> races = this.emp.values();
        Set<Race> set = new HashSet<>();
        set.addAll(races);
        return set;
    }

    @Override
    public Race create(Race race) {
        this.emp.put(race.getRaceId(),race);
        return race;
    }

    @Override
    public Race read(String s) {
        return this.emp.get(s);
    }
}
