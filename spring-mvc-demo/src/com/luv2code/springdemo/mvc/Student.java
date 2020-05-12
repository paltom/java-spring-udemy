package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
    
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favoriteLanguage;
    private String[] operatingSystems;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "France");
        countryOptions.put("DE", "Germany");
        countryOptions.put("IN", "India");
        countryOptions.put("US", "USA");
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return String return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }


    /**
     * @return LinkedHashMap<String, String> return the countryOptions
     */
    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }


    /**
     * @param countryOptions the countryOptions to set
     */
    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    /**
     * @return String return the favoriteLanguage
     */
    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    /**
     * @param favoriteLanguage the favoriteLanguage to set
     */
    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }


    /**
     * @return String[] return the operatingSystems
     */
    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    /**
     * @param operatingSystems the operatingSystems to set
     */
    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

}
