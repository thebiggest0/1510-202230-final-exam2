package ca.bcit.comp2522.finalexam.q1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit tests for PasswordValidator
 *
 */
public class PasswordValidatorTest {

    private static final String TEST_VERSION = "V1.1";

    private final ArrayList<String> EMPTY_LIST = new ArrayList<>();

    @Test
    public void testGoodPassword() {
        ArrayList<String> passwordErrors = PasswordValidator.validatePassword("A12$9999");
        assertEquals(EMPTY_LIST, passwordErrors);
    }
}