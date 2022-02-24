package HotelAdmin.Patterns.ChaniOfResp.handlers;

import HotelAdmin.Patterns.ChaniOfResp.Database;

public class UserExistsHandler extends Handler {
    private final Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }
    //checked of de user bestaat in de database, zoniet melden om te registreren
    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("This username is not registered!");
            System.out.println("Sign Up to our app now!");
            return false;
        }
        return handleNext(username, password);
    }

}

