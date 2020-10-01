package ru.geekbrains.lesson_5;

class Employee {

    Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    void postEmployeeInfo (){
        System.out.println("Карточка сотрудника: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Возраст: " + age);
        System.out.println("Оклад: " + salary);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("email: " + email + "\n");
    }

    int getAge() {
        return age;
    }
}
