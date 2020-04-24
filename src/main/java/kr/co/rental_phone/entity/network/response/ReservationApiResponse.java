package kr.co.rental_phone.entity.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservationApiResponse {

    private Long no;
    private LocalDateTime rentalDate;
    private LocalDateTime returnDate;
    private LocalDateTime created;
    private LocalDateTime updated;
}
