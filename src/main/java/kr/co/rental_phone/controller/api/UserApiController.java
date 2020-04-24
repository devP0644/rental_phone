package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.User;
import kr.co.rental_phone.entity.network.request.UserApiRequest;
import kr.co.rental_phone.entity.network.response.UserApiResponse;

public class UserApiController extends CrudController<UserApiRequest, UserApiResponse, User> {
}
