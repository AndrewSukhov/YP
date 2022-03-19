package JavaCore2.module2.sprint5.theme02.task0207.validators;

import JavaCore2.module2.sprint5.theme02.task0207.exceptions.ValidateException;

public interface Validator {
    void validate(String value) throws ValidateException;
}
