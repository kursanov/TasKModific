

public class Country {

    private String name;

    private int population;

    private double square;

    private  String language;

    public Country(String name, int population, double square, String language) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.language = language;
    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static Country method(Country[] countries){
        Country country = countries[0];
        for (int i = 0; i < countries.length; i++) {
            for (int i1 = i+1; i1 < countries.length; i1++) {
                if(countries[i].square < countries[i1].square){
                    country= countries[i1];
                }
            }
        }
        return country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", square=" + square +
                ", language='" + language + '\'' +
                '}';
    }
}
