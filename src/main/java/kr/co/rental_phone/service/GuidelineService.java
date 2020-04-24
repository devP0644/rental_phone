package kr.co.rental_phone.service;

import kr.co.rental_phone.entity.domain.Guideline;
import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.entity.network.request.GuidelineApiRequest;
import kr.co.rental_phone.entity.network.response.GuidelineApiResponse;
import kr.co.rental_phone.service.baseService.BaseService;

public class GuidelineService extends BaseService<GuidelineApiRequest, GuidelineApiResponse, Guideline> {
    @Override
    public Header<GuidelineApiResponse> create(Header<GuidelineApiRequest> request) {
        return null;
    }

    @Override
    public Header<GuidelineApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<GuidelineApiResponse> update(Header<GuidelineApiRequest> request) {
        return null;
    }

    @Override
    public Header<GuidelineApiResponse> delete(Long id) {
        return null;
    }
}
