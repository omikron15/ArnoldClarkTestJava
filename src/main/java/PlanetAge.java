public class PlanetAge {

//Method converts seconds in to earth years.

    public static double calculateDays(long seconds){
        double mins = seconds / 60;
        double hours = mins / 60;
        double days = hours/24;
        return days;
    }

    public static double earthAge(long seconds){
        double days = calculateDays(seconds);
        double years = days/365.25;
        return years;
    }

    public static double mercuryAge(long seconds){
        double days = calculateDays(seconds);
        double years = days/(0.2408467*365.25);
        return years;
    }

    public static double venusAge(long seconds){
        double days = calculateDays(seconds);
        double years = days/(0.61519726*365.25);
        return years;
    }

    public static double marsAge(long seconds){
        double days = calculateDays(seconds);
        double years = days/(1.8808158*365.25);
        return years;
    }

    public static double jupiterAge(long seconds){
        double days = calculateDays(seconds);
        double years = days/(11.862615*365.25);
        return years;
    }

    public static double saturnAge(long seconds){
        double days = calculateDays(seconds);
        double years = days/(29.447498*365.25);
        return years;
    }

    public static double uranusAge(long seconds){
        double days = calculateDays(seconds);
        double years = days/(84.016846*365.25);
        return years;
    }

    public static double neptuneAge(long seconds){
        double days = calculateDays(seconds);
        double years = days/(164.79132*365.25);
        return years;
    }

    public static double plutoAge(long seconds){
        double days = calculateDays(seconds);
        double years = days/(248.00*365.25);
        return years;
    }


}
