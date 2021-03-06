package ua.spring.firstexperience;

import java.util.LinkedHashMap;

public class Developer {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String gender;
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill( String skill ) {
        this.skill = skill;
    }

    public String getGender() {
        return gender;
    }

    public void setGender( String gender ) {
        this.gender = gender;
    }

    public Developer() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("UA", "Ukraine");
        countryOptions.put("IT", "Italy");
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("CA", "Canada");
        countryOptions.put("JP", "Japan");
        countryOptions.put("NG", "Nigeria");
        countryOptions.put("DE", "Germany");
        countryOptions.put("GR", "Greece");
        countryOptions.put("US", "USA");
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry( String country ) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }
}
