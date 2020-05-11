package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.User;
import kr.co.rental_phone.entity.network.request.UserApiRequest;
import kr.co.rental_phone.entity.network.response.UserApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse, User> {
}
