package geekbrains.lesson_5;
/** Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 *  Конструктор класса должен заполнять эти поля при создании объекта;
 * * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * * Создать массив из 5 сотрудников
 * * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;

 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Homework Lesson 5");
        Employee[] employeeArr = new Employee[5];// создаю массив сотрудников на 5 значений
        employeeArr[0] = new Employee("Lopatko Nikolay", "CEO", "n.lopatko@lopat.net", "+79312440790", 500000, 29);
        employeeArr[1] = new Employee("Karpin Alexey", "CTO", "a.karpin@lopat.net", "+79312440791", 500000, 31);
        employeeArr[2] = new Employee("Tetenkin Alexander", "CFO", "a.tetenkin@lopat.net", "+79312440792", 400000, 28);
        employeeArr[3] = new Employee("Zhmoida Anton", "Senior Developer", "a.zhmoida@lopat.net", "+79312440793", 250000, 41);
        employeeArr[4] = new Employee("Fomin Daniil", "Key Account Manager", "d.fomin@lopat.net", "+79312440794", 200000, 44);
        for (int i = 0; i < employeeArr.length; i++){//создаю переменную увеличивающуюся до длинны массива, в каждом значении которой будем сравнивать возраст
            if (employeeArr[i].getAge() > 40) employeeArr[i].showEmployeeInfo();//если значение геттера выше 40ка, запускаем метод вывода инфо на данного сотрудника.
        }

    }
}

