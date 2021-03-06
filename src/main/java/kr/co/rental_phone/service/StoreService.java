package kr.co.rental_phone.service;

import kr.co.rental_phone.entity.domain.Store;
import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.entity.network.request.StoreApiRequest;
import kr.co.rental_phone.entity.network.response.StoreApiResponse;
import kr.co.rental_phone.service.baseService.BaseService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService extends BaseService<StoreApiRequest, StoreApiResponse, Store> {
    @Override
    public Header<StoreApiResponse> create(Header<StoreApiRequest> request) {
        return null;
    }

    @Override
    public Header<StoreApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<StoreApiResponse> update(Header<StoreApiRequest> request) {
        return null;
    }

    @Override
    public Header<StoreApiResponse> delete(Long id) {
        return null;
    }

    @Override
    public Header<List<StoreApiResponse>> search(Pageable pageable) {
        return null;
    }
}
