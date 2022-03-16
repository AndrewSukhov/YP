package JavaCore2.module2.sprint5.theme02.task0205;

public class InputException extends Exception {

    public InputException(final String message) {
        super(message);
    }

    public String getDetailMessage() {
        return getMessage();
    }
}

/*public class InputException extends Exception {
    public InputException(String message) {
        super(message);
    }
}*/
