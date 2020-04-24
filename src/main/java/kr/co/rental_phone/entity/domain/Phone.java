package kr.co.rental_phone.entity.domain;

import kr.co.rental_phone.entity.baseTime.BaseTimeEntity;
import kr.co.rental_phone.entity.enums.PhoneStatus;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Phone extends BaseTimeEntity {

    @Id
    private Long no;
    private String kinds;
    private String tel;
    @Enumerated(EnumType.STRING)
    private PhoneStatus status;
    private Long price;
    private String picture;

}
