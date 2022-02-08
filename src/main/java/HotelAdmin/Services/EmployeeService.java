package HotelAdmin.Services;

import HotelAdmin.entities.Employee;
import HotelAdmin.entities.EmployeeRole;
import HotelAdmin.entities.HotelInfo;

public interface EmployeeService {
    Employee findEmployeeByNameAndLastName(String name, String lastName);

    Employee insertEmployee(String name, String lastName, String phone, String adress, EmployeeRole employeeRole, HotelInfo hotelInfo);

    int deleteEmployee(String name, String lastName);
    Employee updateEmpl(Employee employee);
//    Employee updateEmployee();


}
