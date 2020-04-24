package kr.co.rental_phone.entity.domain;

import kr.co.rental_phone.entity.baseTime.BaseTimeEntity;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Reservation extends BaseTimeEntity {

    @Id
    private Long no;
    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;

}
