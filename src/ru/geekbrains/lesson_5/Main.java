package ru.geekbrains.lesson_5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new  Employee[5];
        employees[0] = new Employee("Gordon Freeman", "Scientist", "blackmesa@mail.ru", "89105462768", 4500, 49);
        employees[1] = new Employee("Pedro Sanchez", "Driver", "SanPedro@gmail.com", "89137884565", 1800, 24);
        employees[2] = new Employee("Huang Lee", "Designer", "huang_huang@gmail.com", "89069556768", 3500, 46);
        employees[3] = new Employee("Johnny Boy", "Mechanic", "ohboy@mailbox.com", "89124672727", 2300 , 37);
        employees[4] = new Employee("Martha Smith", "Secretary", "marth_100@mailbox.com", "89124675489", 2000, 44);

        sortEmployeeByAge(employees);
    }

    private static void sortEmployeeByAge(Employee[] employees){
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].getAge() > 40){
//                employees[i].postEmployeeInfo();
//            }
//        }
        for (Employee i : employees) {
            if (i.getAge() > 40)
                i.postEmployeeInfo();
        }
    }
}
