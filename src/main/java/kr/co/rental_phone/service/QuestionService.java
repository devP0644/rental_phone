package kr.co.rental_phone.service;

import kr.co.rental_phone.entity.domain.Question;
import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.entity.network.request.QuestionApiRequest;
import kr.co.rental_phone.entity.network.response.QuestionApiResponse;
import kr.co.rental_phone.service.baseService.BaseService;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService extends BaseService<QuestionApiRequest, QuestionApiResponse, Question> {
    @Override
    public Header<QuestionApiResponse> create(Header<QuestionApiRequest> request) {
        return null;
    }

    @Override
    public Header<QuestionApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<QuestionApiResponse> update(Header<QuestionApiRequest> request) {
        return null;
    }

    @Override
    public Header<QuestionApiResponse> delete(Long id) {
        return null;
    }

    @Override
    public Header<List<QuestionApiResponse>> search(Pageable pageable) {
        return null;
    }
}
