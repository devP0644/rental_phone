package kr.co.rental_phone.repository;

import kr.co.rental_phone.entity.domain.CallingPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallingPlanRepository extends JpaRepository<CallingPlan, Long> {
}
