package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.Review;
import kr.co.rental_phone.entity.network.request.ReviewApiRequest;
import kr.co.rental_phone.entity.network.response.ReviewApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/review")
public class ReviewApiController extends CrudController<ReviewApiRequest, ReviewApiResponse, Review> {
}
