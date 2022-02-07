package HotelAdmin.Dao;

import HotelAdmin.entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeDao {
    private EntityManager entityManager;

    public EmployeeDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public Employee findByEmplNameAndLastName(String name, String lastName) {
        entityManager.getTransaction().begin();
        String jpql = "select e from Employee e  where e.name = :name and e.lastName = :lastName";
        TypedQuery<Employee> query = entityManager.createQuery(jpql, Employee.class);
        Employee employee = query.
                setParameter("name", name)
                .setParameter("lastName",lastName)
                .getSingleResult();
        entityManager.getTransaction().commit();
        return employee;
    }
    public Employee insert(Employee employee) {
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        return employee;
    }
    public int delete(String name, String lastName) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Employee e where e.name = :name and e.lastName = :lastName ");
        query.setParameter("name", name)
                .setParameter("lastName", lastName);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }
//    public List<Employee> retrieveEmployeeList() {
//        entityManager.getTransaction().begin();
//        String jpql = "select e from Employee e";
//        TypedQuery<Employee> query = entityM                                                          anager.createQuery(jpql, Employee.class);
//        List<Employee> employeeListList = query.getResultList();
//        entityManager.getTransaction().commit();
//        return employeeListList;
//    }
    public int updateEmployee (Employee employee) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("update Employee e set e.name = :name where e.emplId = :emplId");
        query.setParameter("emplId", employee.getEmplId());
        query.setParameter("name", employee.getName());
        int rowsupdated = query.executeUpdate();
        System.out.println("entities updated: " + rowsupdated);
        entityManager.getTransaction().commit();
        return rowsupdated;
    }
}
