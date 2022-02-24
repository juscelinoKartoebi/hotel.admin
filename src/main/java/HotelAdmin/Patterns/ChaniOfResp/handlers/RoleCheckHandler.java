package HotelAdmin.Patterns.ChaniOfResp.handlers;

public class RoleCheckHandler extends Handler {

    //na het checken of de user bestaat en password correct is
    //checken of het een admin is of user,
    @Override
    public boolean handle(String username, String password) {
        if ("lino".equals(username)) {
            System.out.println("Loading Admin Page...");
            return true;
        }
        System.out.println("Loading Default Page...");
        return handleNext(username, password);
    }

}

