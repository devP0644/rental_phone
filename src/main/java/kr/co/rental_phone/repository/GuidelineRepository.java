package kr.co.rental_phone.repository;

import kr.co.rental_phone.entity.domain.Guideline;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuidelineRepository extends JpaRepository<Guideline, Long> {
}
