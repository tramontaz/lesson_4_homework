package geekbrains.java_1.lesson_4_homework;

/**
 * Created by User on 024 24.08.16.
 */
public class Employees {

    private String name; //Ф.И.О.
    private String position; //должность
    private String email; //электронная почта
    private long tel_number; //номер телефона
    private int salary; //оклад
    private int age; //возраст

    //Метод "print_information" выводит информацию об объекте в консоль
    public String print_information() {
        return "Ф.И.О: " + name + "\n" + "Занимаемая должность: " + position + "\n" + "Электронный адрес: " + email + "\n" + "Номер телефона: " + tel_number + "\n" + "Должностной оклад: " + salary + "\n" + "Возраст: " + age;
    }

    //Конструктор
    public Employees(String name, String position, String email, long tel_number, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.tel_number = tel_number;
        this.salary = salary;
        this.age = age;
    }

    //"Геттер", возвращающий переменную "age". Это нужно для того, чтобы в Main классе мы могли читать "privat" переменную.
    public int getAge() {return age;}

}
