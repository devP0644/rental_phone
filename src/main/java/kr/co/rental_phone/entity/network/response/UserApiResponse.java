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
public class UserApiResponse {

    private Long no;
    private String id;
    private String pw;
    private String name;
    private String address;
    private String email;
    private LocalDateTime created;
    private LocalDateTime updated;
}
