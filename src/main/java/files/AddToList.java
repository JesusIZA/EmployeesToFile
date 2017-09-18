package files;

import interfaces.Employee;
import сlasses.EmployeeFixedPayment;
import сlasses.EmployeeHourlyWage;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by Jesus on 02.09.2017.
 */
public abstract class AddToList {

    public static void fromFileEmplFP(List<Employee> employees, String fN) throws FileNotFoundException {
        List<String> temp = FileWorker.readWordsInList(fN);

        int i = 1;
        int idE = 0, paymentE = 0;
        String nameE = "";
        for (String s: temp){
            if(i == 1){
                idE = Integer.parseInt(s);
                i++;
            } else if (i == 2){
                nameE = s;
                i++;
            } else {
                paymentE = Integer.parseInt(s);
                employees.add(new EmployeeFixedPayment(idE, nameE, paymentE));
                i = 1;
            }
        }
    }

    public static void fromFileEmplHW(List<Employee> employees, String fN) throws FileNotFoundException {
        List<String> temp = FileWorker.readWordsInList(fN);

        int i = 1;
        int idE = 0, paymentE = 0;
        String nameE = "";
        for (String s: temp){
            if(i == 1){
                idE = Integer.parseInt(s);
                i++;
            } else if (i == 2){
                nameE = s;
                i++;
            } else {
                paymentE = Integer.parseInt(s);
                employees.add(new EmployeeHourlyWage(idE, nameE, paymentE));
                i = 1;
            }
        }
    }
}
