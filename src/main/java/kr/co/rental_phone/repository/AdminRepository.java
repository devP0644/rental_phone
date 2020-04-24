package kr.co.rental_phone.repository;

import kr.co.rental_phone.entity.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
