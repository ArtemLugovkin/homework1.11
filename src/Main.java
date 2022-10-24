import java.time.LocalDate;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        thisLeapYear(2022);
        featuresPhone( 0 , 2000);
        int deliveryDays = calculateDeliveryDays (95);
        System.out.println("Потребуется дней " + deliveryDays);

    }


    private static void thisLeapYear(int year) {
            if((year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) {
                System.out.println(year + " этот год високосный");
            } else {
                System.out.println(year + " это не високосный год");
            }
        }

        private static void featuresPhone(int phoneos, int yearPhone) {
            if (phoneos == 1) {
                System.out.print("Установите версию для Андройд");
            } else {
                System.out.print(" Установите версию для IOs");
            }
            if (yearPhone < 2015) {
                System.out.println(" облегченную");
            }
        }

        public static int calculateDeliveryDays(int deliveryDistance) {
            if (deliveryDistance <= 20) {
                return 1;
            } else {
                return (int) Math.round((double) deliveryDistance / 40) + 1;
            }
            }






}