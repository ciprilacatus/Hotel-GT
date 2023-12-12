package com.gt.HotelGT.repository;

import com.gt.HotelGT.model.HotelReservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelReservationRepository extends JpaRepository<HotelReservation, Long> {

    HotelReservation findHotelReservationById(long id);
}
