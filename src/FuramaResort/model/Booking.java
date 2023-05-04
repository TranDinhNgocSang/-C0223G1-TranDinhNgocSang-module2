package FuramaResort.model;

public class Booking {
    private String idBooking;
    private String bookingDate;
    private String rentalStartDate;
    private String rentalEndDate;
    private String idCustomer;
    private String idIdSerVice;

    public Booking() {
    }

    public Booking(String idBooking, String bookingDate, String rentalStartDate, String rentalEndDate,
                   String idCustomer, String idIdSerVice) {
        this.idBooking = idBooking;
        this.bookingDate = bookingDate;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.idCustomer = idCustomer;
        this.idIdSerVice = idIdSerVice;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(String rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public String getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(String rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdIdSerVice() {
        return idIdSerVice;
    }

    public void setIdIdSerVice(String idIdSerVice) {
        this.idIdSerVice = idIdSerVice;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                "| bookingDate='" + bookingDate + '\'' +
                "| rentalStartDate='" + rentalStartDate + '\'' +
                "| rentalEndtDate='" + rentalEndDate + '\'' +
                "| idCustomer='" + idCustomer + '\'' +
                "| idIdSerVice='" + idIdSerVice + '\'' +
                '}';
    }

    public String getInToCsv() {
        return this.idBooking + "," + this.bookingDate + "," + this.rentalStartDate + "," + this.rentalEndDate +
                "," + this.idCustomer + "," + this.idIdSerVice;
    }
}
