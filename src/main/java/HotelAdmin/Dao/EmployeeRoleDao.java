package HotelAdmin.Dao;

import HotelAdmin.entities.EmployeeRole;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

public class EmployeeRoleDao {
    private EntityManager entityManager;

    public EmployeeRoleDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public EmployeeRole insert(EmployeeRole employeeRole) {
        entityManager.getTransaction().begin();
        entityManager.persist(employeeRole);
        entityManager.getTransaction().commit();
        return employeeRole;
    }
    public int delete(String rol) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from EmployeeRole er where er.role = :rol ");
        query.setParameter("rol", rol);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }
//    public EmployeeRole findByRol(String rol) {
//        entityManager.getTransaction().begin();
//        String jpql = "select er from EmployeeRole er where er.role = :rol";
//        TypedQuery<EmployeeRole> query = entityManager.createQuery(jpql, EmployeeRole.class);
//        EmployeeRole employeeRole = query.setParameter("rol", rol).getSingleResult();
//        entityManager.getTransaction().commit();
//        return employeeRole;
//    }
        public List<EmployeeRole> retrieveListOfRoles() {
        entityManager.getTransaction().begin();
        String jpql = "select er from EmployeeRole er";
        TypedQuery<EmployeeRole> query = entityManager.createQuery(jpql, EmployeeRole.class);
        List<EmployeeRole> roleList = query.getResultList();
        entityManager.getTransaction().commit();
        return roleList;
    }
}
