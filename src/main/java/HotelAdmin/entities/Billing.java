package HotelAdmin.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "billing")
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "billing_number")
    private Long billingNumber;
    @Column(name = "room_charge")
    private Double roomCharge;
    @Column(name = "payment_date")
    private LocalDate paymentDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "guest_id")
    private Guest guest;

    public Billing(Double roomCharge, LocalDate paymentDate) {
        this.roomCharge = roomCharge;
        this.paymentDate = paymentDate;
    }
    public Billing() {
    }

    public Long getBillingNumber() {
        return billingNumber;
    }
    public void setBillingNumber(Long billingNumber) {
        this.billingNumber = billingNumber;
    }
    public Double getRoomCharge() {
        return roomCharge;
    }
    public void setRoomCharge(Double roomCharge) {
        this.roomCharge = roomCharge;
    }
    public LocalDate getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
    public Guest getGuest() {
        return guest;
    }
    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "Billing: " +
                "\n \t roomCharge = " + roomCharge +
                "\n \t paymentDate = " + paymentDate +
                "\n \t guest = " + guest;
    }
}

