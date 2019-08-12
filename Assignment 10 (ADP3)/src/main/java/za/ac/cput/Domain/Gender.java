package za.ac.cput.Domain;

public class Gender {
    private String genderId;
    private String gender;

    public Gender(Builder builder){
        this.gender = builder.gender;
    }


    public String getGenderId(){return genderId;}

    public String getName() {
        return gender;
    }



    public static class Builder{

        private String genderId;
        private String gender;

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }


        public Builder genderId(String genderId){
            this.genderId = genderId;
            return this;
        }

        public Gender build() {
            return new Gender(this);
        }

    }

    @Override
    public String toString() {
        return "Gender ID" + genderId + '\'' +
                "Gender" + gender;
    }

}

