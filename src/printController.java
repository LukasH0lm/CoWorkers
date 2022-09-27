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

            String choice = scanner.nextLine();
            if (Objects.equals(choice, "1")) {

                addWorkers();


            } else if (Objects.equals(choice, "2")){
                for (CoWorker coWorker : WorkerList) {
                    System.out.println(coWorker.getName() + " / " + coWorker.getId() + " / " + coWorker.getSalary());
            }
                System.out.print("...");
                scanner.nextLine();
            } else if (Objects.equals(choice, "3")) {

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


                        }

                    }
                    System.out.println(lowestSalaryCoworker.getName());
                    System.out.println(lowestSalary);
                    System.out.print("...");
                }
                else if (Objects.equals(bøfChoice, "2")){
                    int highestSalary = 0;
                    CoWorker highestSalaryCoworker = null;
                    for (CoWorker coWorker : WorkerList) {
                        if (coWorker.salary > highestSalary){
                            highestSalary = coWorker.salary;
                            highestSalaryCoworker = coWorker;

                }}
                    System.out.println(highestSalaryCoworker.getName());
                    System.out.println(highestSalary);
                    System.out.print("...");

                } else {
                    System.out.println("BøfChoice");

                }


            } else {

                System.out.println("please make a valid selection");

                }


            }
        }
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

    }

