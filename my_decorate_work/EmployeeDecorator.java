package my_decorate_work;

import java.util.Date;

public class EmployeeDecorator implements EmployeeComponent {
    protected EmployeeComponent employee; //

    public EmployeeDecorator(EmployeeComponent employee) { //
        this.employee = employee;
    }

    @Override
    public void doTask() {
        this.employee.doTask();
    }

    @Override
    public void join(Date joinDate) {
        this.employee.join(joinDate);
    }

    @Override
    public void terminate(Date terminate) {
        this.employee.terminate(terminate);
    }
}
