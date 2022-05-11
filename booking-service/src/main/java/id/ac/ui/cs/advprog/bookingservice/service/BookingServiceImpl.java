package id.ac.ui.cs.advprog.bookingservice.service;

import id.ac.ui.cs.advprog.bookingservice.model.Booking;
import id.ac.ui.cs.advprog.bookingservice.model.dto.CreateBookingDTO;
import id.ac.ui.cs.advprog.bookingservice.repository.BookingRepository;
import id.ac.ui.cs.advprog.bookingservice.vo.Asdos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking createBooking(CreateBookingDTO bookingRequest) {
        // ToDo
        return null;
    }

    @Override
    public Booking deleteBooking(int id) {
        Booking booking = bookingRepository.findBookingById(id);
        bookingRepository.deleteById(booking.getId());
        return booking;
    }

    @Override
    public List<Asdos> getAllAsdos() {
        // ToDo
        return null;
    }
}
