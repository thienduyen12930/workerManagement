package controller;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import model.SalaryHistory;
import model.Worker;
import repository.IWorkerRepository;
import repository.WorkerRepository;
import view.Menu;

public class WorkerManagement extends Menu {

    static String[] mc = {"Add a Worker                           ", "Increase salary for worker             ", "Decrease for worker                    ", "Show adjusted salary worker information","Exit                                   "};
    private IWorkerRepository workerRepository;
     Hashtable<String, Worker> workers;
    List<SalaryHistory> salaryHistorys;
    public WorkerManagement() {
        super("==== WORKER MANAGEMENT ====", mc);
        workerRepository = new WorkerRepository();
        workers = new Hashtable<>();
        salaryHistorys = new ArrayList<>();
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                workerRepository.addWorker(workers);
                break;
            case 2:
                workerRepository.changeSalary(workers, salaryHistorys, "UP");
                break;
            case 3:
                workerRepository.changeSalary(workers, salaryHistorys, "DOWN");
                break;
            case 4:
                workerRepository.displaySalary(salaryHistorys);
                break;
            case 5:
                System.exit(0);
                break;
        }
    }
}


