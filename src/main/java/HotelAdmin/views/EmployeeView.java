package HotelAdmin.views;

import HotelAdmin.Services.EmployeeRoleService;
import HotelAdmin.Services.EmployeeService;
import HotelAdmin.Services.HotelInfoService;
import HotelAdmin.entities.Employee;
import HotelAdmin.entities.EmployeeRole;
import HotelAdmin.entities.HotelInfo;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {

    private final EmployeeService employeeService;
    private final HotelInfoService hotelInfoService;
    private final EmployeeRoleService employeeRoleService;

    public EmployeeView(EmployeeService employeeService, HotelInfoService hotelInfoService, EmployeeRoleService employeeRoleService) {
        this.employeeService = employeeService;
        this.hotelInfoService = hotelInfoService;
        this.employeeRoleService = employeeRoleService;
    }

    public void registerEmployee() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter employee name");
            String name = scanner.next();
            System.out.println("Please enter employee last name");
            String lastName = scanner.next();
            System.out.println("Please enter employee phone number");
            String phoneNumber = scanner.next();
            System.out.println("Please enter employee adress");
            String adress = scanner.next();

            List<EmployeeRole> employeeRoleList = employeeRoleService.retrieveList();
            for (int i = 1; i < employeeRoleList.size(); i++) {
//                if (i == 0) {
//                    System.out.println("Type 1 " + "for " + employeeRoleList.get(i).getRole());
//                    continue;
//                }
                System.out.println("Type " + (i + 1) + " for " + employeeRoleList.get(i).getRole());
            }
            System.out.println("Please select a role");
            int role = scanner.nextInt();


            List<HotelInfo> hotelInfoList = hotelInfoService.retrieveList();
            for (int i = 0; i < hotelInfoList.size(); i++) {
                if (i == 0) {
                    System.out.println("Type 1 " + "for " + hotelInfoList.get(i).getHotelName());
                    continue;
                }
                System.out.println("Type " + (i + 1) + " for " + hotelInfoList.get(i).getHotelName());
            }
            System.out.println("Please select a hotel");
            int hotel = scanner.nextInt();
            EmployeeRole employeeRole = employeeRoleList.get(role == 1 ? 0 : role);
            HotelInfo hotelInfo = hotelInfoList.get(hotel == 1 ? 0 : hotel);

            Employee insertedEmployee = employeeService.insertEmployee(name, lastName, phoneNumber, adress, employeeRole, hotelInfo);
            System.out.println(insertedEmployee);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findEmployeeUsingNameAndLastName() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter employee name: ");
            String name = scanner.next();
            System.out.print("Please enter employee lastname: ");
            String lastName = scanner.next();

            Employee employeeByNameAndLastName = employeeService.findEmployeeByNameAndLastName(name, lastName);
            System.out.println(employeeByNameAndLastName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter employee name");
            String name = scanner.next();
            System.out.println("Please enter employee lastname");
            String lastName = scanner.next();

            int employeeByNameAndLastName = employeeService.deleteEmployee(name, lastName);
            System.out.println(employeeByNameAndLastName);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void updateEmpl() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter employee name");
            String name = scanner.next();
            System.out.println("Please enter employee lastname");
            String lastName = scanner.next();

            Employee employeeByNameAndLastName = employeeService.findEmployeeByNameAndLastName(name, lastName);
            System.out.println("Please enter new name");
            String newName = scanner.next();
            System.out.println("Please enter new lastname");
            String newLastName = scanner.next();
            System.out.println("Please enter new phone number");
            String newNumber = scanner.next();
            System.out.println("Please enter new adress");
            String newAdress = scanner.next();

            employeeByNameAndLastName.setName(newName);
            employeeByNameAndLastName.setLastName(newLastName);
            employeeByNameAndLastName.setPhone(newNumber);
            employeeByNameAndLastName.setAdress(newAdress);
            Employee employee = employeeService.updateEmpl(employeeByNameAndLastName);
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
