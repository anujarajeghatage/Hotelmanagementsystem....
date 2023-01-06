package com.hms.demo.service;

import com.hms.demo.model.Booking;
import com.hms.demo.model.Feedback;

@Service
@Autowired
private BookingRepository bookingRepository;

public class BookingService {

    public void addBooking(@RequestBody Booking book)
    {
        return bookingRepository.save(book);
    }


    public void updateBooking(@RequestBody Booking book)
    {
        return bookingRepository.update(book);
    }

    public void postFeed(@RequestBody Feedback feed) {
        return bookingRepository.save(feed);
    }



    }



}
