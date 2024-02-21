import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Country country1 = new Country("Kyrgyzstan",7000000,2800.33,"kurguz");
        Country country2 = new Country("Uzbekistan",3500000,5600.34,"uzbek");
        Country country3 = new Country("Kazakstan",40000000,6,"kazak");

        Country[] countries = new Country[]{country1,country2,country3};
        System.out.println(Country.method(countries));



    }
}