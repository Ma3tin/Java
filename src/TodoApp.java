import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" +
                " __ __   ___   ___ ___    ___ __    __   ___   ____   __  _ \n" +
                "|  |  | /   \\ |   |   |  /  _]  |__|  | /   \\ |    \\ |  |/ ]\n" +
                "|  |  ||     || _   _ | /  [_|  |  |  ||     ||  D  )|  ' / \n" +
                "|  _  ||  O  ||  \\_/  ||    _]  |  |  ||  O  ||    / |    \\ \n" +
                "|  |  ||     ||   |   ||   [_|  `  '  ||     ||    \\ |     \\\n" +
                "|  |  ||     ||   |   ||     |\\      / |     ||  .  \\|  .  |\n" +
                "|__|__| \\___/ |___|___||_____| \\_/\\_/   \\___/ |__|\\_||__|\\_|\n" +
                "                                                            \n");
        int tasks = 0;
        int firstChoose = 1;
        int secondChoose = 1;
        int homework = 0;
        String[] tasky = new String[10];
        while (firstChoose == 1) {
            System.out.println("-----------------------------------------------------");
            System.out.println("You can add up to 10 tasks!");
            System.out.println("You have " + tasks + "/10!");
            System.out.println("-----------------------------------------------------");
            System.out.println("1) Manage Tasks");
            System.out.println("2) Exit");
            firstChoose = Integer.parseInt(sc.nextLine());
            if (firstChoose == 1) {
                System.out.println("-----------------------------------------------------");
                System.out.println("Tasks management");
                System.out.println("-----------------------------------------------------");
                while (secondChoose != 4) {
                    System.out.println("1) Create a new tasks");
                    System.out.println("2) Update a task");
                    System.out.println("3) Delete a task");
                    System.out.println("4) Back to main menu");
                    secondChoose = Integer.parseInt(sc.nextLine());
                    if (secondChoose == 1) {
                        if (tasks == 10) {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("Nemůžeš přidat další úkol");
                            System.out.println("-----------------------------------------------------");
                        } else {
                            System.out.println("Enter name of the new task:");
                            String task = sc.nextLine();
                            tasky[tasks] = task;
                            System.out.println("-----------------------------------------------------");
                            System.out.println("You can add up to 10 tasks!");
                            System.out.println("You have " + (tasks + 1) + "/10!");
                            System.out.println("#" + (tasks + 1) + " - " + tasky[tasks]);
                            System.out.println("-----------------------------------------------------");
                            tasks++;
                        }
                    } else if (secondChoose == 2) {
                        System.out.println("Zadej číslo úkolu");
                        homework = Integer.parseInt(sc.nextLine());
                        homework -= 1;
                        System.out.println("Zadej na co to chceš změnit");
                        tasky[homework] = sc.nextLine();
                        tasks -= 1;
                        System.out.println("-----------------------------------------------------");
                        System.out.println("You can add up to 10 tasks!");
                        System.out.println("You have " + (tasks + 1) + "/10!");
                        System.out.println("#" + (tasks + 1) + " - " + tasky[homework]);
                        System.out.println("-----------------------------------------------------");
                    } else if (secondChoose == 3) {
                        System.out.println("Zadej číslo úkolu");
                        homework = Integer.parseInt(sc.nextLine());
                        homework -= 1;
                        tasky[homework] = "";
                        tasks -= 1;
                        System.out.println("-----------------------------------------------------");
                        System.out.println("You can add up to 10 tasks!");
                        System.out.println("You have " + (tasks) + "/10!");
                        System.out.println("-----------------------------------------------------");
                        for (int i = 0; i < tasks; i++) {
                            System.out.println(tasky[i]);
                        }
                    }
                }
            }
            else {
                break;
            }
        }
    }
}