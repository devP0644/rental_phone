package kr.co.rental_phone.repository;

import kr.co.rental_phone.entity.domain.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
