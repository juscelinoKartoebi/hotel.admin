package HotelAdmin.views;

import HotelAdmin.Services.EmployeeRoleService;
import HotelAdmin.entities.Employee;
import HotelAdmin.entities.EmployeeRole;

import java.util.Scanner;

public class EmployeeRoleView {
    private final EmployeeRoleService employeeRoleService;

    public EmployeeRoleView(EmployeeRoleService employeeRoleService) {
        this.employeeRoleService = employeeRoleService;
    }
    public void insertRole() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter new role");
            String role = scanner.next();

            EmployeeRole insertedRole = employeeRoleService.insertRole(role);
            System.out.println(insertedRole);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
