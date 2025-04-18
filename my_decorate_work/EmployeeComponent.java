package my_decorate_work;

import java.util.Date;

public interface EmployeeComponent {
    void doTask();
    void join(Date joinDate);
    void terminate(Date terminate);
}
