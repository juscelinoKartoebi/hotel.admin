package HotelAdmin.Services;

import HotelAdmin.Dao.EmployeeRoleDao;
import HotelAdmin.entities.EmployeeRole;

import java.util.List;

public class EmployeeRoleServiceImpl implements EmployeeRoleService {

    private final EmployeeRoleDao employeeRoleDao;

    public EmployeeRoleServiceImpl(EmployeeRoleDao employeeRoleDao) {
        this.employeeRoleDao = employeeRoleDao;
    }
    @Override
    public EmployeeRole insertRole(String role) {
        EmployeeRole employeeRole = new EmployeeRole(role);
        EmployeeRole savedRole = employeeRoleDao.insert(employeeRole);
        return savedRole;
    }

    @Override
    public List<EmployeeRole> retrieveList() {
        List<EmployeeRole> employeeRoleList = employeeRoleDao.retrieveListOfRoles();
        employeeRoleList.stream().forEach(System.out::println);
        for (EmployeeRole role : employeeRoleList) {
        return employeeRoleList;

    }
        return employeeRoleList;
    }}
