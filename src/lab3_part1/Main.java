package lab3_part1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Односвязный список");

        LinkedList list = new LinkedList();

        System.out.println("Добавление элементов в начало коллекции");

        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(10);
        list.addFirst(3);

        System.out.println(list.print());

        System.out.println("Добавление элементов в конец коллекции");
        list.addLast(6);
        list.addLast(2);
        list.addLast(0);

        System.out.println(list.print());

        System.out.println("Значение первого элемента " + list.getFirst());

        System.out.println("Значения последнего элемента " + list.getLast());

        System.out.println("Получение значения первого элемента и его последующее удаление: " + list.getRemoveFromStart());

        System.out.println(list.print());

        System.out.println("Получение значения последнего элемента и его последующее удаление: " + list.getRemoveFromEnd());

        System.out.println(list.print());

        System.out.println("Поиск значения 11:" + list.contains(11));

        System.out.println(list.print());

        System.out.println("Поиск значения 6:" + list.contains(6));

        System.out.println(list.print());

        System.out.println("Размер коллекции " + list.size());

        System.out.println(list.print());

        System.out.println("Удаление из коллекции первого элемента");

        list.removeFirst();

        System.out.println(list.print());

        System.out.println("Удаление из коллекции последнего элемента");

        list.removeLast();

        System.out.println(list.print());

    }
}
