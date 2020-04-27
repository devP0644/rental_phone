package kr.co.rental_phone.controller.api;

import kr.co.rental_phone.controller.CrudController;
import kr.co.rental_phone.entity.domain.CallingPlan;
import kr.co.rental_phone.entity.network.request.CallingPlanApiRequest;
import kr.co.rental_phone.entity.network.response.CallingPlanApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/calling_plan")
public class CallingPlanApiController extends CrudController<CallingPlanApiRequest, CallingPlanApiResponse, CallingPlan> {

}
