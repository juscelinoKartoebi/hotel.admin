package HotelAdmin.Services;

import HotelAdmin.entities.Employee;

public interface EmployeeService {
    Employee findEmployeeByNameAndLastName(String name, String lastName);

    Employee insertEmployee(String name, String lastName, String phone, String adress);

    int deleteEmployee(String name, String lastName);


}
