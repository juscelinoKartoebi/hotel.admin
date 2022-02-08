package HotelAdmin.Services;

import HotelAdmin.Dao.HotelInfoDao;
import HotelAdmin.entities.HotelInfo;

import java.util.List;

public class HotelInfoServiceImpl implements HotelInfoService {
    private final HotelInfoDao hotelInfoDao;

    public HotelInfoServiceImpl(HotelInfoDao hotelInfoDao) {
        this.hotelInfoDao = hotelInfoDao;
    }
    @Override
    public List<HotelInfo> retrieveList() {
        List<HotelInfo> hotelInfoList = hotelInfoDao.retrieveHotelList();
        return hotelInfoList;
    }
}
