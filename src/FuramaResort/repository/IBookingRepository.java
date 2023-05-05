package FuramaResort.repository;

import FuramaResort.model.Booking;

import java.util.List;

public interface IBookingRepository {
    List<String> getIdCustomerList();

    List<String> getIdServiceList();

    List<Booking> getBookingList();

    void addNewBooking(Booking booking);

    int getIndexToIdBooking(String idBooking);
}
