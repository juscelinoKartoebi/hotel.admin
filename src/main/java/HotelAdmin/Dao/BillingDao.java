package HotelAdmin.Dao;

import HotelAdmin.entities.Billing;
import HotelAdmin.entities.EmployeeRole;
import HotelAdmin.entities.Guest;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class BillingDao {
    private EntityManager entityManager;

    public BillingDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Billing insert(Billing billing) {
        entityManager.getTransaction().begin();
        entityManager.persist(billing);
        entityManager.getTransaction().commit();
        return billing;
    }
    public int delete(Long billingNumber) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("delete from Billing b where b.billingNumber = :billingNumber ");
        query.setParameter("billingNumber", billingNumber);
        int rowsDeleted = query.executeUpdate();
        System.out.println("entities deleted: " + rowsDeleted);
        entityManager.getTransaction().commit();
        return rowsDeleted;
    }
    public Billing findByDate(LocalDate paymentDate) {
        entityManager.getTransaction().begin();
        String jpql = "select b from Billing b where b.paymentDate = :paymentDate";
        TypedQuery<Billing> query = entityManager.createQuery(jpql, Billing.class);
        Billing billing = query.setParameter("paymentDate", paymentDate).getSingleResult();
        entityManager.getTransaction().commit();
        return billing;
    }

}
