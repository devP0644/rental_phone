package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.Reservation;
import kr.co.rental_phone.entity.network.request.ReservationApiRequest;
import kr.co.rental_phone.entity.network.response.ReservationApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/reservation")
public class ReservationApiController extends CrudController<ReservationApiRequest, ReservationApiResponse, Reservation> {
}
