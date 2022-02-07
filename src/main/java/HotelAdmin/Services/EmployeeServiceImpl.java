package HotelAdmin.Services;

import HotelAdmin.Dao.EmployeeDao;
import HotelAdmin.entities.Employee;
import HotelAdmin.entities.EmployeeRole;
import HotelAdmin.entities.HotelInfo;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
    @Override
    public Employee findEmployeeByNameAndLastName(String name, String lastName) {
        return employeeDao.findByEmplNameAndLastName(name, lastName);
    }

    @Override
    public Employee insertEmployee(String name, String lastName, String phone, String adress) {

        Employee employee = new Employee(name,
                lastName,
                phone,
                adress,
                new HotelInfo(1L),
                new EmployeeRole(1L));
        Employee savedEmployee = employeeDao.insert(employee);
        return savedEmployee;

    }

    @Override
    public int deleteEmployee(String name, String lastName) {
        Employee foundDeletedEmployee = employeeDao.findByEmplNameAndLastName(name, lastName);
        int totalRecordsDeleted = employeeDao.delete(name, lastName);
        return totalRecordsDeleted;
    }
}
