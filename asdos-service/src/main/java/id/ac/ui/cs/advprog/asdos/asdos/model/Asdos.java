package id.ac.ui.cs.advprog.asdos.asdos.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Asdos")
@Data
@NoArgsConstructor
public class Asdos {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", updatable = false)
//    private int id;

    @Id
    @Column(name = "asdos_code", updatable = false)
    private String code;

    @Column(name = "asdos_name")
    private String name;

    @Column(name = "asdos_class")
    private String asdosClass;

    @Column(name= "office_hour_open")
    private LocalTime OfficeHourOpen;

    @Column(name= "office_hour_close")
    private LocalTime officeHourClose;

    public Asdos(String code, String name, String asdosClass, LocalTime OfficeHourOpen, LocalTime officeHourClose){
        this.code = code;
        this.name = name;
        this.asdosClass = asdosClass;
        this.OfficeHourOpen = OfficeHourOpen;
        this.officeHourClose = officeHourClose;
    }

}
