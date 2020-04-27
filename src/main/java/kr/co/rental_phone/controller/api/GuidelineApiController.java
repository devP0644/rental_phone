package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.Guideline;
import kr.co.rental_phone.entity.network.request.GuidelineApiRequest;
import kr.co.rental_phone.entity.network.response.GuidelineApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/guide_line")
public class GuidelineApiController extends CrudController<GuidelineApiRequest, GuidelineApiResponse, Guideline> {
}
