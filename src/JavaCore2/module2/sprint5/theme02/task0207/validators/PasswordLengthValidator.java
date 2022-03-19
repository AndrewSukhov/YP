package JavaCore2.module2.sprint5.theme02.task0207.validators;

import JavaCore2.module2.sprint5.theme02.task0207.exceptions.ValidateException;
import JavaCore2.module2.sprint5.theme02.task0207.exceptions.ValidatePasswordException;

public class PasswordLengthValidator implements Validator {
    private final int minLength;

    public PasswordLengthValidator(final int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(final String password) throws ValidateException {
        if (password == null || password.length() < minLength) {
            throw new ValidatePasswordException(
                    String.format("Пароль должен быть больше %d символов", minLength)
            );
        }
    }
}