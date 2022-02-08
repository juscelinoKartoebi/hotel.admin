package HotelAdmin.views;

import HotelAdmin.Services.BillingService;
import HotelAdmin.entities.Billing;
import HotelAdmin.entities.Employee;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class BillingView {
    private final BillingService billingService;

    public BillingView(BillingService billingService) {
        this.billingService = billingService;
    }

    public void registerBill() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter amount of charge");
            Double roomCharge = Double.valueOf(scanner.next());
            System.out.println("Please enter payment date");
            LocalDate paymentDate = LocalDate.parse(scanner.next());

            Billing insertedBill = billingService.insertBill(roomCharge, paymentDate);
            System.out.println(insertedBill);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
