public class PlanetAge {

//Method converts seconds in to earth years.

    public static double calculateDays(int seconds){
        double mins = seconds / 60;
        double hours = mins / 60;
        double days = hours/24;
        return days;
    }

    public static double earthAge(int seconds){
        double days = calculateDays(seconds);
        double years = days/365.25;
        return years;
    }

    public static double mercuryAge(int seconds){
        double days = calculateDays(seconds);
        double years = days/(0.2408467*365.25);
        return years;
    }

    public static double venusAge(int seconds){
        double days = calculateDays(seconds);
        double years = days/(0.61519726*365.25);
        return years;
    }

    public static double marsAge(int seconds){
        double days = calculateDays(seconds);
        double years = days/(1.8808158*365.25);
        return years;
    }

    public static double jupiterAge(int seconds){
        double days = calculateDays(seconds);
        double years = days/(11.862615*365.25);
        return years;
    }

    public static double saturnAge(int seconds){
        double days = calculateDays(seconds);
        double years = days/(29.447498*365.25);
        return years;
    }

    public static double uranusAge(int seconds){
        double days = calculateDays(seconds);
        double years = days/(84.016846*365.25);
        return years;
    }

    public static double neptuneAge(int seconds){
        double days = calculateDays(seconds);
        double years = days/(164.79132*365.25);
        return years;
    }

    public static double plutoAge(int seconds){
        double days = calculateDays(seconds);
        double years = days/(248.00*365.25);
        return years;
    }


}
