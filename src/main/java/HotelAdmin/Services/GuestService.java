package HotelAdmin.Services;

import HotelAdmin.entities.Guest;

import java.util.List;

public interface GuestService {

    Guest insertGuest(String name, String lastName, String phone, String adress, String district);
    Guest findGuest(String name, String lastName);
    Guest deleteGuest(String name, String lastName);
    Guest updateGuest(Guest guest);
    List<Guest> retrieveList();
    List<Guest> findGuestsByDistricts(String distr);
}
