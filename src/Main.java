public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 13");
        System.out.println();

        Author jackLondon = new Author("Jack", "London");
        Author johnSteinbeck = new Author("John", "Steinbeck");

        Book loveOfLife = new Book("Love of Life", jackLondon, 1905);
        Book loveOfLife2 = new Book("Love of Life", jackLondon, 1907);

        Book theGrapesOfWrath = new Book("The Grapes of Wrath", johnSteinbeck, 1939);

        System.out.println("   Исходные объекты");
        System.out.println();

        System.out.println("            Книга 1");
        System.out.println("Автор: " + jackLondon.getName() + " " + jackLondon.getLastName());
        System.out.println("Наименование: " + loveOfLife.getName());
        System.out.println("Год издания: " + loveOfLife.getYearPublication());
        System.out.println();

        System.out.println("            Книга 2");
        System.out.println("Автор: " + johnSteinbeck.getName() + " " + johnSteinbeck.getLastName());
        System.out.println("Наименование: " + theGrapesOfWrath.getName());
        System.out.println("Год издания: " + theGrapesOfWrath.getYearPublication());
        System.out.println();

        System.out.println("            Книга 3");
        System.out.println("Автор: " + jackLondon.getName() + " " + jackLondon.getLastName());
        System.out.println("Наименование: " + loveOfLife2.getName());
        System.out.println("Год издания: " + loveOfLife2.getYearPublication());
        System.out.println();

        System.out.println("         Проверка 1a - класс Author - метод toString - автор 1");
        System.out.println(jackLondon);
        System.out.println();

        System.out.println("         Проверка 2a - класс Author - метод hashCode - автор 1");
        System.out.println(jackLondon.hashCode());
        System.out.println();

        System.out.println("         Проверка 3a - класс Author - метод toString - автор 2");
        System.out.println(johnSteinbeck);
        System.out.println();

        System.out.println("         Проверка 4a - класс Author - метод hashCode - автор 2");
        System.out.println(johnSteinbeck.hashCode());
        System.out.println();

        System.out.println("         Проверка 5a - класс Author - метод equals - сравнение авторов 1 и 2");
        System.out.println(jackLondon.equals(johnSteinbeck));
        System.out.println();

        System.out.println("         Проверка 6b - класс Book - метод toString - книга 1");
        System.out.println(loveOfLife);
        System.out.println();

        System.out.println("         Проверка 7b - класс Book - метод hashCode - книга 1");
        System.out.println(loveOfLife.hashCode());
        System.out.println();

        System.out.println("         Проверка 8b - класс Book - метод toString - книга 2");
        System.out.println(theGrapesOfWrath);
        System.out.println();

        System.out.println("         Проверка 9b - класс Book - метод hashCode - книга 2");
        System.out.println(theGrapesOfWrath.hashCode());
        System.out.println();

        System.out.println("         Проверка 10b - класс Book - метод equals - сравнение книг 1 и 2");
        System.out.println(loveOfLife.equals(theGrapesOfWrath));
        System.out.println();

        System.out.println("         Проверка 11b - класс Book - метод toString - книга 3");
        System.out.println(loveOfLife2);
        System.out.println();

        System.out.println("         Проверка 12b - класс Book - метод hashCode - книга 3");
        System.out.println(loveOfLife2.hashCode());
        System.out.println();

        System.out.println("         Проверка 13b - класс Book - метод equals - сравнение книг 1 и 3");
        System.out.println(loveOfLife.equals(loveOfLife2));

    }
}