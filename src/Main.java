// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Heading
        System.out.println();
        System.out.println();
        System.out.println("<<<<  Homework 08  >>>>");
        System.out.println();

        int taskN = 0;

        // Task 1

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int[] weekPayments = new int[]{
                39902, 23930, 43023, 9986, 12303
        };

        int weekPaymentsSum = 0;
        int lastIndex = weekPayments.length - 1;
        for (int j = 0; j <= lastIndex; j++) {
            weekPaymentsSum += weekPayments[j];
        }

        System.out.println("Сумма трат за месяц составила " + weekPaymentsSum + " рублей.");
        System.out.println();
        System.out.println();

        // Task 2

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int minWeekPayments = weekPayments[0];
        int maxWeekPayments = weekPayments[0];
        lastIndex = weekPayments.length - 1;
        for (int j = 0; j <= lastIndex; j++) {
            if (weekPayments[j] > maxWeekPayments) {
                maxWeekPayments = weekPayments[j];
            }
            if (weekPayments[j] < minWeekPayments) {
                minWeekPayments = weekPayments[j];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWeekPayments + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxWeekPayments + " рублей.");

        System.out.println();
        System.out.println();

        // Task 3

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        weekPaymentsSum = 0;
        lastIndex = weekPayments.length - 1;
        for (int j = 0; j <= lastIndex; j++) {
            weekPaymentsSum += weekPayments[j];
        }
        double averageWeekPayments = weekPaymentsSum;
        averageWeekPayments = (averageWeekPayments / weekPayments.length);
        System.out.println("Средняя сумма трат за месяц составила " + averageWeekPayments + " рублей.");
        System.out.println();
        System.out.println();


        // Task 4

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        lastIndex = reverseFullName.length - 1;
        for (int j = lastIndex; j >= 0; j--) {
            System.out.print(reverseFullName[j]);
//            if (j != 0) {
//                System.out.print(", ");
//            }
        }
        System.out.println();

        System.out.println();
        System.out.println();
    }
}

