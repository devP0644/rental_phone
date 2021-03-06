package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.Question;
import kr.co.rental_phone.entity.network.request.QuestionApiRequest;
import kr.co.rental_phone.entity.network.response.QuestionApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/question")
public class QuestionApiController extends CrudController<QuestionApiRequest, QuestionApiResponse, Question> {
}
