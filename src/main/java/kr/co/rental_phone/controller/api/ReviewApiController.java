package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.Review;
import kr.co.rental_phone.entity.network.request.ReviewApiRequest;
import kr.co.rental_phone.entity.network.response.ReviewApiResponse;

public class ReviewApiController extends CrudController<ReviewApiRequest, ReviewApiResponse, Review> {
}
