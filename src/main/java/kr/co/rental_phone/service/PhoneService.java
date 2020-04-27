package kr.co.rental_phone.service;

import kr.co.rental_phone.entity.domain.Phone;
import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.entity.network.request.PhoneApiRequest;
import kr.co.rental_phone.entity.network.response.PhoneApiResponse;
import kr.co.rental_phone.service.baseService.BaseService;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class PhoneService extends BaseService<PhoneApiRequest, PhoneApiResponse, Phone> {
    @Override
    public Header<PhoneApiResponse> create(Header<PhoneApiRequest> request) {
        return null;
    }

    @Override
    public Header<PhoneApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<PhoneApiResponse> update(Header<PhoneApiRequest> request) {
        return null;
    }

    @Override
    public Header<PhoneApiResponse> delete(Long id) {
        return null;
    }

    @Override
    public Header<List<PhoneApiResponse>> search(Pageable pageable) {
        return null;
    }
}
