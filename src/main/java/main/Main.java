package main;

import interfaces.Employee;
import сlasses.EmployeeFixedPayment;
import сlasses.EmployeeHourlyWage;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jesus on 02.09.2017.
 */
public class Main {

    static String fN1 = "C:\\JavaCreate\\IDEA2017\\Employees\\src\\main\\resources\\EmplFP.txt";
    static String fN2 = "C:\\JavaCreate\\IDEA2017\\Employees\\src\\main\\resources\\EmplHW.txt";
    static String fN3 = "C:\\JavaCreate\\IDEA2017\\Employees\\src\\main\\resources\\AllEmpls.txt";
    static String text1 = "1 Jesus 2000\n" +
            "2 Sarah 3000\n" +
            "2 Sasha 4000";
    static String text2 = "1 Foma 7\n" +
            "2 Kolia 6\n" +
            "3 Lena 5";

    public static void main(String [] args) throws FileNotFoundException {

        List<Employee> employees = new LinkedList<Employee>();

        //file
        /*fromFileEmplFP(employees, fN1);

        fromFileEmplHW(employees, fN2);

        for(Employee e: employees){
            System.out.println(e);
        }*/
/*
        FileWorker.write(fN3, ("" + employees.get(0).getClass() + " -> " + employees.get(0).getId() + " " +
                employees.get(0).getName() + " " + employees.get(0).getSalary()));

        for(int i = 1; i < employees.size(); i++){
            FileWorker.update(fN3, ("" + employees.get(i).getClass() + " -> " + employees.get(i).getId() + " " +
                    employees.get(i).getName() + " " + employees.get(i).getSalary()));
        }
*/
/*
        String EmplFPs = FileWorker.read(fN1);
        char EmplFPsC [] = EmplFPs.toCharArray();

        int idE = Integer.parseInt("" + EmplFPsC[0]);
        String nameE = "";
        int paymentE = 0;
        for(int i = 2; EmplFPsC[i] != '2'; i++) {
            nameE += EmplFPsC[i];
            paymentE++;
        }
        System.out.println(idE + "-" + nameE);

*/

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1){
                employees.add(new EmployeeFixedPayment(i, "nameFP" + i, 1000 + i * 50));
            } else {
                employees.add(new EmployeeHourlyWage(i, "nameHW" + i, 5 + i));
            }
        }

        List<Double> averageSs = new ArrayList<Double>();

        for(Employee e: employees){
            System.out.println(e);
            System.out.println(e.averageMS());
            averageSs.add(e.averageMS());

        }
        Collections.sort(averageSs);

        for(Double d: averageSs){
            for(Employee e: employees) {
               if(e.averageMS() == d.doubleValue()){
                   System.out.println("" + e.getId() + " " + e.getName() + " S= " + e.averageMS());
               }
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.println(employees.get(i));
        }

        for(int i = employees.size() - 1; i > employees.size() - 4; i--){
            System.out.println(employees.get(i).getId());
        }

    }
}
