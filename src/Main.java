import java.util.Arrays;

public class Main {
    public static CoWorker[] WorkerList = {};

    public static void main(String[] args) {

        System.out.println(
                " _    _       _        _______        _     \n" +
                "| |  | |     | |      |__   __|      | |    \n" +
                "| |__| | ___ | |_ __ ___ | | ___  ___| |__  \n" +
                "|  __  |/ _ \\| | '_ ` _ \\| |/ _ \\/ __| '_ \\ \n" +
                "| |  | | (_) | | | | | | | |  __/ (__| | | |\n" +
                "|_|  |_|\\___/|_|_| |_| |_|_|\\___|\\___|_| |_|");


        CoWorker w0 = new CoWorker("Anders Hansen", 23, 25250);
        CoWorker w1 = new CoWorker("Camilla Sørensen", 24, 26000);
        CoWorker w2 = new CoWorker("Ulno Jensen", 25, 12340);


        WorkerList = Arrays.copyOf(WorkerList, WorkerList.length + 1);
        WorkerList[WorkerList.length - 1] = w0;
        WorkerList = Arrays.copyOf(WorkerList, WorkerList.length + 1);
        WorkerList[WorkerList.length - 1] = w1;
        WorkerList = Arrays.copyOf(WorkerList, WorkerList.length + 1);
        WorkerList[WorkerList.length - 1] = w2;


        printController.menu();





    }
}