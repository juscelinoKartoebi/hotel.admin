package HotelAdmin.entities;

import javax.persistence.*;
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
    private Date paymentDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "guest_id")
    private Guest guest;

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
    public Date getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    public Guest getGuest() {
        return guest;
    }
    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
