import java.util.*;

class Person {
    public String name;
    public String surname;
    public int yearBirthday;

    Person(String name, String surname, int yearBirthday){
        this.name = name;
        this.surname = surname;
        this.yearBirthday = yearBirthday;
    }

    public void printPerson(){
        System.out.printf("Имя: %s\nФамилия: %s\nГод рождения: %d\n\n", name, surname, yearBirthday);
    }

    public void printAction(Car car, Book book){
        System.out.printf("%s читает книгу \"%s\" про машину %s\n\n", name, book.name, car.mark);
    }
}

class Car{
    public String mark;
    public int yearRealese;
    public double engineVolume;

    Car(String mark, int yearRealese, double engineVolume){
        this.mark = mark;
        this.yearRealese = yearRealese;
        this.engineVolume = engineVolume;
    }

    public void printCar(){
        System.out.printf("Марка: %s\nГод выпуска: %s\nОбъём двигателя: %d\n\n", mark, yearRealese, engineVolume);
    }
}

class Book{
    public String name;
    public String author;
    public int yearRealese;

    Book(String name, String author, int yearRealese){
        this.name = name;
        this.author = author;
        this.yearRealese = yearRealese;
    }

    public void printBook(){
        System.out.printf("Название: %s\nАвтор: %s\nГод выпуска: %d\n\n", name, author, yearRealese);
    }
}

class Program{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person Pasha = new Person("Паша", "Парвадов", 2008);
        Car LadaKalina = new Car("Лада Калина", 2007, 1.6);
        Book book = new Book("Добро пожаловать в класс превосходства", "Сёгоки Носаги", 2003);

        Pasha.printAction(LadaKalina, book);
    }
}
