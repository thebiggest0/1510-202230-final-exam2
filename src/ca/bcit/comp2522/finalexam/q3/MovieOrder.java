package ca.bcit.comp2522.finalexam.q3;

import java.util.HashSet;

public class MovieOrder {

    public enum DayType {
        NORMAL,
        DISOUNT
    }
    public enum DayOfWeek {
        MONDAY (DayType.NORMAL),
        TUESDAY (DayType.DISOUNT),
        WEDNESDAY (DayType.DISOUNT),
        THURSDAY (DayType.DISOUNT),
        FRIDAY (DayType.NORMAL),
        SATURDAY (DayType.NORMAL),
        SUNDAY (DayType.NORMAL);

        private DayType type;
        private DayOfWeek(DayType aType) {
            type = aType;
        }
        public boolean isDiscount() {
            return type == DayType.DISOUNT;
        }
    }

    private HashSet<Person> people;
    private HashSet<Coupon> coupons;
    private DayOfWeek day;

    public MovieOrder(DayOfWeek aDay) {
        people = new HashSet<>();
        coupons = new HashSet<>();
        day = day;
    }

    public void addCoupon(Coupon aCoupon) {
        coupons.add(aCoupon);
    }

    public void addPerson(Person aPerson) {
        people.add(aPerson);
    }

    public double calculatePrice() throws StrayChildrenException {
        double total = 0;
        boolean wildChildren = true;
        boolean isFamily = false;

        if (wildChildren) {
            throw new StrayChildrenException("Call Social Services!");
        }
        if (isFamily) {
            return MoviePrice.FAMILY_PRICE;
        }

        return total;
    }
}
