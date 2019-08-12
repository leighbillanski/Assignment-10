package za.ac.cput.Domain;

public class Race {
    private String raceId;
    private String race;

    public Race(Builder builder){
        this.race = builder.race;
    }


    public String getRaceId(){return raceId;}

    public String getName() {
        return race;
    }



    public static class Builder{

        private String raceId;
        private String race;

        public Builder race(String race) {
            this.race = race;
            return this;
        }


        public Builder raceId(String raceId){
            this.raceId = raceId;
            return this;
        }

        public Race build() {
            return new Race(this);
        }

    }

    @Override
    public String toString() {
        return "Race ID" + raceId + '\'' +
                "Race" + race;
    }

}

