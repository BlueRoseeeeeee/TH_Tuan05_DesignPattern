package my_decorate_work;

import java.util.Date;

public class TeamLeader extends EmployeeDecorator {
    String name;

    public TeamLeader(EmployeeComponent employee, String name) {
        super(employee);
        this.name = name;
    }

    @Override
    public void doTask() {
        super.doTask(); // Gọi nhiệm vụ cơ bản trước
        conductMeeting();
        reviewCode();
    }

    private void conductMeeting() {
        System.out.println("Conducting Team Meeting");
    }

    private void reviewCode() {
        System.out.println("Reviewing Code");
    }

    @Override
    public void join(Date joinDate) {
        super.join(joinDate);
        System.out.println(this.name + " joined as Team Leader on " + joinDate);
    }
}
