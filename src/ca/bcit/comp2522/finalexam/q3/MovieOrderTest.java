package ca.bcit.comp2522.finalexam.q3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class MovieOrderTest {

    private static final String TEST_VERSION = "V1.1";


    @BeforeEach
    public void setUp() throws Exception {
    }


    @AfterEach
    public void tearDown() throws Exception {
    }


    @Test
    public void testBadGroupTooYoung() {
        MovieOrder order = new MovieOrder(MovieOrder.DayOfWeek.FRIDAY);
        order.addPerson(new Person(10));
        order.addPerson(new Person(8));

        Exception exception = assertThrows(StrayChildrenException.class, () -> {
                    order.calculatePrice();
                }
        );
    }

}
