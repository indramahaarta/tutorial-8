package id.ac.ui.cs.advprog.bookingservice.service;

import id.ac.ui.cs.advprog.bookingservice.model.Booking;
import id.ac.ui.cs.advprog.bookingservice.model.dto.CreateBookingDTO;
import id.ac.ui.cs.advprog.bookingservice.repository.BookingRepository;
import id.ac.ui.cs.advprog.bookingservice.vo.Asdos;
import id.ac.ui.cs.advprog.bookingservice.vo.BookingApproval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking createBooking(CreateBookingDTO bookingRequest) {
        Booking booking = new Booking();
        booking.setBookerName(bookingRequest.getName());
        booking.setBookerClass(bookingRequest.getBookerClass());
        booking.setAsdosId(bookingRequest.getAsdosCode());
        booking.setBookTime(bookingRequest.getRequestedTime());

        BookingApproval response = restTemplate.postForObject("http://ASDOS-SERVICE/asdos/book", bookingRequest, BookingApproval.class);

        if (response!= null && response.getStatus().equals("Success")) {
            return bookingRepository.save(booking);
        } else {
            return null;
        }
    }

    @Override
    public Booking deleteBooking(int id) {
        Booking booking = bookingRepository.findBookingById(id);
        bookingRepository.deleteById(booking.getId());
        return booking;
    }

    @Override
    public List<Asdos> getAllAsdos() {
        ResponseEntity<Asdos[]> asdosList = restTemplate.getForEntity("http://ASDOS-SERVICE/asdos/", Asdos[].class);

        return Arrays.asList(asdosList.getBody());
    }
}
