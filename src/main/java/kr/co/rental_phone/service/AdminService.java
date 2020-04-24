package kr.co.rental_phone.service;

import kr.co.rental_phone.entity.domain.Admin;
import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.entity.network.request.AdminApiRequest;
import kr.co.rental_phone.entity.network.response.AdminApiResponse;
import kr.co.rental_phone.service.baseService.BaseService;

public class AdminService extends BaseService<AdminApiRequest, AdminApiResponse, Admin> {
    @Override
    public Header<AdminApiResponse> create(Header<AdminApiRequest> request) {
        return null;
    }

    @Override
    public Header<AdminApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<AdminApiResponse> update(Header<AdminApiRequest> request) {
        return null;
    }

    @Override
    public Header<AdminApiResponse> delete(Long id) {
        return null;
    }
}
