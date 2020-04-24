package kr.co.rental_phone.service;

import kr.co.rental_phone.entity.domain.CallingPlan;
import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.entity.network.request.CallingPlanApiRequest;
import kr.co.rental_phone.entity.network.response.CallingPlanApiResponse;
import kr.co.rental_phone.service.baseService.BaseService;

public class CallingPlanService extends BaseService<CallingPlanApiRequest, CallingPlanApiResponse, CallingPlan> {
    @Override
    public Header<CallingPlanApiResponse> create(Header<CallingPlanApiRequest> request) {
        return null;
    }

    @Override
    public Header<CallingPlanApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<CallingPlanApiResponse> update(Header<CallingPlanApiRequest> request) {
        return null;
    }

    @Override
    public Header<CallingPlanApiResponse> delete(Long id) {
        return null;
    }
}
