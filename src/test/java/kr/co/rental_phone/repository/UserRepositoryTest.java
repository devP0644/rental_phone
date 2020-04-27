package kr.co.rental_phone.repository;

import kr.co.rental_phone.RentalPhoneApplicationTests;
import kr.co.rental_phone.entity.domain.User;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;


public class UserRepositoryTest extends RentalPhoneApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();

        user.setId("test1")
            .setName("홍길동")
            .setPw("12345")
            .setAddress("서울")
            .setEmail("test@gmail.com")
            ;

        User newUser = userRepository.save(user);

        assertNotNull(newUser);

        assertEquals(newUser.getId(), user.getId());

    }

    @Test
    public void read() {
        String id = "test1";

        Optional<User> user = userRepository.findById(7L);

        user.ifPresent(selectUser -> {
            assertEquals(selectUser.getId(), id);
        });

    }

    @Test
    public void update() {
        Optional<User> user = userRepository.findById(7L);

        user.ifPresent(selectUser -> {
            selectUser.setPw("1234");

            User updateUser = userRepository.save(selectUser);

            assertEquals(updateUser.getPw(), "1234");
        });
    }
}