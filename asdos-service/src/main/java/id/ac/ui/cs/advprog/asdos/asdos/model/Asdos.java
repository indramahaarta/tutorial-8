package id.ac.ui.cs.advprog.asdos.asdos.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    @Column(name = "kode", updatable = false)
    private int kode;

    @Column(name = "asdos_name")
    private String name;

    @Column(name = "kelas_asdos")
    private String kelas;

    @Column(name= "jam_kerja_asdos")
    private LocalDateTime jamKerja;

    public Asdos(int kode, String name, String kelas, LocalDateTime jamKerja){
        this.kode = kode;
        this.name = name;
        this.kelas = kelas;
        this.jamKerja = jamKerja;
    }

}
