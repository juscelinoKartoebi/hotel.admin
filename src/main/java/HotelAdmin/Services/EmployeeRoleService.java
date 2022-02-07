package HotelAdmin.Services;

import HotelAdmin.entities.EmployeeRole;

import java.util.List;

public interface EmployeeRoleService {
    EmployeeRole insertRole(String role);
    List<EmployeeRole> retrieveList();
}
