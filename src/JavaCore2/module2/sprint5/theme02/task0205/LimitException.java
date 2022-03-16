package JavaCore2.module2.sprint5.theme02.task0205;

public class LimitException extends RuntimeException{
    int attempts;
    public LimitException(String s, int attempts) {
        super(s);
        this.attempts = attempts;
    }
    public String getDetailMessage() {
        return getMessage() + ": " + attempts;
    }
}

/*public class LimitException extends RuntimeException {
    int attempts;

    public LimitException (String message, int attempts) {
        super(message);
        this.attempts = attempts;
    }
}*/
