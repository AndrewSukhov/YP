package JavaCore1.module1.sptint3.theme16.task1607;

// Дополните класс для проверки трудоустроенности пользователя
public class EmploymentValidationRule extends ValidationRule<Boolean> {

    public EmploymentValidationRule(Boolean value) {
        super(value, "Ипотека выдается только трудоустроенным");
    }

    @Override
    public boolean isValid() {
        return value;
    }
}
