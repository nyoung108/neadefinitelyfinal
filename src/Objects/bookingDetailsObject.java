
package Objects;

import java.time.LocalDate;

public class bookingDetailsObject {
  private int bookingID;
  private int userID;
  private int ticketID;
  private String dateBooked;

    public bookingDetailsObject(int bookingID, int userID, int ticketID, String dateBooked) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.ticketID = ticketID;
        this.dateBooked = dateBooked;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public String getDateBooked() {
        return dateBooked;
    }

    public void setDateBooked(String dateBooked) {
        this.dateBooked = dateBooked;
    }

    @Override
    public String toString() {
        return "bookingDetailsObject{" + "bookingID=" + bookingID + ", userID=" + userID + ", ticketID=" + ticketID + ", dateBooked=" + dateBooked + '}';
    }
    
}
