package com.example.gr1_dz4_3mesias_ulan_continenty_recyclerview_fragmenty;

public class Country {
    private String countryName;
    private String capitalName;
    private int countryFlag;

    public Country(String countryName, String capitalName, int countryFlag) {
        this.countryName = countryName;
        this.capitalName = capitalName;
        this.countryFlag = countryFlag;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public int getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(int countryFlag) {
        this.countryFlag = countryFlag;
    }


}