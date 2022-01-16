package JavaCore1.module1.sptint3.theme16.task1607;

public class MortgageRequest {

    private final String name;
    private final byte age;
    private final int amount;
    private final boolean employed;

    public MortgageRequest(String name, byte age, int amount, boolean employed) {
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.employed = employed;
    }

    public void validate() {
        System.out.println("Проверка заявки...");

        boolean result = true;

        AgeValidationRule ageValidationRule = new AgeValidationRule(age);
        if (!ageValidationRule.isValid()) {
            result = false;
            System.out.println(ageValidationRule.getErrorMessage());
        }

        MortgageAmountValidationRule amountValidationRule = new MortgageAmountValidationRule(amount);
        if (!amountValidationRule.isValid()) {
            result = false;
            System.out.println(amountValidationRule.getErrorMessage());
        }

        EmploymentValidationRule employmentValidationRule = new EmploymentValidationRule(employed);
        if (!employmentValidationRule.isValid()) {
            result = false;
            System.out.println(employmentValidationRule.getErrorMessage());
        }

        if (result) {
            System.out.println(name + ", вам одобрена заявка на ипотеку!");
        } else {
            System.out.println(name + ", ваша заявка отклонена");
        }
    }
}
