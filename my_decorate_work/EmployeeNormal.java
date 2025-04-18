package my_decorate_work;

import java.util.Date;

public class EmployeeNormal implements EmployeeComponent {

    @Override
    public void doTask() {
        System.out.println("Doing Task From Employee Normal");
    }

    @Override
    public void join(Date joinDate) {
        System.out.println("Join Date: " + joinDate);
    }

    @Override
    public void terminate(Date terminate) {
        System.out.println("Terminate Date: " + terminate);
    }
}
