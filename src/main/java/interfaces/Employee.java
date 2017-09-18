package interfaces;

/**
 * Created by Jesus on 02.09.2017.
 */
public abstract class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(){};

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public abstract double averageMS();

}
