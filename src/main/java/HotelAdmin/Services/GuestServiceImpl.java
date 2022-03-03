package HotelAdmin.Services;

import HotelAdmin.Dao.GuestDao;
import HotelAdmin.entities.Employee;
import HotelAdmin.entities.Guest;

import java.util.List;

public class GuestServiceImpl implements GuestService {
    private final GuestDao guestDao;

    public GuestServiceImpl(GuestDao guestDao) {
        this.guestDao = guestDao;
    }

    @Override
    public Guest insertGuest(String name, String lastName, String phone, String adress, String district) {

        Guest guest = new Guest(name, lastName, phone, adress, district);
        Guest savedGuest = guestDao.insert(guest);
        return savedGuest;
    }
    @Override
    public Guest findGuest(String name, String lastName) {
        return guestDao.findByGuestName(name, lastName);
    }
    @Override
    public Guest deleteGuest(String name, String lastName) {
        Guest foundDeletedGuest = guestDao.findByGuestName(name, lastName);
        return foundDeletedGuest;
    }

    @Override
    public Guest updateGuest(Guest guest) {
        Guest guestU = guestDao.updateGuest(guest);
        return guestU;
    }

    @Override
    public List<Guest> retrieveList() {
        List<Guest> guestList = guestDao.retrieveListOfGuest();
        return guestList;
    }

    @Override
    public List<Guest> findGuestsByDistricts(String distr) {
        return guestDao.retrieveListGuestByDistrict(distr);
    }
}
