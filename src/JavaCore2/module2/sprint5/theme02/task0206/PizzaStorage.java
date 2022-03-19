package JavaCore2.module2.sprint5.theme02.task0206;

public class PizzaStorage {
    private final int maxVolume;
    private int pizzaCount = 0;

    public PizzaStorage(final int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int addPizza(final int count) throws TooMuchPizzaException{
        if (pizzaCount + count > maxVolume) {
            throw new TooMuchPizzaException();
        }
        pizzaCount += count;
        return pizzaCount;
    }

    public int takePizza(final int count) throws NotEnoughPizzaException{
        if (pizzaCount - count < 0) {
            throw new NotEnoughPizzaException();
        }
        pizzaCount -= count;
        return pizzaCount;
    }

    public int getPizzaCount() {
        return pizzaCount;
    }
}