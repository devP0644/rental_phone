package kr.co.rental_phone.repository;

import kr.co.rental_phone.entity.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
