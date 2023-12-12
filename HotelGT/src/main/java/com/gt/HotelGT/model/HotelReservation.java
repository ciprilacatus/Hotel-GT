package com.gt.HotelGT.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

@Entity
@Table(name = "HOTEL_RESERVATION")
public class HotelReservation implements Serializable {

    public HotelReservation() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String dateIn;
    private String dateOut;
    private String persons;
    private String rooms;


    public HotelReservation(long id, String dateIn, String dateOut, String persons, String rooms) {
        this.id = id;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.persons = persons;
        this.rooms = rooms;
    }

    public String getDateIn() {
        return dateIn;
    }

    public void setDateIn(String dateIn) {
        this.dateIn = dateIn;
    }

    public String getDateOut() {
        return dateOut;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getPersons() {
        return persons;
    }

    public void setPersons(String persons) {
        this.persons = persons;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }
}
