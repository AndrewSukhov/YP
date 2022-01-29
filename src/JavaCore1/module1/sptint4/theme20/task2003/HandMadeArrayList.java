package JavaCore1.module1.sptint4.theme20.task2003;

public class HandMadeArrayList<T> {

    private int size = 0;
    private Object[] elements;

    public HandMadeArrayList() {
        this.elements = new Object[10];
    }

    /**
     * Сначала проверяем, достиг ли размер массива вместимости.
     * Если достиг — увеличиваем вместимость, иначе сразу добавляем элемент
     */
    public void add(T newElement) {
        // Допишите проверку
        if (... == ...) {
            grow();
        }

				/* Допишите код, который добавит очередной элемент в массив
           и увеличит размер массива на единицу.*/
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Element with index " + index + " does not exist");
        }
        return (T) this.elements[index];
    }

    /**
     * Заменяем текущий массив элементов elements на новый с вместимостью +50%
     */
    private void grow() {
        // Новый массив
        Object[] newArray = new Object[elements.length + elements.length / 2];

        // Допишите цикл, который копирует все элементы из массива elements в новый массив newArray
        // Копируем элементы из старого массива в новый


        // Возвращаемый новый массив
        this.elements = newArray;
    }

    public static void main(String[] args) {
        final var ar = new HandMadeArrayList<Integer>();
        for (int i = 0; i < 2000; i++) {
            ar.add(i);
        }
        System.out.println(ar.size);
    }
}
/*
Попробуйте самостоятельно реализовать ArrayList<T>. Часть класса HandMadeArrayList уже написана.
Вам нужно дописать реализацию двух методов. Так, grow() должен отвечать за увеличение вместительности
массива на 50%, а add(T) добавлять очередной элемент в список.

Размер списка достигает своей вместимости, когда size == elements.length.
Добавить новый элемент и увеличить размер массива можно при помощи двух присваиваний:
elements[size] = newElement и size = size + 1.
Чтобы копировать элементы одно массива в другой можно использовать обычный цикл for —
for (int i = 0; i < elements.length; i++) {newArray[i] = elements[i];}.
 */