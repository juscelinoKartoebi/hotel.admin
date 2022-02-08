package HotelAdmin.Dao;

import HotelAdmin.entities.HotelInfo;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class HotelInfoDao {
    private EntityManager entityManager;

    public HotelInfoDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
       public List<HotelInfo> retrieveHotelList() {
        entityManager.getTransaction().begin();
        String jpql = "select h from HotelInfo h";
        TypedQuery<HotelInfo> query = entityManager.createQuery(jpql, HotelInfo.class);
        List<HotelInfo> employeeListList = query.getResultList();
        entityManager.getTransaction().commit();
        return employeeListList;
    }
}
