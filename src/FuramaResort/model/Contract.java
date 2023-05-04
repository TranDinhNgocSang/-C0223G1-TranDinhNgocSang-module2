package FuramaResort.model;

public class Contract {
    private String numberContrac;
    private String idBooking;
    private String deposit;
    private String totalPayment;

    public Contract() {
    }

    public Contract(String numberContrac, String idBooking, String deposit, String totalPayment) {
        this.numberContrac = numberContrac;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public String getNumberContrac() {
        return numberContrac;
    }

    public void setNumberContrac(String numberContrac) {
        this.numberContrac = numberContrac;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContrac='" + numberContrac + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", deposit='" + deposit + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                '}';
    }

    public String getTnToCsv() {
        return this.numberContrac + "," + this.idBooking + "," + this.deposit + "," + this.totalPayment;
    }
}
