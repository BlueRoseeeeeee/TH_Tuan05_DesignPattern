package my_decorate_work;

import java.util.Date;

public class MainTest {
    public static void main(String[] args) {
        EmployeeComponent normalEmployee = new EmployeeNormal();
        System.out.println("=== Normal Employee ===");
        normalEmployee.doTask();
        normalEmployee.join(new Date());

        System.out.println("\n=== Manager Employee ===");
        EmployeeComponent manager = new Manager(new EmployeeNormal(), "Tram Ho");
        manager.doTask();
        manager.join(new Date());

        System.out.println("\n=== Manager kiêm Team Leader ===");
        EmployeeComponent teamLeaderManager = new TeamLeader(new Manager(new EmployeeNormal(), "Tram Ho"), "Tram Ho");
        teamLeaderManager.doTask();
        teamLeaderManager.join(new Date());
    }
}
