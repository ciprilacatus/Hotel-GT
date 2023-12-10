package com.gt.HotelGT.repository;

import com.gt.HotelGT.service.HotelReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.Set;


public interface HotelReservationRepository extends JpaRepository<HotelReservation, Long> {

    HotelReservation findHotelReservationById(long id);
}
