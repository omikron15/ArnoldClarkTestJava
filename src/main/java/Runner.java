import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );
        System.out.println("Please enter your age in seconds:");
        long seconds = (input.nextLong());

        System.out.println("Your age on Earth in years is:" + PlanetAge.earthAge(seconds));
        System.out.println("Your age on Mercury in years is:" + PlanetAge.mercuryAge(seconds));
        System.out.println("Your age on Venus in years is:" + PlanetAge.venusAge(seconds));
        System.out.println("Your age on Mars in years is:" + PlanetAge.marsAge(seconds));
        System.out.println("Your age on Jupiter in years is:" + PlanetAge.jupiterAge(seconds));
        System.out.println("Your age on Saturn in years is:" + PlanetAge.saturnAge(seconds));
        System.out.println("Your age on Uranus in years is:" + PlanetAge.uranusAge(seconds));
        System.out.println("Your age on Neptune in years is:" + PlanetAge.neptuneAge(seconds));
        System.out.println("Your age on Pluto in years is:" + PlanetAge.plutoAge(seconds));

    }


}
