package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.Phone;
import kr.co.rental_phone.entity.network.request.PhoneApiRequest;
import kr.co.rental_phone.entity.network.response.PhoneApiResponse;

public class PhoneApiController extends CrudController<PhoneApiRequest, PhoneApiResponse, Phone> {
}
