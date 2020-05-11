package kr.co.rental_phone.service;

import kr.co.rental_phone.entity.domain.Review;
import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.entity.network.request.ReviewApiRequest;
import kr.co.rental_phone.entity.network.response.ReviewApiResponse;
import kr.co.rental_phone.service.baseService.BaseService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService extends BaseService<ReviewApiRequest, ReviewApiResponse, Review> {
    @Override
    public Header<ReviewApiResponse> create(Header<ReviewApiRequest> request) {
        return null;
    }

    @Override
    public Header<ReviewApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<ReviewApiResponse> update(Header<ReviewApiRequest> request) {
        return null;
    }

    @Override
    public Header<ReviewApiResponse> delete(Long id) {
        return null;
    }

    @Override
    public Header<List<ReviewApiResponse>> search(Pageable pageable) {
        return null;
    }
}
