package kr.co.rental_phone.repository;

import kr.co.rental_phone.entity.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
