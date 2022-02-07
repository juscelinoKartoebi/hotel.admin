package HotelAdmin.Dao;

import HotelAdmin.entities.Booking;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.Date;

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
}
