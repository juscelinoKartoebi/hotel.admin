package HotelAdmin.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "guest")
public class Guest {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "guest_id")
    private Long guestId;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone")
    private String phone;
    @Column(name = "adress")
    private String adress;
    @Column(name = "district")
    private String district;

    public Guest(String name, String lastName, String phone, String adress, String district) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.adress = adress;
        this.district = district;
    }

    public Guest() {
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Guest info: " +
                "\n \t name = " + name +
                "\n \t lastName = " + lastName +
                "\n \t phone = " + phone +
                "\n \t adress = " + adress +
                "\n \t district= " + district +
                "\n";
    }
}
