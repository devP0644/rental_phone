package kr.co.rental_phone.controller;

import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.ifs.CrudInterface;
import kr.co.rental_phone.service.baseService.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class CrudController<req, res, Entity> implements CrudInterface<req, res> {

    @Autowired(required = false)
    BaseService<req, res, Entity> baseService;

    @Override
    public Header<res> create(@RequestBody Header<req> request) {
        return baseService.create(request);
    }

    @Override
    public Header<res> read(@PathVariable Long id) {
        return baseService.read(id);
    }

    @Override
    public Header<res> update(@RequestBody Header<req> request) {
        return baseService.update(request);
    }

    @Override
    public Header<res> delete(@PathVariable Long id) {
        return baseService.delete(id);
    }
}
