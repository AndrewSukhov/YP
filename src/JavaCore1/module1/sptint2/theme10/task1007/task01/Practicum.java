package JavaCore1.module1.sptint2.theme10.task1007.task01;

public class Practicum {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Mouse mouse = new Mouse();
        // инициализируйте все нужные объекты
        Cow cow = new Cow();
        Frog frog = new Frog();
        Elephant elephant = new Elephant();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Seal seal = new Seal();

        System.out.println("Dog goes " + dog.say());
        System.out.println("Cat goes " + cat.say());
        System.out.println("Bird goes " + bird.say());
        System.out.println("And mouse goes " + mouse.say());
        // вызовите переопределённые методы
        System.out.println("Cow goes " + cow.say());
        System.out.println("Frog goes " + frog.say());
        System.out.println("And the elephant goes " + elephant.say());
        System.out.println("Ducks say " + duck.say());
        System.out.println("And fish go " + fish.say());
        System.out.println("And the seal goes " + seal.say());
    }
}
/*
В 2013 году норвежский дуэт братьев Илвисокеров Ylvis выпустил на YouTube вирусный клип
“What Does the Fox Say?” (англ. «Что говорит лиса?») — к настоящему моменту его посмотрели более 1 млрд раз.
Сюжет песни посвящен тому, что отлично известно, как говорят многие животные:
собака — «гав», кошка — «мяу», корова — «му», а вот как говорит лиса — великая тайна.
Немного передохните — послушайте песенку, а потом с помощью наследования и переопределения методов запрограммируйте её первый куплет:

Dog goes woof
Cat goes meow
Bird goes tweet
And mouse goes squeek
Cow goes moo
Frog goes croak
And the elephant goes toot
Ducks say quack
And fish go blub
And the seal goes ow ow ow

Не забудьте использовать аннотацию @Override!

Нужно создать 10 подклассов от Animal с помощью ключевого слова extends.
Имена подклассов должны совпадать с названиями животных в единственном числе: Dog, Cat, Bird, Mouse и так далее.
Необходимо переопределить метод say() в каждом подклассе.
Перед переопределяемым методом нужно поставить аннотацию @Override.
При переопределении не нужно менять модификатор доступа и сигнатуру метода.
 */