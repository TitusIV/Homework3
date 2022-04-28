public class Main {
    public static void main(String[] args) {
        {// Задание 1
            System.out.println("Задание 1");
            int ios = 0;
            int android = 1;
            int clientOs = android;
            if (clientOs == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке:");
            }
            if (clientOs == 1) {
                System.out.println("Установите версию приложения для Android по ссылке:");
            }
        }
        {// Задание 2
            System.out.println("Задание 2");
            int clientDeviceYear = 2014;
            int android = 1;
            int clientOs = android;
            int ios = 0;
            if (clientDeviceYear <= 2015 && clientOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
            }
            if (clientDeviceYear <= 2015 && clientOs == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке:");
            }
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите приложение по ссылке:");
            }
        }
        {// Задание 3
            System.out.println("Задание 3");
            int year = 2022;
            boolean isLeapYear = ((year % 4 == 0) && (year % 100) != 0) || (year % 400 == 0);
            if (isLeapYear) {
                System.out.println(year + " год является високосным");
            } else System.out.println(year + " год не является високосным");
        }
        {// Задание 4
            System.out.println("Задание 4");
            int deliveryDistance = 95;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: 1");
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: 2");
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: 3");
            }
        }
        {// Задание 5
            System.out.println("Задание 5");
            short monthNumber = 12;
            switch (monthNumber) {
                case 3:
                case 4:
                case 5:
                    System.out.println("Это весенний месяц.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Это летний месяц.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Это осенний месяц.");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("Это зимний месяц.");
                    break;
                default:
                    System.out.println("Нет такого месяца!");
            }
        }
    }
}