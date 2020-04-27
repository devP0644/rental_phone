package kr.co.rental_phone.service;

import kr.co.rental_phone.entity.domain.User;
import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.entity.network.request.UserApiRequest;
import kr.co.rental_phone.entity.network.response.UserApiResponse;
import kr.co.rental_phone.service.baseService.BaseService;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class UserService extends BaseService<UserApiRequest, UserApiResponse, User> {
    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {
        return null;
    }
    @Override
    public Header<UserApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header<UserApiResponse> delete(Long id) {
        return null;
    }

    @Override
    public Header<List<UserApiResponse>> search(Pageable pageable) {
        return null;
    }
}
