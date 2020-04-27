package kr.co.rental_phone.controller;

import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.ifs.CrudInterface;
import kr.co.rental_phone.service.baseService.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class CrudController<req, res, Entity> implements CrudInterface<req, res> {

    @Autowired(required = false)
    BaseService<req, res, Entity> baseService;

    @Override
    @PostMapping("")
    public Header<res> create(@RequestBody Header<req> request) {
        return baseService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<res> read(@PathVariable Long id) {
        return baseService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<res> update(@RequestBody Header<req> request) {
        return baseService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header<res> delete(@PathVariable Long id) {
        return baseService.delete(id);
    }

    @Override
    @GetMapping("")
    public Header<List<res>> search(@PageableDefault(sort = {"id"}, direction = Sort.Direction.ASC) Pageable pageable) { return baseService.search(pageable); }
}
