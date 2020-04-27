package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.Store;
import kr.co.rental_phone.entity.network.request.StoreApiRequest;
import kr.co.rental_phone.entity.network.response.StoreApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/store")
public class StoreApiController extends CrudController<StoreApiRequest, StoreApiResponse, Store> {
}
