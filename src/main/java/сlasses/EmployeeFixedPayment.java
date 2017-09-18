package сlasses;

import interfaces.Employee;

/**
 * Created by Jesus on 02.09.2017.
 */
public class EmployeeFixedPayment extends Employee{

    public EmployeeFixedPayment(){
        super();
    }

    public EmployeeFixedPayment(int idE, String nameE, int paymentE) {
        super(idE, nameE, paymentE);
    }

    @Override
    public double averageMS() {
        return this.getSalary();
    }

    @Override
    public String toString() {
        return "EmployeeFixedPayment{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", salary=" + this.getSalary() +
                '}';
    }
}
