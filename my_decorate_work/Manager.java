package my_decorate_work;

import java.util.Date;

public class Manager extends EmployeeDecorator {
	String name;

    public Manager(EmployeeComponent employee) {
        super(employee);
    }

	public Manager(EmployeeComponent employee, String name) {
		super(employee);
		this.name = name;
	}

    @Override
    public void doTask() {
        super.doTask(); // Gọi lại nhiệm vụ cơ bản
        createRequirement();
        assignTask();
        manageProgress();
    }

    private void createRequirement() {
        System.out.println("Creating Requirements");
    }

    private void assignTask() {
        System.out.println("Assigning Tasks");
    }

    private void manageProgress() {
        System.out.println("Managing Progress");
    }
    @Override
    public void join(Date joinDate) {
        System.out.println(this.name + " joined on " + joinDate);
    }
}
