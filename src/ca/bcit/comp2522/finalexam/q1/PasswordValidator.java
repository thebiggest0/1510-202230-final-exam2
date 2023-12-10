package ca.bcit.comp2522.finalexam.q1;

import java.util.ArrayList;

/**
 *   Class Password Validator
 *   Use the validatePassword method to validate Passwords
 */
public class PasswordValidator {

    /**
     *   validatePassword is a method that will validate
     *   the given password. It will return a list of all
     *   the problems found in the password according to
     *   this list:
     *    - must be at least 8 characters but not more than 25 characters
     *    - must start with a letter (upper or lowercase)
     *    - must contain lowercase letter
     *    - must contain uppercase letter
     *    - must contain a number OR a symbol !@#$%^&*()[]{},.<>?/\
     *    - must not contain a word from the dictionary list
     *    - must not contain a reversed word from the dictionary list
     *
     * @param aPassword This is the password as a String
     *        that will be validated
     *
     * @return An ArrayList with Strings for each problem
     *         found inside the password.
     *         Example if a password is otherwise ok, but doesn't
     *         have an uppercase and doesn't contain a number
     *         Return an empty list if completely valid
     *           NOTE: an empty list is not the same as null
     *
     */
    public static ArrayList<String> validatePassword(String aPassword) {
        return null;
    }


    /**
     *   Override the no parameter constructor and make
     *   private to prevent instantiating an object.
     *   Use the static validatePassword method instead.
     */
    private PasswordValidator() {

    }

}