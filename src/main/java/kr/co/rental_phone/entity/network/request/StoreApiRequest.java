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
public class StoreApiRequest {

    private Long no;
    private String address;
    private String tel;
    private String admin;
    private LocalDateTime created;
    private LocalDateTime updated;

}
