package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.Admin;
import kr.co.rental_phone.entity.network.request.AdminApiRequest;
import kr.co.rental_phone.entity.network.response.AdminApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin")
public class AdminApiController extends CrudController<AdminApiRequest, AdminApiResponse, Admin> {
}
