package сlasses;

import interfaces.Employee;

/**
 * Created by Jesus on 02.09.2017.
 */
public class EmployeeHourlyWage extends Employee {

    public EmployeeHourlyWage(){
        super();
    }

    public EmployeeHourlyWage(int idE, String nameE, int paymentE) {
        super(idE, nameE, paymentE);
    }

    public double averageMS() {
        return this.getSalary() * 20.8 * 8;
    }

    @Override
    public String toString() {
        return "EmployeeHourlyWage{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", salaryPerHour=" + this.getSalary() +
                '}';
    }
}
