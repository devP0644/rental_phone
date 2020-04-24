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
public class CallingPlanApiRequest {

    private Long no;
    private String name;
    private Long price;
    private Long data;
    private Long call;
    private Long message;
    private String option;
    private LocalDateTime created;
    private LocalDateTime updated;

}
