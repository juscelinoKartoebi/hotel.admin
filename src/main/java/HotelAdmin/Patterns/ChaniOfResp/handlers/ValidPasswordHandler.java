package HotelAdmin.Patterns.ChaniOfResp.handlers;

import HotelAdmin.Patterns.ChaniOfResp.Database;

public class ValidPasswordHandler extends Handler {
    private final Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }
    //checked of de password matched met de username
    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Wrong Password!");
            return false;
        }
        return handleNext(username, password);
    }

}