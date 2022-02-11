package HotelAdmin.entities;


import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "hotel_info")
public class HotelInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hotel_id")
    private Long hotelId;
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "adress")
    private String adress;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "hotelInfo")
    @Column
    private Set<Employee> employee;

    public HotelInfo(String hotelName, String adress, String phone, String email, Set<Employee> employee) {
        this.hotelName = hotelName;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
        this.employee = employee;
    }

    public HotelInfo() {
    }

    public HotelInfo(Long hotelId) {
        this.hotelId = hotelId;
    }
    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Hotel info: " +
                "\n \t hotelName = " + hotelName +
                "\n \t adress = " + adress +
                "\n \t phone = " + phone +
                "\n \t email = " + email;
    }
}
