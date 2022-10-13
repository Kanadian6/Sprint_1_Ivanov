import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        Converter converter = new Converter();
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1) {
                System.out.println("Какой месяц вы хотите выбрать: 0-January, 1-February, 2-March, 3-April, " +
                        "4-May, 5-June, 6-July, 7-August, 8-September,9-October, 10-November, 11-December");
                int month = scanner.nextInt();
                System.out.println("За какой день вы хотите внести данные от 0 до 29");
                int day = scanner.nextInt();
                if (day < 0 | day > 29) {
                    System.out.println("Введите верное количество");
                } else {
                    System.out.println("Ввести количество шагов ");
                    int steps = scanner.nextInt();
                    stepTracker.saveStepsDay(month, day, steps);
                }
            } else if (userInput == 2) {
                System.out.println("За какой месяц предоставить статистику? 0-January, 1-February, 2-March, 3-April, " +
                        "4-May, 5-June, 6-July, 7-August, 8-September,9-October, 10-November, 11-December");
                int month = scanner.nextInt();
                if (month < 0 | month > 11) {
                } else {
                    System.out.println("Количество пройденных шагов по дням за " + month + " месяц ");
                    stepTracker.statDay(month);
                    System.out.println("Общее количество пройденных шагов за " + month + " месяц = " + stepTracker.saveSumSteps(month) + " шагов ");
                    System.out.println("Максимальное пройденное количество шагов за " + month + " месяц = " + stepTracker.saveMaxStepn(month) + " шагов ");
                    System.out.println("Среднее количество шагов пройденных за " + month + " месяц = " + stepTracker.srednieSteps(month) + " шагов ");
                    System.out.println("Пройденная дистанция за " + month + " месяц = " + converter.conDis(stepTracker.sumaSteps) + " км ");
                    System.out.println("Количество сожжённые калории за " + month + " месяц = " + converter.sjigaemCal(stepTracker.sumaSteps) + " ккал ");
                    System.out.println("Лучшая серия: максимальное количество подряд идущих дней = " + stepTracker.thebestSerStepn(month) + " подряд");
                }
            } else if (userInput == 3) {
                System.out.println("Введите новую цель по количесту шагов");
                int cel = scanner.nextInt();
                stepTracker.newCelSteps(cel);
            } else if (userInput == 4) {
                System.out.println("Программа завершена");
                break;
            } else {
                System.out.println("Not connected");
            }
            printMenu();
            userInput = scanner.nextInt();
        }
    }


    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день:");
        System.out.println("2 - Напечатать статистику за определённый месяц:");
        System.out.println("3 - Изменить цель по количеству шагов в день:");
        System.out.println("4 - Выход");
    }
}
