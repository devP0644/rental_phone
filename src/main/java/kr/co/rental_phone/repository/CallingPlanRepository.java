package kr.co.rental_phone.repository;

import kr.co.rental_phone.entity.domain.CallingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallingPlanRepository extends JpaRepository<CallingPlan, Long> {
}
