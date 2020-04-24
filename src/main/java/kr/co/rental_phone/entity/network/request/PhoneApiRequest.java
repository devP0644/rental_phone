package kr.co.rental_phone.entity.network.request;

import kr.co.rental_phone.entity.enums.PhoneStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhoneApiRequest {

    private Long no;
    private String kinds;
    private String tel;
    private PhoneStatus status;
    private Long price;
    private String picture;
    private LocalDateTime created;
    private LocalDateTime updated;

}
