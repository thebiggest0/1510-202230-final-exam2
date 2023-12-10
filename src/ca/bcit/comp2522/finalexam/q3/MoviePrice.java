package ca.bcit.comp2522.finalexam.q3;

public class MoviePrice {

    public static final double INFANT_PRICE     = 0;
    public static final double CHILD_PRICE      = 8.00;
    public static final double YOUTH_PRICE      = 13.00;
    public static final double STUDENT_PRICE    = 12.50;
    public static final double SENIOR_PRICE     = 10.00;
    public static final double ADULT_PRICE      = 22.00;

    public static final double FAMILY_PRICE     = 50.00;

    public static double getPrice(Person person) {
        double price = 0.0;
        if (person.isInfant()) {
            price = INFANT_PRICE;
        }
        if (person.isSenior()) {
            price = SENIOR_PRICE;
        }
        if (person.isAdult()) {
            price = ADULT_PRICE;
        }
        return price;
    }
}
