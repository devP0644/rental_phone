package kr.co.rental_phone.repository;

import kr.co.rental_phone.entity.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
