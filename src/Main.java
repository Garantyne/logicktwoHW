public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        byte clientOS = 0;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию для iOS по ссылке");

            }
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке");

            }
        }

        System.out.println("Задача 3");
        int year = 2304;
        if(year % 400 == 0 ) {
            System.out.println("Год является  высокосным ");
        }else if(year % 100 == 0 ){
            System.out.println("Год является  не высокосным О_о");
        } else if (year % 4 == 0) {
            System.out.println("Год является высокосным.");
        } else{
            System.out.println("Год не высокосный");
        }

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if(deliveryDistance < 20){
            System.out.println("срок доставки 1 день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("срок доставки 2 дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("срок доставки 3 дня");
        }else{
            System.out.println("Сами едьте)))");
        }


        System.out.println("Задача 5");

        int monthNumber = 11;
        switch(monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осенний месяц");
                break;
        }

    }
}