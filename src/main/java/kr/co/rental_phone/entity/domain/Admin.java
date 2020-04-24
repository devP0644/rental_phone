package kr.co.rental_phone.entity.domain;

import kr.co.rental_phone.entity.baseTime.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Admin extends BaseTimeEntity {

    @Id
    private Long no;
    private String id;
    private String pw;

}
