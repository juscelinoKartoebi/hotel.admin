package HotelAdmin.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "employee_rol")
public class EmployeeRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empl_role_id")
    private Long emplRoleId;
    @Column(name = "role")
    private String role;

    public EmployeeRole(String role) {
        this.role = role;
    }

    public EmployeeRole() {
    }

    public EmployeeRole(Long emplRoleId) {
        this.emplRoleId = emplRoleId;
    }

    public Long getEmplRoleId() {
        return emplRoleId;
    }

    public void setEmplRoleId(Long emplRoleId) {
        this.emplRoleId = emplRoleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "EmployeeRole{\n" +
                "\nrole='" + role + '\'' +
                '}';
    }
}
