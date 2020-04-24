package kr.co.rental_phone.entity.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservationApiRequest {

    private Long no;
    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;
    private LocalDateTime created;
    private LocalDateTime updated;

}
