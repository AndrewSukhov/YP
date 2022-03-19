package JavaCore2.module2.sprint5.theme02.task0207.validators;

import JavaCore2.module2.sprint5.theme02.task0207.exceptions.ValidateException;
import JavaCore2.module2.sprint5.theme02.task0207.exceptions.ValidateNameException;

public class NameValidator implements Validator {
    @Override
    public void validate(String value) throws ValidateException {
        if (value.isEmpty()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
}