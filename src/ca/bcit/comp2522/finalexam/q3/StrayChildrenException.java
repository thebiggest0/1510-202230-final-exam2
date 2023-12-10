package ca.bcit.comp2522.finalexam.q3;

public class StrayChildrenException extends Exception {
    private String message;

    public StrayChildrenException(String aMessage) {
        message = aMessage;
    }
}
