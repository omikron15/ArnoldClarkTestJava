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


}
