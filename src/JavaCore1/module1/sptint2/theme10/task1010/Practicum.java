package JavaCore1.module1.sptint2.theme10.task1010;

class Animal {
    private double weight;
    private int age;

    public Animal() {
        this.weight = 0.0d;
        this.age = 0;
    }

    public String say() {
        return "Мяу, гав, хрю, кря!";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}

class Fox extends Animal {
    private String color;

    public Fox(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

// научите лису говорить
}

public class Practicum {
    public static void main(String[] args) {
        Fox fox = new Fox("рыжий");
        fox.setWeight(5.93d);
        fox.setAge(5);
        System.out.println("Вес лисы - " + fox.getWeight());
        System.out.println("Возраст лисы - " + fox.getAge());
        System.out.println("Цвет лисы - " + fox.getColor());
        System.out.println("Лиса говорит - " + fox.say());
    }
}
/*
Теперь вы знаете о волшебной кнопке автогенерации! Этот инструмент позволит вам сократить время на рутинную работу вроде написания
конструкторов или get- и set-методов и даст возможность сконцентрироваться на творческих задачах.
Чтобы выполнить этот квиз, скопируйте код ниже в среду разработки IDEA. Добавьте в него всё что нужно, чтобы программа заработала.
Используйте комбинацию alt+Insert или команду Generate.... У вас также есть уникальная возможность научить лису говорить так,
как считаете нужным.
 */