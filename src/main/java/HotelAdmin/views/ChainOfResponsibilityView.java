package HotelAdmin.views;

import HotelAdmin.Patterns.ChaniOfResp.AuthService;
import HotelAdmin.Patterns.ChaniOfResp.Database;
import HotelAdmin.Patterns.ChaniOfResp.handlers.Handler;
import HotelAdmin.Patterns.ChaniOfResp.handlers.RoleCheckHandler;
import HotelAdmin.Patterns.ChaniOfResp.handlers.UserExistsHandler;
import HotelAdmin.Patterns.ChaniOfResp.handlers.ValidPasswordHandler;

import java.util.Scanner;

public class ChainOfResponsibilityView {
    public void getChain() {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database)).setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
        Scanner scan = new Scanner(System.in);
        System.out.println(" Login\n Welcome to our CRM system");
        System.out.println(" Please enter username:");
        String username = scan.next();
        System.out.println(" Please enter password:");
        String password = scan.next();
        service.logIn(username, password);
//        System.out.println("==========================================");
//
//        System.out.println(service.logIn("username", "password"));
//
//        System.out.println("==========================================");
//
//        System.out.println(service.logIn("user_username", "password"));
//
//        System.out.println("==========================================");
//
//        System.out.println(service.logIn("admin_username", "admin_password"));
//
//        System.out.println("==========================================");
    }
}