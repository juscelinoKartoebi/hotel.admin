package HotelAdmin.Patterns.ChaniOfResp;

import HotelAdmin.Patterns.ChaniOfResp.handlers.Handler;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }
    public boolean logIn(String email, String password) {
        if (handler.handle(email, password)) {
            System.out.println("Authorization was successful!");
            return true;
        }
        return false;
    }

}

