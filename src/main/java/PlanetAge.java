public class PlanetAge {

//Method converts seconds in to earth years.
    public static int earthAge(int seconds){
        double mins = seconds / 60;
        double hours = mins / 60;
        double days = hours/24;
        double years = days/365.25;

        int result = (int) years;

        return result;
    }

    public static int mercuryAge(int seconds){
        double mins = seconds / 60;
        double hours = mins / 60;
        double days = hours/24;
        double years = days/88;

        int result = (int) years;

        return result;

    }


}
