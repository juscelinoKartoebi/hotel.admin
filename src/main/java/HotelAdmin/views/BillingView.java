package HotelAdmin.views;

import HotelAdmin.Services.BillingService;
import HotelAdmin.Services.GuestService;
import HotelAdmin.entities.Billing;
import HotelAdmin.entities.EmployeeRole;
import HotelAdmin.entities.Guest;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BillingView {
    private final BillingService billingService;
    private final GuestService guestService;

    public BillingView(BillingService billingService, GuestService guestService) {
        this.billingService = billingService;
        this.guestService = guestService;
    }

    public void registerBill() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter amount of charge");
            Double roomCharge = Double.valueOf(scanner.next());
            System.out.println("Please enter payment date");
            LocalDate paymentDate = LocalDate.parse(scanner.next());

            List<Guest> guestList = guestService.retrieveList();
            for (int i = 1; i < guestList.size(); i++) {
                System.out.println("Type " + (i) + " for " + guestList.get(i).getName());
            }
            System.out.println("Please select a guest");
            int guestPick = scanner.nextInt();
            Guest guest = guestList.get(guestPick == 1 ? 0 : guestPick);

            Billing insertedBill = billingService.insertBill(roomCharge, paymentDate, guest);
            System.out.println(insertedBill);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
