package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// задание 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника " + fullName);

        // задание 2
        String s1 = fullName.toLowerCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + s1);

        // задание 3
        String s2 = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела - " + s2);

        // задание 4
        String originalName = "Иванов Семён Семёнович";
        String s3 = originalName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника - " + s3);


    }
}
