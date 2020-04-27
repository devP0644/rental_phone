package kr.co.rental_phone.ifs;

import kr.co.rental_phone.entity.network.Header;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CrudInterface<Req, Res> {
    Header<Res> create(Header<Req> request);

    Header<Res> read(Long id);

    Header<Res> update(Header<Req> request);

    Header<Res> delete(Long id);

    Header<List<Res>> search(Pageable pageable);

}
