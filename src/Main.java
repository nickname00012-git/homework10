

public class Main {
    public static void main(String[] args) {


        // Heading
        System.out.println();
        System.out.println();
        System.out.println("<<<<  Homework 10 (Strings) >>>>");
        System.out.println();


        int taskN = 0;

        // Task 1

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Ф. И. О. сотрудника - " + fullName);

        System.out.println();
        System.out.println();

        // Task 2

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        System.out.println(fullName.toUpperCase());

        System.out.println();
        System.out.println();

        // Task 3

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        fullName = "Иванов Семён Семёнович";
//        System.out.println("fullName = " + fullName);
        fullName = fullName.replace('ё', 'е');

        System.out.println("fullName = " + fullName);

        System.out.println();
        System.out.println();

    }
}

