package com.metacoding.authblog;

import com.metacoding.authblog.user.User;
import com.metacoding.authblog.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.Optional;

@Import(UserRepository.class)
@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByUsername_test(){
        //given
        String username = "ssar";
        //when
        User user = userRepository.findByUsername(username);
        //then
        Assertions.assertThat(user).isNotNull();
       // Assertions.assertThat(user.isPresent()).isTrue();
    }

}
