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
public class GuidelineApiResponse {

    private Long no;
    private String category;
    private String title;
    private String content;
    private LocalDateTime created;
    private LocalDateTime updated;

}
