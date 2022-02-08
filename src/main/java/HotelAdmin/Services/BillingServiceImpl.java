package HotelAdmin.Services;

import HotelAdmin.Dao.BillingDao;
import HotelAdmin.entities.Billing;

import java.time.LocalDate;

public class BillingServiceImpl implements BillingService  {
    private final BillingDao bilingDao;

    public BillingServiceImpl(BillingDao bilingDao) {
        this.bilingDao = bilingDao;
    }
    @Override
    public Billing insertBill(Double roomCharge, LocalDate paymentDate) {
        Billing billing = new Billing(roomCharge, paymentDate);
        Billing savedBilling = bilingDao.insert(billing);
        return savedBilling;
    }
}
