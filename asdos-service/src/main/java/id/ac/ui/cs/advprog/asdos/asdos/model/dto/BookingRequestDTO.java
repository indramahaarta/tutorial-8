package id.ac.ui.cs.advprog.asdos.asdos.model.dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class BookingRequestDTO {
    String asdosCode;
    String name;
    String bookerClass;
    LocalTime requestedTime;
}
