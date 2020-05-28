package geekbrains.lesson_5;

/** Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 *  Конструктор класса должен заполнять эти поля при создании объекта;
 * * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * * Создать массив из 5 сотрудников
 * * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 * while age > 40
 * sout
 * else return
 */
public class Employee {//создаю класс с полями по заданию
    String name;
    String position;
    String email;
    String cell;
    Double salary;
    int age;
    //создаю конструктор
    public Employee(String name, String position, String email, String cell, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.cell = cell;
        this.salary = salary;
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void showEmployeeInfo(){//создаю метод который выводит информацию о сотруднике в консоль
        System.out.println("name: " + name + "; position: " + position + "; email: " + email + "; cell: " + cell + "; salary: " + salary + " Rub.; age: " + age);
    }

}

