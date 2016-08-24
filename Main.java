package geekbrains.java_1.lesson_4_homework;

/**
 * Created by User on 024 24.08.16.
 */
public class Main {
    public static void main(String[] args) {

        //Создаем сотрудников, используя конструктор из класса "Employees"
        Employees employees_1 = new Employees("Иванов Иван Иванович", "java junior developer", "IvanovII@dreamteam.ru", 9261234567L, 20000, 42);
        Employees employees_2 = new Employees("Петров Петр Петрович", "middle junior developer", "PetrovPP@dreamteam.ru", 9281234567L, 40000, 27);
        Employees employees_3 = new Employees("Стив Биллович Торвальдс", "IT Director", "TorvaldsSB@dreamteam.ru", 9521234567L, 200000, 41);
        Employees employees_4 = new Employees("Глинко Галина Ивановна", "senior junior developer", "GlinkoGI@dreamteam.ru", 9181234567L, 60000, 33);
        Employees employees_5 = new Employees("Золотая Страстина Лакшаревна", "Recruitment Specialist", "ZolotayaSL@dreamteam.ru",  9151234567L, 50000, 23);

        //Создаем массив сотрудников, заполняем массив созданными выше переменными:
        Employees[] employees = {employees_1, employees_2, employees_3, employees_4, employees_5};

        //Проходим по массиву циклом, ищем сотрудников старше 40 и выводим информацию о них на экран.
        for (int i = 0; i <employees.length ; i++){
           if (employees[i].getAge() >= 40) System.out.println("Сотрудники старше 40: \n " + "\n" + employees[i].print_information());
        }

    }

}
