package HotelAdmin.Dao;

import HotelAdmin.entities.Booking;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingDao {
        private EntityManager entityManager;

        public BookingDao(EntityManager entityManager) {
            this.entityManager = entityManager;
        }
        public Booking insert(Booking booking) {
            entityManager.getTransaction().begin();
            entityManager.persist(booking);
            entityManager.getTransaction().commit();
            return booking;
        }
        public int delete(Date bookingDate) {
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("delete from Booking e where e.bookingDate = :bookingDate ");
            query.setParameter("bookingDate", bookingDate);
            int rowsDeleted = query.executeUpdate();
            System.out.println("entities deleted: " + rowsDeleted);
            entityManager.getTransaction().commit();
            return rowsDeleted;
        }
        public Booking findByBookingDate(LocalDate bookingDate) {
            entityManager.getTransaction().begin();
            String jpql = "select e from Booking e where e.bookingDate = :bookingDate";
            TypedQuery<Booking> query = entityManager.createQuery(jpql, Booking.class);
            Booking booking = query.setParameter("bookingDate", bookingDate).getSingleResult();
            entityManager.getTransaction().commit();
            return booking;
        }
        public List<Booking> findBookingsByKwartaal(Integer year, Integer period){
            entityManager.getTransaction().begin();
            String jpql = "select b from Booking b where year(b.bookingDate) = :year AND quarter(b.bookingDate) in : period";
            Query query = entityManager.createQuery(jpql, Booking.class);
            query.setParameter("year", year);
            query.setParameter("period", period);
            List<Booking> bookingList = query.getResultList();
            entityManager.getTransaction().commit();
            return bookingList;
        }
        public List<Booking> findBookingByYear(Integer year){
            entityManager.getTransaction().begin();
            String jpql = "select b from Booking b where year(b.bookingDate) = :year";
            Query query = entityManager.createQuery(jpql, Booking.class);
            query.setParameter("year", year);
            List<Booking> bookingList = query.getResultList();
            entityManager.getTransaction().commit();
            return bookingList;
        }
}
