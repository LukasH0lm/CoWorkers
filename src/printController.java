import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;



import static java.lang.Integer.parseInt;

public class printController {

    @SuppressWarnings("ALL")
    static CoWorker[] WorkerList = Main.WorkerList;
    static Scanner scanner = new Scanner(System.in);
    public static int currentId = 26;
    public static void menu() {
        while (true) {
            System.out.println("Welcome to the HolmTech Worker Management program ");
            System.out.println("to add new workers press 1 ");
            System.out.println("to view existing workers press 2 ");
            System.out.println("to review salaries press 3 ");
            System.out.print("select: ");
            int choice = parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addWorkers();
                    break;
                case 2:
                    viewWorkers();
                    break;
                case 3:
                    reviewSalaries();
                    break;
                default:
                    System.out.println("Invalid choice");
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

    }}}}

}

