package si.restmongodb.entity;


import java.util.List;

public class City {

    String name;
    String country;
    String timezone;
    int population;
    List<Integer> location;

    public City() {
    }

    public City(String name, String country, String timezone, int population, List<Integer> location) {
        this.name = name;
        this.country = country;
        this.timezone = timezone;
        this.population = population;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List<Integer> getLocation() {
        return location;
    }

    public void setLocation(List<Integer> location) {
        this.location = location;
    }
}
