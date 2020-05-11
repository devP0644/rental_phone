package kr.co.rental_phone.entity.domain;

import kr.co.rental_phone.entity.baseTime.BaseTimeEntity;
import lombok.*;
import lombok.experimental.Accessors;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    private String id;
    private String pw;
    private String name;
    private String address;
    private String email;




}
