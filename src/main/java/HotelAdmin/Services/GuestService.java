package HotelAdmin.Services;

import HotelAdmin.entities.Guest;

public interface GuestService {

    Guest insertGuest(String name, String lastName, String phone, String adress);
    Guest findGuest(String name, String lastName);
    Guest deleteGuest(String name, String lastName);
    Guest updateGuest(Guest guest);
}
