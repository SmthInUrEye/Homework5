//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задача №1
        boolean clientOS = true;
        if ( clientOS ) {
            System.out.print ( "\n Для Android — Установите версию приложения для Android по ссылке" );
        } else {
            System.out.print ( "\n Для iOS — Установите версию приложения для iOS по ссылке" );
        }

        // Задача №2
        int clientDeviceOS = 1;
        int clientDeviceYear = 2014;
        if ( clientDeviceOS == 1 && clientDeviceYear >= 2015 ) {
            System.out.println ( "\n Для Android — Установите версию приложения для Android по ссылке" );
        } else if ( clientDeviceOS == 1 && clientDeviceYear < 2015 ) {
            System.out.println ( "\n Для Android - Установите облегченную версию приложения для Android по ссылке" );
        }
        if ( clientDeviceOS == 0 && clientDeviceYear >= 2015 ) {
            System.out.println ( "\n Для iOS — Установите версию приложения для iOS по ссылке" );
        } else if ( clientDeviceOS == 0 && clientDeviceYear < 2015 ) {
            System.out.println ( "\n Для iOS — Установите облегченную версию приложения для iOS по ссылке" );
        }

        // Задача №3
        int year = 2031;
        if ( ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) && (year > 1584) )
            System.out.println ( "\n " + year + " год является високосным" );
        else System.out.println ( "\n " + year + " год не является високосным" );

        // Задача №4
        int deliveryDistance = 105;
        int deliveryTime = 1;
        if ( deliveryDistance > 100 ) {
            System.out.println ( "Доставки свыше 100 км нет" );
        } else if ( deliveryDistance > 20 ) {
            deliveryTime += 1;
            if ( deliveryDistance > 60 ) deliveryTime += 1;
            System.out.println ( "\n Потребуется дней для доставки : " + deliveryTime );
        }

        // Задача №5
        int monthNumber = 2;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println ( "\n Месяц принадлежит сезону зима " );
                break;
            case 3:
            case 4:
            case 5:
                System.out.println ( "\n Месяц принадлежит сезону весна " );
                break;
            case 6:
            case 7:
            case 8:
                System.out.println ( "\n Месяц принадлежит сезону лето " );
                break;
            case 9:
            case 10:
            case 11:
                System.out.println ( "\n Месяц принадлежит сезону осень " );
                break;
            default:
                System.out.println ( "\n Месяц указан не верно" );
        }
    }
}


