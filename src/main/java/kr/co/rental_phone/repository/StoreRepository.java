package kr.co.rental_phone.repository;

import kr.co.rental_phone.entity.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
    
}
