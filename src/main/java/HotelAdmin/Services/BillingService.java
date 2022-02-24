package HotelAdmin.Services;

import HotelAdmin.entities.Billing;
import HotelAdmin.entities.Guest;

import java.time.LocalDate;

public interface BillingService {
    Billing insertBill(Double roomCharge, LocalDate paymentDate, Guest guest);

}
