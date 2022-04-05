package JavaCore2.module2.sprint6.theme8.task0804;

import java.util.List;
import java.util.Random;

public class FortuneCookieFactory {

    private final FortuneConfig fortuneConfig;
    private int cookiesBaked = 0;

    private final Random rnd = new Random();
    private final List<String> goodFortune;
    private final List<String> badFortune;

    public FortuneCookieFactory(FortuneConfig fortuneConfig, List<String> goodFortune, List<String> badFortune) {
        this.fortuneConfig = fortuneConfig;
        this.goodFortune = goodFortune;
        this.badFortune = badFortune;
    }

    /**
     * Возвращает количество испечённых печенек
     */
    public int getCookiesBaked() {
        return this.cookiesBaked;
    }

    /**
     * Обнуляет счётчик созданных печенек
     */
    public void resetCookiesCreated() {
        this.cookiesBaked = 0;
    }

    /**
     * Печёт печеньку!
     */
    public FortuneCookie bakeFortuneCookie() {
        final String fortune;

        // Возвращает хорошее или плохое предсказание
        if (this.fortuneConfig.isPositive()) {
            fortune = goodFortune.get(rnd.nextInt(goodFortune.size()));
        } else {
            fortune = badFortune.get(rnd.nextInt(badFortune.size()));
        }
        incrementNumberOfCookiesCreated();
        return new FortuneCookie(fortune);
    }

    /**
     * Увеличивает счётчик испечённых печенек
     */
    private void incrementNumberOfCookiesCreated() {
        this.cookiesBaked++;
    }
}