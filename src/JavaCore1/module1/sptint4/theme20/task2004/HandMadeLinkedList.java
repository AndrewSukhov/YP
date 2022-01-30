package JavaCore1.module1.sptint4.theme20.task2004;

import java.util.NoSuchElementException;

public class HandMadeLinkedList<T> {

    class Node<E> {
        public E data;
        public Node<E> next;
        public Node<E> prev;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }


    /**
     * Указатель на первый элемент списка. Он же first
     */
    private Node<T> head;

    /**
     * Указатель на последний элемент списка. Он же last
     */
    private Node<T> tail;

    private int size = 0;

    public void addFirst(T element) {
        final Node<T> oldHead = head;
        final Node<T> newNode = new Node<>(null, element, oldHead);
        head = newNode;
        if (oldHead == null)
            tail = newNode;
        else
            oldHead.prev = newNode;
        size++;
    }

    public T getFirst() {
        final Node<T> curHead = head;
        if (curHead == null)
            throw new NoSuchElementException();
        return head.data;
    }

    public void addLast(T element) {
        // Реализуйте метод
        final Node<T> oldTail = tail;
        final Node<T> newNode = new Node<>(oldTail, element, null);
        tail = newNode;
        if (oldTail == null)
            head = newNode;
        else
            oldTail.next = oldTail;
        size++;
    }

    public T getLast() {
        // Реализуйте метод
        final Node<T> curTail = tail;
        if (curTail == null)
            throw  new NoSuchElementException();
        return tail.data;
    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        HandMadeLinkedList<Integer> integers = new HandMadeLinkedList<>();

        integers.addFirst(1);
        integers.addFirst(2);
        integers.addFirst(3);
        integers.addLast(4);
        integers.addLast(5);

        System.out.println(integers.getFirst());
        System.out.println(integers.getLast());
    }
}
/*
В пиратской версии языка Java, которую скачал ваш коллега, забыли добавить класс LinkedList<T>!
Вам нужно реализовать его самостоятельно.
Часть кода уже представлена в классе HandMadeLinkedList<T>. Например здесь уже есть структура Node<T>,
представляющая один элемент в двусвязном списке, а также методы для добавления элемент в начало addFirst<T>,
взятия элемент из начала getFirst(), а также метод, возвращающий количество элементов в двусвязном списке size().
Реализуйте ещё два метода — добавление элемента а в конец addLast<T> и получение последнего элемента — getLast().

Метод getLast() является полной копией метода getFirst() с той лишь разницей,
что здесь работа идёт с хвостом tail, а не с головой head списка.
Двусвязные списки можно легко отобразить на бумаге в виде связанных блоков.
Нарисуйте, как меняются ссылки внутри двусвязного списка при выполнении метода addFirst(T).
Это поможет вам реализовать addLast(T).
Реализация метода addLast(T) состоит из нескольких шагов. Сначала запоминается ссылка на
хвост и создаётся новый элемент. Этот новый элемент не будет иметь следующего, но его предыдущим
будет текущий хвост. Таким образом новый элемент можно создать при помощи вызова конструктора
new Node<>(tail, element, null);.
После создания элемента, необходимо проверить, существовал ли раньше хвост списка.
Если да — предыдущий хвост начинает ссылаться на новый элемент oldTail.next = newNode.
Иначе, создаётся не только хвост, но и голова списка head = newNode.
 */
