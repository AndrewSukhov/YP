package JavaCore2.module2.sprint6.theme8.task0804;

public class FortuneCookieController {

    private final FortuneCookieFactory fortuneCookieFactory;

    public FortuneCookieController(FortuneCookieFactory fortuneCookieFactory) {
        this.fortuneCookieFactory = fortuneCookieFactory;
    }

    public FortuneCookie tellFortune() {
        return this.fortuneCookieFactory.bakeFortuneCookie();
    }
}
/*
Фабрика по производству печенек с предсказаниями развивается.
Старый сложный класс разбили на несколько классов, чтобы каждый
из них можно было проще понять и протестировать. Основой нового
приложения является класс FortuneСookieController. Он принимает
запросы от пользователей и выдаёт печеньки FortuneCookie.
Печеньки пекутся в FortuneCookieFactory, которая также принимает
параметр конфигурации FortuneConfig. Через класс-конфигурацию
предполагается в будущем передать все параметры фабрики, но пока
это только флаг, указывающий на тип предсказаний — позитивные или негативные.
Вам нужно написать всего пять тестов.
Два на FortuneСookieController и ещё три на FortuneCookieFactory.
FortuneCookieControllerTest:

shouldReturnPositiveFortune должен проверять, что фабрика может испечь печеньку с хорошим предсказанием.
shouldReturnNegativeFortune проверит, что фабрика также умеет печь печеньки с негативными предсказаниями.

FortuneCookieFactoryTest:

shouldIncrementCountByOneAfterOneCookieBaked проверит,
что счётчик печенек в фабрике увеличивается на единицу
после одной испечённой печеньки.
shouldIncrementCountByTwoAfterTwoCookiesBaked проверит,
что после двух испечённых печенек счёт увеличится на два.
shouldSetCounterToZeroAfterResetCookieCreatedCall проверит,
что после вызова resetCookiesCreated счётчик станет равным нулю.


    Если нужно выполнить код до запуска всех тестов, пометьте статический метод тестового класса аннотацией @BeforeAll. Чтобы выполнить метод перед запуском каждого теста, поставьте над ним @BeforeEach.
    FortuneCookieFactory в обоих тестах можно создавать одинаково, например:
    java
      new FortuneCookieFactory(
                      config,
                      singletonList("positive"),
                      singletonList("negative")
      )

    В тестовом классе FortuneCookieControllerTest воспользуйтесь аннотацией @BeforeAll,
    чтобы создать сразу все контроллеры: контроллер для фабрики с позитивными предсказаниями
    goodFactoryController и для фабрики с негативными — badFactoryController.
    Создание экземпляра FortuneCookieController можно обернуть в метод create(boolean isPositive).
    Аргумент isPositive можно передавать в вызов конструктора FortuneConfig.
    В методе shouldReturnPositiveFortune вызовите метод предсказания у «позитивной» фабрики и
    проверьте, что следующее предсказание с текстом positive.
    В методе shouldReturnNegativeFortune вызовите метод предсказания у «негативной» фабрики и
    проверьте, что следующее предсказание с текстом negative.
    В тесте FortuneCookieFactoryTest воспользуйтесь аннотацией @BeforeEach, чтобы перед каждым
    тестом создавалась новая фабрика.
    В тесте shouldIncrementCountByOneAfterOneCookieBaked испеките одну печеньку и проверьте,
    что количество печенек соответствует 1.
    В тесте shouldIncrementCountByTwoAfterTwoCookiesBaked испеките две печеньки и проверьте,
    что количество печенек соответствует 2.
    В тесте shouldSetCounterToZeroAfterResetCookieCreatedCall испеките одну печеньку,
    проверьте, что количество печенек соответствует 1. После чего сбросьте счётчик и
    проверьте количество снова — теперь оно должно быть равно 0.

 */
