package HotelAdmin.views;

import HotelAdmin.Services.EmployeeService;
import HotelAdmin.entities.Employee;

import java.util.Scanner;

public class EmployeeView {

    private final EmployeeService employeeService;

    public EmployeeView(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public void registerEmployee() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your name");
            String name = scanner.next();
            System.out.println("Please enter your last name");
            String lastName = scanner.next();
            System.out.println("Please enter your phone number");
            String phoneNumber = scanner.next();
            System.out.println("Please enter your adress");
            String adress = scanner.next();

            // hotelinfo: je toont eerst een lijst met alle info
            // scanner.nextInt()
            // met de die ingevoerde int ga je in je lijst je object ophalen en dan stuur je het mee in je method
            //zelfde met rol

            Employee insertedEmployee = employeeService.insertEmployee(name, lastName, phoneNumber, adress);
            System.out.println(insertedEmployee);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void findEmployeeUsingNameAndLastName(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your name");
            String name = scanner.next();
            System.out.println("Please enter your last name");
            String lastName = scanner.next();

            Employee employeeByNameAndLastName = employeeService.findEmployeeByNameAndLastName(name, lastName);
            System.out.println(employeeByNameAndLastName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteEmployee(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter employee name");
            String name = scanner.next();
            System.out.println("Please enter employee last name");
            String lastName = scanner.next();

            int employeeByNameAndLastName = employeeService.deleteEmployee(name, lastName);
            System.out.println(employeeByNameAndLastName);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    public void retrieveRole(){
        
    }
}
