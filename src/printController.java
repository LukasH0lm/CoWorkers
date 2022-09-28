import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;



import static java.lang.Integer.parseInt;

public class printController {

    static CoWorker[] WorkerList = Main.WorkerList;
    static Scanner scanner = new Scanner(System.in);
    public static int currentId = 26;
    public static void menu() {
        while (true) {
            System.out.println("------------------------------------------------------------");
            System.out.println("Welcome to the HolmTech Worker Management program ");
            System.out.println("------------------------------------------------------------");
            System.out.println("1: add new workers press ");
            System.out.println("2: view existing workers ");
            System.out.println("3: review salaries ");
            System.out.println("4: exit ");
            System.out.print("select: ");

            int choice = parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addWorkers();
                case 2 -> viewWorkers();
                case 3 -> reviewSalaries();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }}

        public static void addWorkers(){
        while (true){

            System.out.println("Please enter information about your new worker, type \"stop\" to stop adding employees");

            System.out.print("Name: ");
            String choiceName = scanner.nextLine();
            if (Objects.equals(choiceName, "stop")){
                break;
            }
            System.out.print("Salary: ");
            String choiceSalary = scanner.nextLine();
            if (Objects.equals(choiceSalary, "stop")){
                break;
            }

            CoWorker w = new CoWorker(choiceName,currentId,parseInt(choiceSalary));
            currentId++;

            WorkerList = Arrays.copyOf(WorkerList, WorkerList.length + 1);
            WorkerList[WorkerList.length - 1] = w;

        }

        }
public static void viewWorkers(){
        for (CoWorker coWorker : WorkerList) {
            System.out.println(coWorker.getName() + " / " + coWorker.getId() + " / " + coWorker.getSalary());
        }
        System.out.print("...");
        scanner.nextLine();
        }
public static void reviewSalaries(){
        System.out.println("To view the employee with the lowest salary, press 1");
        System.out.println("To view the employee with the highest salary, press 2");

        String bøfChoice = scanner.nextLine();
        if (Objects.equals(bøfChoice, "1")){

            int lowestSalary = Integer.MAX_VALUE;
            CoWorker lowestSalaryCoworker = null;
            for (CoWorker coWorker : WorkerList) {
                if (coWorker.salary < lowestSalary){
                    lowestSalary = coWorker.salary;
                    lowestSalaryCoworker = coWorker;

    }}
            assert lowestSalaryCoworker != null;
            System.out.println("The employee with the lowest salary is " + lowestSalaryCoworker.getName() + " with a salary of " + lowestSalaryCoworker.getSalary());
            System.out.print("...");
            scanner.nextLine();


        } else if (Objects.equals(bøfChoice, "2")){

            int highestSalary = Integer.MIN_VALUE;
            CoWorker highestSalaryCoworker = null;
            for (CoWorker coWorker : WorkerList) {
                if (coWorker.salary > highestSalary){
                    highestSalary = coWorker.salary;
                    highestSalaryCoworker = coWorker;
    }

}
            assert highestSalaryCoworker != null;
            System.out.println("The employee with the highest salary is " + highestSalaryCoworker.getName() + " with a salary of " + highestSalaryCoworker.getSalary());
            System.out.print("...");
            scanner.nextLine();
        }
        }
        }


