package kr.co.rental_phone.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum  PhoneStatus {
    AVAILABLE(1, "예약가능"),
    BOOKING(2, "예약"),
    RENTAL(3, "대여중");

    private int id;
    private String status;
}
