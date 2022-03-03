package HotelAdmin.Patterns.ChaniOfResp;

import java.util.HashMap;
import java.util.Map;
//behavorial
public class Database {
    private final Map<String, String> users;

    //"Database" voor de opslag van credentails
    public Database() {
        users = new HashMap<>();
        users.put("robert", "robert");
        users.put("lino", "lino");
    }
    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }
    public boolean isValidPassword(String username, String password) {
        return users.get(username).equals(password);
    }
}

