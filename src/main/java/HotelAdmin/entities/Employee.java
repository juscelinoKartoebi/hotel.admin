package HotelAdmin.entities;


import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empl_id")
    private Long emplId;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone")
    private String phone;
    @Column(name = "adress")
    private String adress;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id")
    private HotelInfo hotelInfo;
    @ManyToOne(fetch = FetchType.LAZY)
    private EmployeeRole employeeRole;


    public Employee(String name, String lastName, String phone, String adress, HotelInfo hotelInfo, EmployeeRole employeeRole) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.adress = adress;
        this.hotelInfo = hotelInfo;
        this.employeeRole = employeeRole;
    }

    public Employee() {
    }

    public Long getEmplId() {
        return emplId;
    }

    public void setEmplId(Long emplId) {
        this.emplId = emplId;
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

    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelId(HotelInfo hotelId) {
        this.hotelInfo = hotelInfo;
    }

    @Override
    public String toString() {
        return "Employee info:" +
                "\n \t name = " + name +
                "\n \t lastName = " + lastName +
                "\n \t phone = " + phone +
                "\n \t adress = " + adress + "\n\n" + hotelInfo +
                "\n\n" + employeeRole;
    }
}
