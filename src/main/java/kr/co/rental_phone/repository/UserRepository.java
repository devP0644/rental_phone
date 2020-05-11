package kr.co.rental_phone.repository;

import kr.co.rental_phone.entity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findById(String id);

}
