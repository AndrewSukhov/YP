package JavaCore1.module1.sptint3.theme16.task1607;

// Дополните класс для проверки возраста пользователя
public class AgeValidationRule extends ValidationRule<Byte> {

    public AgeValidationRule(Byte age) {
        super(age, "Возраст для подачи на ипотеку должен быть старше 18 лет");
    }

    @Override
    public boolean isValid() {
        return value >= 18;
    }

}
