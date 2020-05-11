package kr.co.rental_phone.service;

import kr.co.rental_phone.entity.domain.User;
import kr.co.rental_phone.entity.network.Header;
import kr.co.rental_phone.entity.network.request.UserApiRequest;
import kr.co.rental_phone.entity.network.response.UserApiResponse;
import kr.co.rental_phone.repository.UserRepository;
import kr.co.rental_phone.service.baseService.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService extends BaseService<UserApiRequest, UserApiResponse, User> {
    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {

        UserApiRequest createUser = request.getData();

        if(idCheck(createUser.getId())) {
            User user = new User();
            user.setId(createUser.getId())
                    .setPw(createUser.getPw())
                    .setName(createUser.getName())
                    .setEmail(createUser.getEmail())
                    .setAddress(createUser.getAddress());

            User newUser = baseRepository.save(user);

            return Header.OK(response(newUser));
        } else {
            return Header.ERROR("id 중복");
        }

    }

    @Override
    public Header<UserApiResponse> read(Long id) {
       return baseRepository.findById(id)
                .map(user -> response(user))
                .map(Header :: OK)
                .orElseGet(() -> Header.ERROR("데이터 없음"));
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {

        UserApiRequest userApiRequest = request.getData();

        return baseRepository.findById(userApiRequest.getNo())
                .map(user -> {
                    user.setId(userApiRequest.getId())
                            .setPw(userApiRequest.getPw())
                            .setName(userApiRequest.getName())
                            .setEmail(userApiRequest.getEmail())
                            .setAddress(userApiRequest.getAddress());

                    return user;
                })
                .map(user -> baseRepository.save(user))
                .map(updateUser -> response(updateUser))
                .map(Header::OK)
                .orElseGet(() -> Header.ERROR("데이터 없음"));
    }

    @Override
    public Header<UserApiResponse> delete(Long id) {
        return null;
    }

    @Override
    public Header<List<UserApiResponse>> search(Pageable pageable) {
        return null;
    }

    private boolean idCheck(String id) {

        UserRepository userRepository = (UserRepository)baseRepository;

        User user = userRepository.findById(id);

        return user == null;
    }

    private UserApiResponse response(User newUser) {
        UserApiResponse userApiResponse = UserApiResponse.builder()
                .no(newUser.getNo())
                .id(newUser.getId())
                .pw(newUser.getPw())
                .name(newUser.getName())
                .email(newUser.getEmail())
                .address(newUser.getAddress())
                .created(newUser.getCreated())
                .updated(newUser.getUpdated())
                .build();

        return userApiResponse;
    }
}
