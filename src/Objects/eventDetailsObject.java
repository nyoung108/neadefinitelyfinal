
package Objects;

import java.time.LocalDate;
import java.time.LocalTime;

public class eventDetailsObject {
    int eventID;
    String eventName;
    String eventType;
    String date;
    String time;
    double eventPrice;
    eventDetailsObject newEvent;
    public eventDetailsObject(int eventID, String eventName, String eventType, String date, String time, double eventPrice) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventType = eventType;
        this.date = date;
        this.time = time;
        this.eventPrice = eventPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getEventPrice() {
        return eventPrice;
    }

    public void setEventPrice(double eventPrice) {
        this.eventPrice = eventPrice;
    }
   
    public void getEventObject(eventDetailsObject newEvent) {
       
    }
}
