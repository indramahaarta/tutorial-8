package id.ac.ui.cs.advprog.asdos.asdos;

import id.ac.ui.cs.advprog.asdos.asdos.model.Asdos;
import id.ac.ui.cs.advprog.asdos.asdos.repository.AsdosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class AsdosInitializer {
    @Autowired
    AsdosRepository asdosRepository;

    @PostConstruct
    public void init(){
        Asdos asdos1 = new Asdos(
                "RE",
                "Rheznandya Erwanto",
                "A",
                LocalTime.of(10,00,00),
                LocalTime.of(16,0,0)
        );
        Asdos asdos2 = new Asdos(
                "STF",
                "Samuel Tupa Febriam",
                "A",
                LocalTime.of(11,30,00),
                LocalTime.of(16,0,0)
        );
        Asdos asdos3 = new Asdos(
                "LF",
                "Muhammad Luthfi Fahlevi",
                "A",
                LocalTime.of(18,30,00),
                LocalTime.of(22,0,0)
        );
        Asdos asdos4 = new Asdos(
                "AN",
                "Andrika Novrialdi",
                "A",
                LocalTime.of(9,0,00),
                LocalTime.of(22,0,0)
        );
        Asdos asdos5 = new Asdos(
                "PAL",
                "Nofaldi Atmam",
                "C",
                LocalTime.of(9,0,00),
                LocalTime.of(22,0,0)
        );
        asdosRepository.save(asdos1);
        asdosRepository.save(asdos2);
        asdosRepository.save(asdos3);
        asdosRepository.save(asdos4);
        asdosRepository.save(asdos5);
    }
}
