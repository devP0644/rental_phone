package kr.co.rental_phone.service;

import kr.co.rental_phone.entity.domain.Reservation;
import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.entity.network.request.ReservationApiRequest;
import kr.co.rental_phone.entity.network.response.ReservationApiResponse;
import kr.co.rental_phone.service.baseService.BaseService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService extends BaseService<ReservationApiRequest, ReservationApiResponse, Reservation> {
    @Override
    public Header<ReservationApiResponse> create(Header<ReservationApiRequest> request) {
        return null;
    }

    @Override
    public Header<ReservationApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<ReservationApiResponse> update(Header<ReservationApiRequest> request) {
        return null;
    }

    @Override
    public Header<ReservationApiResponse> delete(Long id) {
        return null;
    }

    @Override
    public Header<List<ReservationApiResponse>> search(Pageable pageable) {
        return null;
    }
}
