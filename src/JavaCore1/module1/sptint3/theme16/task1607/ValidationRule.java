package JavaCore1.module1.sptint3.theme16.task1607;

// Дополните базовый класс для всех правил валидации
public abstract class ValidationRule {
    protected final ... value;
    private final String errorMessage;

    protected ValidationRule(... value, String errorMessage) {
        this.value = value;
        this.errorMessage = errorMessage;
    }

    public abstract boolean isValid();

    public String getErrorMessage() {
        return errorMessage;
    }
}
