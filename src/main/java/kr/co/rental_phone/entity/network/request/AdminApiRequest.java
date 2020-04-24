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
public class AdminApiRequest {

    private Long no;
    private String id;
    private String pw;
    private LocalDateTime created;
    private LocalDateTime updated;

}
